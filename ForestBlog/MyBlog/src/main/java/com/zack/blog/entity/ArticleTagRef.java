package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章和标签关联
 *
 * @author ZACK
 * @date 2020/8/2 -- 15:30
 */
@Data
public class ArticleTagRef implements Serializable {

    private static final long serialVersionUID = -5982033104192069999L;

    private Integer articleId;

    private Integer tagId;

    public ArticleTagRef(Integer articleId, Integer tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public ArticleTagRef() {
    }
}
