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
 * 表名：user_address
 * 表注释：用户地址表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("用户地址表 ")
@Table(name = "`user_address`")
public class UserAddress {
    /**
     * 地址主键id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("地址主键id")
    private String id;

    /**
     * 关联用户id
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("关联用户id")
    private String userId;

    /**
     * 收件人姓名
     */
    @Column(name = "`receiver`")
    @ApiModelProperty("收件人姓名")
    private String receiver;

    /**
     * 收件人手机号
     */
    @Column(name = "`mobile`")
    @ApiModelProperty("收件人手机号")
    private String mobile;

    /**
     * 省份
     */
    @Column(name = "`province`")
    @ApiModelProperty("省份")
    private String province;

    /**
     * 城市
     */
    @Column(name = "`city`")
    @ApiModelProperty("城市")
    private String city;

    /**
     * 区县
     */
    @Column(name = "`district`")
    @ApiModelProperty("区县")
    private String district;

    /**
     * 详细地址
     */
    @Column(name = "`detail`")
    @ApiModelProperty("详细地址")
    private String detail;

    /**
     * 扩展字段
     */
    @Column(name = "`extand`")
    @ApiModelProperty("扩展字段")
    private String extand;

    /**
     * 是否默认地址 1:是  0:否
     */
    @Column(name = "`is_default`")
    @ApiModelProperty("是否默认地址 1:是  0:否")
    private Integer isDefault;

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

    public static final String RECEIVER = "receiver";

    public static final String DB_RECEIVER = "receiver";

    public static final String MOBILE = "mobile";

    public static final String DB_MOBILE = "mobile";

    public static final String PROVINCE = "province";

    public static final String DB_PROVINCE = "province";

    public static final String CITY = "city";

    public static final String DB_CITY = "city";

    public static final String DISTRICT = "district";

    public static final String DB_DISTRICT = "district";

    public static final String DETAIL = "detail";

    public static final String DB_DETAIL = "detail";

    public static final String EXTAND = "extand";

    public static final String DB_EXTAND = "extand";

    public static final String IS_DEFAULT = "isDefault";

    public static final String DB_IS_DEFAULT = "is_default";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static UserAddress defaultInstance() {
        UserAddress instance = new UserAddress();
        return instance;
    }
}