package com.zenghaifan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zenghaifan.domain.ResponseResult;
import com.zenghaifan.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);
}
