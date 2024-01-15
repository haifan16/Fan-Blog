package com.zenghaifan.blog.controller;

import com.zenghaifan.blog.dao.pojo.SysUser;
import com.zenghaifan.blog.utils.UserThreadLocal;
import com.zenghaifan.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
