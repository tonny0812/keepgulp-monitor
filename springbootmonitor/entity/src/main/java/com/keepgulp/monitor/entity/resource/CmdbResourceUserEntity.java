package com.keepgulp.monitor.entity.resource;
import com.asura.framework.base.entity.BaseEntity;


/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>
 * <BR>-----------------------------------------------
 * <BR>
 * </PRE>
 *
 * @author zhaozq14
 * @version 1.0
 * @date 2016-07-28 11:40:55
 * @since 1.0
 */
public class CmdbResourceUserEntity extends BaseEntity{
    private String lastModifyTime;

    private String groupsName;

    private String email;
    private String mobile;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGroupsName() {
        return groupsName;
    }

    public void setGroupsName(String groupsName) {
        this.groupsName = groupsName;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.user_id
     * Comment: 用户ID
     * @param userId the value for cmdb_resource_user.user_id
     */

    private Integer userId;


    /**
     * This field corresponds to the database column cmdb_resource_user.user_name
     * Comment: 用户名称
     * @param userName the value for cmdb_resource_user.user_name
     */

    private String userName;


    /**
     * This field corresponds to the database column cmdb_resource_user.groups_id
     * Comment: 业务线组
     * @param groupsId the value for cmdb_resource_user.groups_id
     */

    private Integer groupsId;


    /**
     * This field corresponds to the database column cmdb_resource_user.create_time
     * Comment: 创建时间
     * @param createTime the value for cmdb_resource_user.create_time
     */

    private Integer createTime;


    /**
     * This field corresponds to the database column cmdb_resource_user.create_user
     * Comment: 创建人
     * @param createUser the value for cmdb_resource_user.create_user
     */

    private String createUser;


    /**
     * This field corresponds to the database column cmdb_resource_user.last_modify_user
     * Comment: 最近修改 用户
     * @param lastModifyUser the value for cmdb_resource_user.last_modify_user
     */

    private String lastModifyUser;


    /**
     * This field corresponds to the database column cmdb_resource_user.user_id
     * Comment: 用户ID
     * @param userId the value for cmdb_resource_user.user_id
     */
    public void setUserId(Integer userId){
       this.userId = userId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.user_name
     * Comment: 用户名称
     * @param userName the value for cmdb_resource_user.user_name
     */
    public void setUserName(String userName){
       this.userName = userName;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.groups_id
     * Comment: 业务线组
     * @param groupsId the value for cmdb_resource_user.groups_id
     */
    public void setGroupsId(Integer groupsId){
       this.groupsId = groupsId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.create_time
     * Comment: 创建时间
     * @param createTime the value for cmdb_resource_user.create_time
     */
    public void setCreateTime(Integer createTime){
       this.createTime = createTime;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.create_user
     * Comment: 创建人
     * @param createUser the value for cmdb_resource_user.create_user
     */
    public void setCreateUser(String createUser){
       this.createUser = createUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.last_modify_user
     * Comment: 最近修改 用户
     * @param lastModifyUser the value for cmdb_resource_user.last_modify_user
     */
    public void setLastModifyUser(String lastModifyUser){
       this.lastModifyUser = lastModifyUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.user_id
     * Comment: 用户ID
     * @return the value of cmdb_resource_user.user_id
     */
     public Integer getUserId() {
        return userId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.user_name
     * Comment: 用户名称
     * @return the value of cmdb_resource_user.user_name
     */
     public String getUserName() {
        return userName;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.groups_id
     * Comment: 业务线组
     * @return the value of cmdb_resource_user.groups_id
     */
     public Integer getGroupsId() {
        return groupsId;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.create_time
     * Comment: 创建时间
     * @return the value of cmdb_resource_user.create_time
     */
     public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.create_user
     * Comment: 创建人
     * @return the value of cmdb_resource_user.create_user
     */
     public String getCreateUser() {
        return createUser;
    }

    /**
     * This field corresponds to the database column cmdb_resource_user.last_modify_user
     * Comment: 最近修改 用户
     * @return the value of cmdb_resource_user.last_modify_user
     */
     public String getLastModifyUser() {
        return lastModifyUser;
    }
}
