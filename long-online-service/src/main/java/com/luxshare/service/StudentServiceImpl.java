package com.luxshare.service;

import com.luxshare.common.service.impl.BaseServiceImpl;
import com.luxshare.pojo.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 通用 ServiceImpl 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 15:33:33
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

    @Override
    public void saveParent() {
        Student student = Student.defaultInstance();
        student.setId("1")
                .setStudentName("保存parent")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now());
        this.mapper.insert(student);
    }

    @Override
    public void saveChildren() {
        saveChildren1();

        int a = 1 / 0;

        saveChildren2();
    }

    @Override
    public void saveChildren1() {
        Student student = Student.defaultInstance();
        this.mapper.insert(student.setId("2")
                .setStudentName("保存children1")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));
    }

    @Override
    public void saveChildren2() {
        Student student = Student.defaultInstance();
        this.mapper.insert(student.setId("3")
                .setStudentName("保存children2")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));
    }
}




