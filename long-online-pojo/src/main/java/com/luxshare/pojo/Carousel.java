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
 * 表名：carousel
 * 表注释：轮播图
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("轮播图 ")
@Table(name = "`carousel`")
public class Carousel {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("主键")
    private String id;

    /**
     * 图片 图片地址
     */
    @Column(name = "`image_url`")
    @ApiModelProperty("图片 图片地址")
    private String imageUrl;

    /**
     * 背景色 背景颜色
     */
    @Column(name = "`background_color`")
    @ApiModelProperty("背景色 背景颜色")
    private String backgroundColor;

    /**
     * 商品id 商品id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品id 商品id")
    private String itemId;

    /**
     * 商品分类id 商品分类id
     */
    @Column(name = "`cat_id`")
    @ApiModelProperty("商品分类id 商品分类id")
    private String catId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @Column(name = "`type`")
    @ApiModelProperty("轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    private Integer type;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    @Column(name = "`sort`")
    @ApiModelProperty("轮播图展示顺序 轮播图展示顺序，从小到大")
    private Integer sort;

    /**
     * 是否展示 是否展示，1：展示    0：不展示
     */
    @Column(name = "`is_show`")
    @ApiModelProperty("是否展示 是否展示，1：展示    0：不展示")
    private Integer isShow;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "`create_time`")
    @ApiModelProperty("创建时间 创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间 更新
     */
    @Column(name = "`update_time`")
    @ApiModelProperty("更新时间 更新")
    private LocalDateTime updateTime;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String IMAGE_URL = "imageUrl";

    public static final String DB_IMAGE_URL = "image_url";

    public static final String BACKGROUND_COLOR = "backgroundColor";

    public static final String DB_BACKGROUND_COLOR = "background_color";

    public static final String ITEM_ID = "itemId";

    public static final String DB_ITEM_ID = "item_id";

    public static final String CAT_ID = "catId";

    public static final String DB_CAT_ID = "cat_id";

    public static final String TYPE = "type";

    public static final String DB_TYPE = "type";

    public static final String SORT = "sort";

    public static final String DB_SORT = "sort";

    public static final String IS_SHOW = "isShow";

    public static final String DB_IS_SHOW = "is_show";

    public static final String CREATE_TIME = "createTime";

    public static final String DB_CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "updateTime";

    public static final String DB_UPDATE_TIME = "update_time";

    /**
     * 带默认值的实例
    */
    public static Carousel defaultInstance() {
        Carousel instance = new Carousel();
        return instance;
    }
}