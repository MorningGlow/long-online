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

/**
 * 表名：order_items
 * 表注释：订单商品关联表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("订单商品关联表 ")
@Table(name = "`order_items`")
public class OrderItems {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("主键id")
    private String id;

    /**
     * 归属订单id
     */
    @Column(name = "`order_id`")
    @ApiModelProperty("归属订单id")
    private String orderId;

    /**
     * 商品id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品id")
    private String itemId;

    /**
     * 商品图片
     */
    @Column(name = "`item_img`")
    @ApiModelProperty("商品图片")
    private String itemImg;

    /**
     * 商品名称
     */
    @Column(name = "`item_name`")
    @ApiModelProperty("商品名称")
    private String itemName;

    /**
     * 规格id
     */
    @Column(name = "`item_spec_id`")
    @ApiModelProperty("规格id")
    private String itemSpecId;

    /**
     * 规格名称
     */
    @Column(name = "`item_spec_name`")
    @ApiModelProperty("规格名称")
    private String itemSpecName;

    /**
     * 成交价格
     */
    @Column(name = "`price`")
    @ApiModelProperty("成交价格")
    private Integer price;

    /**
     * 购买数量
     */
    @Column(name = "`buy_counts`")
    @ApiModelProperty("购买数量")
    private Integer buyCounts;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String ORDER_ID = "orderId";

    public static final String DB_ORDER_ID = "order_id";

    public static final String ITEM_ID = "itemId";

    public static final String DB_ITEM_ID = "item_id";

    public static final String ITEM_IMG = "itemImg";

    public static final String DB_ITEM_IMG = "item_img";

    public static final String ITEM_NAME = "itemName";

    public static final String DB_ITEM_NAME = "item_name";

    public static final String ITEM_SPEC_ID = "itemSpecId";

    public static final String DB_ITEM_SPEC_ID = "item_spec_id";

    public static final String ITEM_SPEC_NAME = "itemSpecName";

    public static final String DB_ITEM_SPEC_NAME = "item_spec_name";

    public static final String PRICE = "price";

    public static final String DB_PRICE = "price";

    public static final String BUY_COUNTS = "buyCounts";

    public static final String DB_BUY_COUNTS = "buy_counts";

    /**
     * 带默认值的实例
    */
    public static OrderItems defaultInstance() {
        OrderItems instance = new OrderItems();
        return instance;
    }
}