package com.keepgulp.monitor.web;

import com.keepgulp.monitor.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @GetMapping("list")
    public List<User> list() {
        try {
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
