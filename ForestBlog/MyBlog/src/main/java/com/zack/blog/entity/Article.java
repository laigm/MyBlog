package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZACK
 * @date 2020/8/2 -- 17:14
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = -5131040463327484798L;

    private Integer articleId;

    private Integer articleUserId;

    private String articleTitle;

    private String articleContent;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Integer articleIsComment;

    private Integer articleStatus;

    private Integer articleOrder;

    private Date articleUpdateTime;

    private Date articleCreateTime;

    private String articleSummary;
}
