package com.luxshare.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 查询用户自己发的所有评论
 *
 * @author lion hua
 * @since 2019-11-14
 */
@Setter
@Getter
@Accessors(chain = true)
@ApiModel(value = "查询用户自己发的所有评论")
public class UserinfoWithItemContentVO {

    @ApiModelProperty(value = "用户名称")
    private String username;

    private String password;
    private String nickname;
    private String face;

    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    List<ItemContentVO> list;

}
