package com.zenghaifan.controller;

import com.zenghaifan.domain.ResponseResult;
import com.zenghaifan.domain.entity.User;
import com.zenghaifan.enums.AppHttpCodeEnum;
import com.zenghaifan.exception.SystemException;
import com.zenghaifan.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogLoginController {

    @Autowired
    private BlogLoginService blogLoginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        if (!StringUtils.hasText(user.getUserName())) {
            // 提示 必须要传用户名
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        return blogLoginService.login(user);
    }
    @PostMapping("/logout")
    public ResponseResult logout(@RequestBody User user) {
        return blogLoginService.logout(user);
    }
}
