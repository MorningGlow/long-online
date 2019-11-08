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
 * 表名：items_param
 * 表注释：商品参数
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品参数 ")
@Table(name = "`items_param`")
public class ItemsParam {
    /**
     * 商品参数id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("商品参数id")
    private String id;

    /**
     * 商品外键id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品外键id")
    private String itemId;

    /**
     * 产地 产地，例：中国江苏
     */
    @Column(name = "`produc_place`")
    @ApiModelProperty("产地 产地，例：中国江苏")
    private String producPlace;

    /**
     * 保质期 保质期，例：180天
     */
    @Column(name = "`foot_period`")
    @ApiModelProperty("保质期 保质期，例：180天")
    private String footPeriod;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    @Column(name = "`brand`")
    @ApiModelProperty("品牌名 品牌名，例：三只大灰狼")
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @Column(name = "`factory_name`")
    @ApiModelProperty("生产厂名 生产厂名，例：大灰狼工厂")
    private String factoryName;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @Column(name = "`factory_address`")
    @ApiModelProperty("生产厂址 生产厂址，例：大灰狼生产基地")
    private String factoryAddress;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @Column(name = "`packaging_method`")
    @ApiModelProperty("包装方式 包装方式，例：袋装")
    private String packagingMethod;

    /**
     * 规格重量 规格重量，例：35g
     */
    @Column(name = "`weight`")
    @ApiModelProperty("规格重量 规格重量，例：35g")
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @Column(name = "`storage_method`")
    @ApiModelProperty("存储方法 存储方法，例：常温5~25°")
    private String storageMethod;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @Column(name = "`eat_method`")
    @ApiModelProperty("食用方式 食用方式，例：开袋即食")
    private String eatMethod;

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

    public static final String PRODUC_PLACE = "producPlace";

    public static final String DB_PRODUC_PLACE = "produc_place";

    public static final String FOOT_PERIOD = "footPeriod";

    public static final String DB_FOOT_PERIOD = "foot_period";

    public static final String BRAND = "brand";

    public static final String DB_BRAND = "brand";

    public static final String FACTORY_NAME = "factoryName";

    public static final String DB_FACTORY_NAME = "factory_name";

    public static final String FACTORY_ADDRESS = "factoryAddress";

    public static final String DB_FACTORY_ADDRESS = "factory_address";

    public static final String PACKAGING_METHOD = "packagingMethod";

    public static final String DB_PACKAGING_METHOD = "packaging_method";

    public static final String WEIGHT = "weight";

    public static final String DB_WEIGHT = "weight";

    public static final String STORAGE_METHOD = "storageMethod";

    public static final String DB_STORAGE_METHOD = "storage_method";

    public static final String EAT_METHOD = "eatMethod";

    public static final String DB_EAT_METHOD = "eat_method";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static ItemsParam defaultInstance() {
        ItemsParam instance = new ItemsParam();
        return instance;
    }
}