package com.zenghaifan.blog.service;

import com.zenghaifan.blog.vo.Result;
import com.zenghaifan.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章id 查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
