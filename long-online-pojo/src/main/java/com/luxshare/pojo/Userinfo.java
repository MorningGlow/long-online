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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 表名：userinfo
 * 表注释：用户表
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel("用户表 ")
@Table(name = "`userinfo`")
public class Userinfo {
    /**
     * 主键id 用户id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("主键id 用户id")
    private String id;

    /**
     * 用户名 用户名
     */
    @Column(name = "`username`")
    @ApiModelProperty("用户名 用户名")
    private String username;

    /**
     * 密码 密码
     */
    @Column(name = "`password`")
    @ApiModelProperty("密码 密码")
    private String password;

    /**
     * 昵称 昵称
     */
    @Column(name = "`nickname`")
    @ApiModelProperty("昵称 昵称")
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    @Column(name = "`realname`")
    @ApiModelProperty("真实姓名 真实姓名")
    private String realname;

    /**
     * 头像 头像
     */
    @Column(name = "`face`")
    @ApiModelProperty("头像 头像")
    private String face;

    /**
     * 手机号 手机号
     */
    @Column(name = "`mobile`")
    @ApiModelProperty("手机号 手机号")
    private String mobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @Column(name = "`email`")
    @ApiModelProperty("邮箱地址 邮箱地址")
    private String email;

    /**
     * 性别 性别 1:男  0:女  2:保密
     */
    @Column(name = "`sex`")
    @ApiModelProperty("性别 性别 1:男  0:女  2:保密")
    private Integer sex;

    /**
     * 生日 生日
     */
    @Column(name = "`birthday`")
    @ApiModelProperty("生日 生日")
    private LocalDate birthday;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "`created_time`")
    @ApiModelProperty("创建时间 创建时间")
    private LocalDateTime createdTime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "`updated_time`")
    @ApiModelProperty("更新时间 更新时间")
    private LocalDateTime updatedTime;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String USERNAME = "username";

    public static final String DB_USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String DB_PASSWORD = "password";

    public static final String NICKNAME = "nickname";

    public static final String DB_NICKNAME = "nickname";

    public static final String REALNAME = "realname";

    public static final String DB_REALNAME = "realname";

    public static final String FACE = "face";

    public static final String DB_FACE = "face";

    public static final String MOBILE = "mobile";

    public static final String DB_MOBILE = "mobile";

    public static final String EMAIL = "email";

    public static final String DB_EMAIL = "email";

    public static final String SEX = "sex";

    public static final String DB_SEX = "sex";

    public static final String BIRTHDAY = "birthday";

    public static final String DB_BIRTHDAY = "birthday";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static Userinfo defaultInstance() {
        Userinfo instance = new Userinfo();
        return instance;
    }
}