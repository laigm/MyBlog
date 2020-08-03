package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZACK
 * @date 2020/8/2 -- 17:03
 */
@Data
public class Tag implements Serializable {

    private static final long serialVersionUID = -8692874011215891714L;

    private Integer tagId;

    private String tagName;

    private String tagDescription;
}
