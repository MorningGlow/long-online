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
import java.time.LocalDateTime;

/**
 * 表名：items
 * 表注释：商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表")
@Table(name = "`items`")
public class Items {
    /**
     * 商品主键id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("商品主键id")
    private String id;

    /**
     * 商品名称 商品名称
     */
    @Column(name = "`item_name`")
    @ApiModelProperty("商品名称 商品名称")
    private String itemName;

    /**
     * 分类外键id 分类id
     */
    @Column(name = "`cat_id`")
    @ApiModelProperty("分类外键id 分类id")
    private Integer catId;

    /**
     * 一级分类外键id 一级分类id，用于优化查询
     */
    @Column(name = "`root_cat_id`")
    @ApiModelProperty("一级分类外键id 一级分类id，用于优化查询")
    private Integer rootCatId;

    /**
     * 累计销售 累计销售
     */
    @Column(name = "`sell_counts`")
    @ApiModelProperty("累计销售 累计销售")
    private Integer sellCounts;

    /**
     * 上下架状态 上下架状态,1:上架 2:下架
     */
    @Column(name = "`on_off_status`")
    @ApiModelProperty("上下架状态 上下架状态,1:上架 2:下架")
    private Integer onOffStatus;

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

    /**
     * 商品内容 商品内容
     */
    @Column(name = "`content`")
    @ApiModelProperty("商品内容 商品内容")
    private String content;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String ITEM_NAME = "itemName";

    public static final String DB_ITEM_NAME = "item_name";

    public static final String CAT_ID = "catId";

    public static final String DB_CAT_ID = "cat_id";

    public static final String ROOT_CAT_ID = "rootCatId";

    public static final String DB_ROOT_CAT_ID = "root_cat_id";

    public static final String SELL_COUNTS = "sellCounts";

    public static final String DB_SELL_COUNTS = "sell_counts";

    public static final String ON_OFF_STATUS = "onOffStatus";

    public static final String DB_ON_OFF_STATUS = "on_off_status";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    public static final String CONTENT = "content";

    public static final String DB_CONTENT = "content";

    /**
     * 带默认值的实例
    */
    public static Items defaultInstance() {
        Items instance = new Items();
        return instance;
    }
}