package com.luxshare.service;

import com.luxshare.common.service.BaseService;
import com.luxshare.pojo.Student;

/**
* 通用 Service 代码生成器
*
* @author lion hua
* @since 2019-11-08 15:33:33
*/
public interface StudentService extends BaseService<Student> {

    void saveParent();

    void saveChildren();

    void saveChildren1();

    void saveChildren2();
}




