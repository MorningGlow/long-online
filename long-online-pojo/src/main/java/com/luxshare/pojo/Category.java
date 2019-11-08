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
 * 表名：category
 * 表注释：商品分类
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品分类 ")
@Table(name = "`category`")
public class Category {
    /**
     * 主键 分类id主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("主键 分类id主键")
    private Integer id;

    /**
     * 分类名称 分类名称
     */
    @Column(name = "`name`")
    @ApiModelProperty("分类名称 分类名称")
    private String name;

    /**
     * 分类类型 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    @Column(name = "`type`")
    @ApiModelProperty("分类类型 分类得类型，1:一级大分类2:二级分类3:三级小分类")
    private Integer type;

    /**
     * 父id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @Column(name = "`father_id`")
    @ApiModelProperty("父id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级")
    private Integer fatherId;

    /**
     * 图标 logo
     */
    @Column(name = "`logo`")
    @ApiModelProperty("图标 logo")
    private String logo;

    /**
     * 口号
     */
    @Column(name = "`slogan`")
    @ApiModelProperty("口号")
    private String slogan;

    /**
     * 分类图
     */
    @Column(name = "`cat_image`")
    @ApiModelProperty("分类图")
    private String catImage;

    /**
     * 背景颜色
     */
    @Column(name = "`bg_color`")
    @ApiModelProperty("背景颜色")
    private String bgColor;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String NAME = "name";

    public static final String DB_NAME = "name";

    public static final String TYPE = "type";

    public static final String DB_TYPE = "type";

    public static final String FATHER_ID = "fatherId";

    public static final String DB_FATHER_ID = "father_id";

    public static final String LOGO = "logo";

    public static final String DB_LOGO = "logo";

    public static final String SLOGAN = "slogan";

    public static final String DB_SLOGAN = "slogan";

    public static final String CAT_IMAGE = "catImage";

    public static final String DB_CAT_IMAGE = "cat_image";

    public static final String BG_COLOR = "bgColor";

    public static final String DB_BG_COLOR = "bg_color";

    /**
     * 带默认值的实例
    */
    public static Category defaultInstance() {
        Category instance = new Category();
        return instance;
    }
}