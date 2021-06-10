package com.sjh.user.controller;

import com.sjh.common.ReturnResult;
import com.sjh.user.entity.User;
import com.sjh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 13:52
 */
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${configtest}")
    private long configTest;

    @Autowired
    UserService userService;

    @GetMapping("getAllUser")
    public ReturnResult getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("getConfigTest")
    public long getConfigTest(){
        return configTest;
    }

    @PostMapping("addUser")
    public ReturnResult addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
