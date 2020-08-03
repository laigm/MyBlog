package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZACK
 * @date 2020/8/2 -- 16:42
 */
@Data
public class Notice implements Serializable {

    private static final long serialVersionUID = 3197019719425290658L;

    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private Date noteiceCreateTime;

    private Date noticeUpdateTime;

    private Integer noticeStatus;

    private Integer noticeOrder;
}
