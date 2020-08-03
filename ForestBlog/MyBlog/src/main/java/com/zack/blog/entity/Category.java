package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZACK
 * @date 2020/8/2 -- 15:37
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 2514620047930752870L;

    private Integer categoryId;

    private Integer categoryPid;

    private String categoryName;

    private String categoryDescription;

    private Integer categoryOrder;

    private String categoryIcon;

    /**
     * 文章数量（非数据库字段）
     */
    private Integer articleCount;

    public Category() {
    }

    public Category(Integer categoryId, Integer categoryPid, String categoryName, String categoryDescription, Integer categoryOrder, String categoryIcon, Integer articleCount) {
        this.categoryId = categoryId;
        this.categoryPid = categoryPid;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryOrder = categoryOrder;
        this.categoryIcon = categoryIcon;
        this.articleCount = articleCount;
    }
}
