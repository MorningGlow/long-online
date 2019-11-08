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
 * 表名：orders
 * 表注释：订单表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("订单表 ")
@Table(name = "`orders`")
public class Orders {
    /**
     * 订单主键 同时也是订单编号
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("订单主键 同时也是订单编号")
    private String id;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("用户id")
    private String userId;

    /**
     * 收货人快照
     */
    @Column(name = "`receiver_name`")
    @ApiModelProperty("收货人快照")
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    @Column(name = "`receiver_mobile`")
    @ApiModelProperty("收货人手机号快照")
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    @Column(name = "`receiver_address`")
    @ApiModelProperty("收货地址快照")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @Column(name = "`total_amount`")
    @ApiModelProperty("订单总价格")
    private Integer totalAmount;

    /**
     * 实际支付总价格
     */
    @Column(name = "`real_pay_amount`")
    @ApiModelProperty("实际支付总价格")
    private Integer realPayAmount;

    /**
     * 邮费 默认可以为零，代表包邮
     */
    @Column(name = "`post_amount`")
    @ApiModelProperty("邮费 默认可以为零，代表包邮")
    private Integer postAmount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    @Column(name = "`pay_method`")
    @ApiModelProperty("支付方式 1:微信 2:支付宝")
    private Integer payMethod;

    /**
     * 买家留言
     */
    @Column(name = "`left_msg`")
    @ApiModelProperty("买家留言")
    private String leftMsg;

    /**
     * 扩展字段
     */
    @Column(name = "`extand`")
    @ApiModelProperty("扩展字段")
    private String extand;

    /**
     * 买家是否评价 1：已评价，0：未评价
     */
    @Column(name = "`is_comment`")
    @ApiModelProperty("买家是否评价 1：已评价，0：未评价")
    private Integer isComment;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    @Column(name = "`is_delete`")
    @ApiModelProperty("逻辑删除状态 1: 删除 0:未删除")
    private Integer isDelete;

    /**
     * 创建时间（成交时间）
     */
    @Column(name = "`created_time`")
    @ApiModelProperty("创建时间（成交时间）")
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

    public static final String RECEIVER_NAME = "receiverName";

    public static final String DB_RECEIVER_NAME = "receiver_name";

    public static final String RECEIVER_MOBILE = "receiverMobile";

    public static final String DB_RECEIVER_MOBILE = "receiver_mobile";

    public static final String RECEIVER_ADDRESS = "receiverAddress";

    public static final String DB_RECEIVER_ADDRESS = "receiver_address";

    public static final String TOTAL_AMOUNT = "totalAmount";

    public static final String DB_TOTAL_AMOUNT = "total_amount";

    public static final String REAL_PAY_AMOUNT = "realPayAmount";

    public static final String DB_REAL_PAY_AMOUNT = "real_pay_amount";

    public static final String POST_AMOUNT = "postAmount";

    public static final String DB_POST_AMOUNT = "post_amount";

    public static final String PAY_METHOD = "payMethod";

    public static final String DB_PAY_METHOD = "pay_method";

    public static final String LEFT_MSG = "leftMsg";

    public static final String DB_LEFT_MSG = "left_msg";

    public static final String EXTAND = "extand";

    public static final String DB_EXTAND = "extand";

    public static final String IS_COMMENT = "isComment";

    public static final String DB_IS_COMMENT = "is_comment";

    public static final String IS_DELETE = "isDelete";

    public static final String DB_IS_DELETE = "is_delete";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static Orders defaultInstance() {
        Orders instance = new Orders();
        instance.postAmount = new Integer("0");
        instance.isDelete = new Integer("0");
        return instance;
    }
}