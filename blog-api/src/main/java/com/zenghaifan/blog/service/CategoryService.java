package com.zenghaifan.blog.service;

import com.zenghaifan.blog.vo.CategoryVo;
import com.zenghaifan.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
