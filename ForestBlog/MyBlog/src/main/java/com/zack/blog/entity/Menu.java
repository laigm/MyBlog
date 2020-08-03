package com.zack.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZACK
 * @date 2020/8/2 -- 16:26
 */
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 1735168594498037308L;

    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLeval;

    private String menuIcon;

    private Integer menuOrder;

}
