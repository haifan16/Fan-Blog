package com.zenghaifan.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zenghaifan.domain.ResponseResult;
import com.zenghaifan.domain.entity.Link;

/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2024-01-04 13:23:24
 */
public interface LinkService extends IService<Link> {
    ResponseResult getAllLink();
}
