package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Student;
import com.luxshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 15:33:33
*/
@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public BaseResult<Student> getOne(@PathVariable String id) {
        return BaseResult.ok(studentService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Student> updateOne(@PathVariable String id, @RequestBody Student student) {
        student.setId(id);
        studentService.updateByPrimaryKey(student);
        return BaseResult.ok(student);
    }

    @PostMapping("/")
    public BaseResult<Student> insertOne(@RequestBody Student student) {
        studentService.insert(student);
        return BaseResult.ok(student);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        studentService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




