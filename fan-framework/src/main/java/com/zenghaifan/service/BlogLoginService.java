package com.zenghaifan.service;

import com.zenghaifan.domain.ResponseResult;
import com.zenghaifan.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout(User user);
}
