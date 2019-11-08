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
 * 表名：items_comments
 * 表注释：商品评价表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("商品评价表 ")
@Table(name = "`items_comments`")
public class ItemsComments {
    /**
     * id主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("id主键")
    private String id;

    /**
     * 用户id 用户名须脱敏
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("用户id 用户名须脱敏")
    private String userId;

    /**
     * 商品id
     */
    @Column(name = "`item_id`")
    @ApiModelProperty("商品id")
    private String itemId;

    /**
     * 商品名称
     */
    @Column(name = "`item_name`")
    @ApiModelProperty("商品名称")
    private String itemName;

    /**
     * 商品规格id 可为空
     */
    @Column(name = "`item_spec_id`")
    @ApiModelProperty("商品规格id 可为空")
    private String itemSpecId;

    /**
     * 规格名称 可为空
     */
    @Column(name = "`sepc_name`")
    @ApiModelProperty("规格名称 可为空")
    private String sepcName;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @Column(name = "`comment_level`")
    @ApiModelProperty("评价等级 1：好评 2：中评 3：差评")
    private Integer commentLevel;

    /**
     * 评价内容
     */
    @Column(name = "`content`")
    @ApiModelProperty("评价内容")
    private String content;

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

    public static final String USER_ID = "userId";

    public static final String DB_USER_ID = "user_id";

    public static final String ITEM_ID = "itemId";

    public static final String DB_ITEM_ID = "item_id";

    public static final String ITEM_NAME = "itemName";

    public static final String DB_ITEM_NAME = "item_name";

    public static final String ITEM_SPEC_ID = "itemSpecId";

    public static final String DB_ITEM_SPEC_ID = "item_spec_id";

    public static final String SEPC_NAME = "sepcName";

    public static final String DB_SEPC_NAME = "sepc_name";

    public static final String COMMENT_LEVEL = "commentLevel";

    public static final String DB_COMMENT_LEVEL = "comment_level";

    public static final String CONTENT = "content";

    public static final String DB_CONTENT = "content";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static ItemsComments defaultInstance() {
        ItemsComments instance = new ItemsComments();
        return instance;
    }
}