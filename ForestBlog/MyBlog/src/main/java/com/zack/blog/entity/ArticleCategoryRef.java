package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章分类关联表
 *
 * @author ZACK
 * @date 2020/8/2 -- 15:25
 */
@Data
public class ArticleCategoryRef implements Serializable {

    private static final long serialVersionUID = 730971768469566881L;

    private Integer articleId;

    private Integer categoryId;

    public ArticleCategoryRef() {
    }

    public ArticleCategoryRef(Integer articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}
