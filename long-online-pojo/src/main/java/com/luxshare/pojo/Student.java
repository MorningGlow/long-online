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
 * 表名：student
*/
@Getter
@Setter
@Accessors(chain = true)
@ApiModel(" ")
@Table(name = "`student`")
public class Student {
    /**
     * 学生ID
     */
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("学生ID")
    private String id;

    /**
     * 学生姓名
     */
    @Column(name = "`STUDENT_NAME`")
    @ApiModelProperty("学生姓名")
    private String studentName;

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

    public static final String DB_ID = "ID";

    public static final String STUDENT_NAME = "studentName";

    public static final String DB_STUDENT_NAME = "STUDENT_NAME";

    public static final String CREATED_TIME = "createdTime";

    public static final String DB_CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String DB_UPDATED_TIME = "updated_time";

    /**
     * 带默认值的实例
    */
    public static Student defaultInstance() {
        Student instance = new Student();
        return instance;
    }
}