package com.zenghaifan.blog.controller;

import com.zenghaifan.blog.service.LoginService;
import com.zenghaifan.blog.vo.Result;
import com.zenghaifan.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
//    @Autowired
//    private SysUserService sysUserService;
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam){
        //登录 验证用户  访问用户表，但是
        return loginService.login(loginParam);
    }
}
