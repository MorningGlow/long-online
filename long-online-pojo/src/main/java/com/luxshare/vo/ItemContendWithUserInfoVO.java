package com.luxshare.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 商品内容与用户信息
 *
 * @author lion hua
 * @since 2019-11-11
 */
@Setter
@Getter
@Accessors(chain = true)
public class ItemContendWithUserInfoVO {

    private String id;
    private String itemId;
    private String specName;
    private String content;
    private String username;

}
