package com.jxf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxf.domain.ResponseResult;
import com.jxf.domain.entity.Article;

/**
 * @author JZJ
 * @date 2022/9/6 - 20:39
 */

public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();
}
