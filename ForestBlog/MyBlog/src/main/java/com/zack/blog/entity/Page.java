package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZACK
 * @date 2020/8/2 -- 16:57
 */
@Data
public class Page implements Serializable {

    private static final long serialVersionUID = 2175570983572670678L;

    private Integer pageId;

    private String pageKey;

    private String pageTitle;

    private String pageContent;

    private Date pageCreateTime;

    private Date pageUpdateTime;

    private Integer pageViewCount;

    private Integer pageCommentCount;

    private Integer pageStatus;
}
