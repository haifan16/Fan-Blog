package com.zenghaifan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zenghaifan.domain.ResponseResult;
import com.zenghaifan.domain.entity.Category;

/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2024-01-03 22:16:05
 */
public interface CategoryService extends IService<Category> {
    ResponseResult getCategoryList();
}
