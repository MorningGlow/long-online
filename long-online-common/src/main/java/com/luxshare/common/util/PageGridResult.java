package com.luxshare.common.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 分页结果整合返回
 * @author lion hua
 * @since 2019-11-11
 */
@ApiModel(value = "分页结果集")
@Getter
@Setter
@Accessors(chain = true)
public class PageGridResult {

    // 当前页数
    @ApiModelProperty(value = "当前页数")
    private int page;
    // 总页数
    @ApiModelProperty(value = "总页数")
    private int total;
    // 总记录数
    @ApiModelProperty(value = "总记录数")
    private long records;
    // 每行显示的内容
    @ApiModelProperty(value = "数据集合(每行显示的内容)")
    private List<?> rows;
}
