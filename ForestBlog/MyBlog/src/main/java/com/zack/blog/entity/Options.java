package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZACK
 * @date 2020/8/2 -- 16:49
 */
@Data
public class Options implements Serializable {

    private static final long serialVersionUID = 638360523912479538L;

    private Integer optionId;

    private String optionSiteTitle;

    private String optionSiteDescription;

    private String optionMetaDescription;

    private String optionMetaKeyword;

    private String optionAboutsiteAvater;

    private String optionAboutsiteTitle;

    private String optionAboutsiteContent;

    private String optionAboutsiteWechat;

    private String optionAboutsiteQq;

    private String optionAboutsiteGithub;

    private String optionAboutsiteWeibo;

    private String optionTongji;

    private String optionStatus;
}
