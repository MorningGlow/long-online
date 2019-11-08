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
 * 表名：items_img
 * 表注释：商品图片
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品图片 ")
@Table(name = "`items_img`")
public class ItemsImg {
    /**
     * 图片主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("图片主键")
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品外键id 商品外键id")
    private String itemId;

    /**
     * 图片地址 图片地址
     */
    @Column(name = "`url`")
    @ApiModelProperty("图片地址 图片地址")
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    @Column(name = "`sort`")
    @ApiModelProperty("顺序 图片顺序，从小到大")
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @Column(name = "`is_main`")
    @ApiModelProperty("是否主图 是否主图，1：是，0：否")
    private Integer isMain;

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

    public static final String URL = "url";

    public static final String DB_URL = "url";

    public static final String SORT = "sort";

    public static final String DB_SORT = "sort";

    public static final String IS_MAIN = "isMain";

    public static final String DB_IS_MAIN = "is_main";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static ItemsImg defaultInstance() {
        ItemsImg instance = new ItemsImg();
        return instance;
    }
}