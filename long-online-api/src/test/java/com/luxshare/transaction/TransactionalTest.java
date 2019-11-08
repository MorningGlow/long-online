package com.luxshare.transaction;

import com.luxshare.OnlineApplication;
import com.luxshare.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 事务传播机制测试
 *
 * @author lion hua
 * @since 2019-11-08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineApplication.class)
@MapperScan(basePackages = "com.luxshare.mapper")
public class TransactionalTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        // 都不加事务
        // saveParent,saveChildren1成功,saveChildren2失败
        // 实际生产中，若有一步执行失败，其它的步骤也应回滚
        studentService.saveParent();

        studentService.saveChildren();
    }
}
