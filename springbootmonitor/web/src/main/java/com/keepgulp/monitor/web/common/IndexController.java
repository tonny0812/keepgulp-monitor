package com.keepgulp.monitor.web.common;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.common.utils.DateUtil;
import com.keepgulp.monitor.common.utils.Md5Util;
import com.keepgulp.monitor.common.utils.RedisUtil;
import com.keepgulp.monitor.entity.common.AuthorityUserEntity;
import com.keepgulp.monitor.entity.common.LoginEntity;
import com.keepgulp.monitor.service.common.AuthorityUserService;
import com.keepgulp.monitor.web.common.response.PageResponse;
import com.keepgulp.monitor.web.common.response.ResponseVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 */
@Controller
public class IndexController {

    @Resource
    private AuthorityUserService userService;

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "monitor/global/newIndex";
    }

//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    /**
     * 用户管理页面
     * @return
     */
    @RequestMapping("user/list")
    public String userList(){
        return "/index/userlist";
    }

    /**
     * 修改密码页面
     * @return
     */
    @RequestMapping("reset/password")
    public String password(HttpServletRequest request, Model model){
        String user = user(request);
        model.addAttribute("user", user);
        return "index/password";
    }

    /**
     * 删除用户
     * @param request
     * @param username
     * @return
     */
    @RequestMapping("reset/userSaveDelete")
    @ResponseBody
    public String userSaveDelete(HttpServletRequest request, String username){
        String user = user(request);
        if (user.equals("admin") && ! username.equals("admin")){
            AuthorityUserEntity entity = new AuthorityUserEntity();
            entity.setUsername(username);
            userService.delete(entity);
        }else{
            return "必须由admin账号操作";
        }
        return "ok";
    }

    /**
     * 修改密码
     */
    @RequestMapping(value = "reset/save/password",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public ResponseVo resetPassword(String newPassword, String oldPassword, String username, HttpServletRequest request){
        String user = user(request);
        if(user.length()<1){
            return ResponseVo.responseError("请登陆后操作");
        }
        // 修改自己的密码
        if(username.equals(user) && ! oldPassword.equals("")) {
            SearchMap searchMap = new SearchMap();
            searchMap.put("username", user);
            searchMap.put("password", Md5Util.MD5(oldPassword).toLowerCase());

            Pageable pageable = new PageResponse();

            Page<AuthorityUserEntity> result = userService.findAll(searchMap, pageable);
            if (result.getTotalElements() > 0) {
                AuthorityUserEntity entity = result.getContent().get(0);
                entity.setPassword(Md5Util.MD5(newPassword).toLowerCase());
                userService.update(entity);
                logSave(request, "修改密码 " + user);
                return ResponseVo.responseOk("修改密码完成");
            }
        }
        // 管理员添加用户
        if (user.equals("admin") && oldPassword.equals("") ){
            AuthorityUserEntity entity = new AuthorityUserEntity();
            entity.setPassword(Md5Util.MD5(newPassword));
            entity.setUsername(username);
            try {
                userService.save(entity);
            }catch (Exception e){
                userService.update(entity);
            }
            return ResponseVo.responseOk("修改密码或添加用户完成");
        }
        return ResponseVo.responseError("操作失败");
    }

    /**
     * 登陆提示
     * @return
     */
    @RequestMapping(value = "islogin", produces = {"application/json;charset=utf-8"})
    public String islogin(){
        return "/index/islogin";
    }

    /**
     * 没有权限
     * @return
     */
    @RequestMapping(value = "/noPermissions", produces = {"application/json;charset=utf-8"})
    public String noPermissions(){
        return "/index/noPermissions";
    }

    /**
     * 获取登陆的用户
     * @param request
     * @return
     */
    @RequestMapping("user")
    @ResponseBody
    public String user(HttpServletRequest request){
        String sessionId = request.getSession().getId();
        Gson gson = new Gson();
        RedisUtil redisUtil = new RedisUtil();
        String result = redisUtil.get(sessionId);
        if (result!=null&&result.length()>0){
            LoginEntity entity = gson.fromJson(result, LoginEntity.class);
            return entity.getUsername();
        }
        return "";
    }

    /**
     * 登陆页面
     * @return
     */
    @RequestMapping("/loginPage")
    public String loginPage(){
        return "index/login";
    }

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping("/loginOut.do")
    public String loginOut(HttpServletRequest request){
        String sessionId = request.getSession().getId();
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.del(sessionId);
        return "index/login";
    }

    /*
       * 登陆验证数据
       */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String login(String username, String  password, HttpServletRequest request) {
        boolean loginFlag = false;
        RedisUtil redisUtil = new RedisUtil();
        String sessionId = request.getSession().getId();
        // 数据库本地验证
        LoginEntity loginEntity = new LoginEntity();
        SearchMap searchMap = new SearchMap();
        searchMap.put("username", username);
        searchMap.put("password", Md5Util.MD5(password).toLowerCase());
        AuthorityUserEntity entity = new AuthorityUserEntity();
        entity.setLastLogin(DateUtil.getCurrentDate());
        Pageable pageable = new PageResponse();
        Page<AuthorityUserEntity> result = userService.findAll(searchMap, pageable);
        if (result.getTotalElements() >0  && result.getContent().get(0)!=null){
            entity.setLoginFaildCount(0);
            userService.update(entity);
            loginFlag = true;
        }
        if (loginFlag) {
            loginEntity.setUsername(username);
            loginEntity.setLoginTime(DateUtil.getDate(DateUtil.TIME_FORMAT));
//            redisUtil.setex(sessionId, 86400, JSON.toJSONString(loginEntity));
            return "true";
        }
        return "用户名或者密码错误";
    }

    /**
     *
     * @param request
     * @param info
     */
    @RequestMapping("/log")
    @ResponseBody
    public String logSave(HttpServletRequest request, String info){
        try {
//            HttpSession session = request.getSession();
//            String user = permissionsCheck.getLoginUser(session);
//            String clientIp = HttpClientIpAddress.getIpAddr(request);
//            AuthorityLogEntity entity = new AuthorityLogEntity();
//            entity.setUser(user);
//            entity.setIp(clientIp);
//            entity.setInfo(info);
//            entity.setTime((DateUtil.getTimeStamp()));
//            logService.save(entity);
        }catch (Exception e){
             e.printStackTrace();
        }
        return "ok";
    }


    /**
     * 列表数据
     * @return
     */
    @RequestMapping(value = "/user/userListData", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String listData(int draw, int start, int length, HttpServletRequest request) {
        String key = request.getParameter("search[value]");
        SearchMap searchMap = new SearchMap();
        if (key!=null&&key.length()>0){
            searchMap.put("key", key);
        }
        Pageable pageable = new PageResponse();
        Page<AuthorityUserEntity> result = userService.findAll(searchMap, pageable);
        return JSON.toJSONString(result);
    }

}