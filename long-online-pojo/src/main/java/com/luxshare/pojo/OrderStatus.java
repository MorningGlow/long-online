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
 * 表名：order_status
 * 表注释：订单状态表 订单的每个状态更改都需要进行记录
 *         10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）
 *         退货/退货，此分支流程不做，所以不加入
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("订单状态表 订单的每个状态更改都需要进行记录10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）退货/退货，此分支流程不做，所以不加入")
@Table(name = "`order_status`")
public class OrderStatus {
    /**
     * 订单ID 对应订单表的主键id
     */
    @Id
    @Column(name = "`order_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("订单ID 对应订单表的主键id")
    private String orderId;

    /**
     * 订单状态
     */
    @Column(name = "`order_status`")
    @ApiModelProperty("订单状态")
    private Integer orderStatus;

    /**
     * 订单创建时间 对应[10:待付款]状态
     */
    @Column(name = "`created_time`")
    @ApiModelProperty("订单创建时间 对应[10:待付款]状态")
    private LocalDateTime createdTime;

    /**
     * 支付成功时间 对应[20:已付款，待发货]状态
     */
    @Column(name = "`pay_time`")
    @ApiModelProperty("支付成功时间 对应[20:已付款，待发货]状态")
    private LocalDateTime payTime;

    /**
     * 发货时间 对应[30：已发货，待收货]状态
     */
    @Column(name = "`deliver_time`")
    @ApiModelProperty("发货时间 对应[30：已发货，待收货]状态")
    private LocalDateTime deliverTime;

    /**
     * 交易成功时间 对应[40：交易成功]状态
     */
    @Column(name = "`success_time`")
    @ApiModelProperty("交易成功时间 对应[40：交易成功]状态")
    private LocalDateTime successTime;

    /**
     * 交易关闭时间 对应[50：交易关闭]状态
     */
    @Column(name = "`close_time`")
    @ApiModelProperty("交易关闭时间 对应[50：交易关闭]状态")
    private LocalDateTime closeTime;

    /**
     * 留言时间 用户在交易成功后的留言时间
     */
    @Column(name = "`comment_time`")
    @ApiModelProperty("留言时间 用户在交易成功后的留言时间")
    private LocalDateTime commentTime;

    public static final String ORDER_ID = "orderId";

    public static final String DB_ORDER_ID = "order_id";

    public static final String ORDER_STATUS = "orderStatus";

    public static final String DB_ORDER_STATUS = "order_status";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String PAY_TIME = "payTime";

    public static final String DB_PAY_TIME = "pay_time";

    public static final String DELIVER_TIME = "deliverTime";

    public static final String DB_DELIVER_TIME = "deliver_time";

    public static final String SUCCESS_TIME = "successTime";

    public static final String DB_SUCCESS_TIME = "success_time";

    public static final String CLOSE_TIME = "closeTime";

    public static final String DB_CLOSE_TIME = "close_time";

    public static final String COMMENT_TIME = "commentTime";

    public static final String DB_COMMENT_TIME = "comment_time";

    /**
     * 带默认值的实例
    */
    public static OrderStatus defaultInstance() {
        OrderStatus instance = new OrderStatus();
        return instance;
    }
}