package com.zenghaifan.blog.service;

import com.zenghaifan.blog.dao.pojo.SysUser;
import com.zenghaifan.blog.vo.Result;
import com.zenghaifan.blog.vo.params.LoginParam;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);
}
