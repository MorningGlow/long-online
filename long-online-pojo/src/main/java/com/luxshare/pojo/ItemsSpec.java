package com.luxshare.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 表名：items_spec
 * 表注释：商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计")
@Table(name = "`items_spec`")
public class ItemsSpec {
    /**
     * 商品规格id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("商品规格id")
    private String id;

    /**
     * 商品外键id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品外键id")
    private String itemId;

    /**
     * 规格名称
     */
    @Column(name = "`name`")
    @ApiModelProperty("规格名称")
    private String name;

    /**
     * 库存
     */
    @Column(name = "`stock`")
    @ApiModelProperty("库存")
    private Integer stock;

    /**
     * 折扣力度
     */
    @Column(name = "`discounts`")
    @ApiModelProperty("折扣力度")
    private BigDecimal discounts;

    /**
     * 优惠价
     */
    @Column(name = "`price_discount`")
    @ApiModelProperty("优惠价")
    private Integer priceDiscount;

    /**
     * 原价
     */
    @Column(name = "`price_normal`")
    @ApiModelProperty("原价")
    private Integer priceNormal;

    /**
     * 创建时间
     */
    @Column(name = "`created_time`")
    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @Column(name = "`updated_time`")
    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String ITEM_ID = "itemId";

    public static final String DB_ITEM_ID = "item_id";

    public static final String NAME = "name";

    public static final String DB_NAME = "name";

    public static final String STOCK = "stock";

    public static final String DB_STOCK = "stock";

    public static final String DISCOUNTS = "discounts";

    public static final String DB_DISCOUNTS = "discounts";

    public static final String PRICE_DISCOUNT = "priceDiscount";

    public static final String DB_PRICE_DISCOUNT = "price_discount";

    public static final String PRICE_NORMAL = "priceNormal";

    public static final String DB_PRICE_NORMAL = "price_normal";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static ItemsSpec defaultInstance() {
        ItemsSpec instance = new ItemsSpec();
        return instance;
    }
}