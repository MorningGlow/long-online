package com.luxshare.transaction;

import com.luxshare.OnlineApplication;
import com.luxshare.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional(propagation = Propagation.REQUIRED)
    @Test
    public void test2() {
        // REQUIRED:使用当前的事务，如果当前没有事务，则自己新建一个事务，子方法是必须运行在一个事务中的；
        // 如果当前存在事务，则加入这个事务，成为一个整体。

        // 第一种
        // test2加REQUIRED,saveParent，与saveChildren,saveChildren1,saveChildren2也加
        // 其中任意一个方法发生异常，其它的方法都会回滚

        // 第二种
        // test2不加REQUIRED，其它的都加REQUIRED
        // tes2中发生异常，不会导致其它加REQUIRED回滚
        studentService.saveParent();

        studentService.saveChildren();
    }


    @Test
    public void test3() {
        // SUPPORTS:如果当前有事务，则使用事务；如果当前没有事务，则不使用事务。

        studentService.saveParent();

        studentService.saveChildren();
    }

    @Test
    public void test4() {
        // REQUIRES_NEW:如果当前有事务，则挂起该事务，并且自己创建一个新的事务给自己使用；如果当前没有事务，则同 REQUIRED

        studentService.saveParent();

        studentService.saveChildren();
    }

    @Test
    public void test5() {
        // NOT_SUPPORTED:如果当前有事务，则把事务挂起，自己不用事务去运行数据库操作

        studentService.saveParent();

        studentService.saveChildren();
    }

    @Test
    public void test6() {
        // MANDATORY:该传播属性强制必须存在一个事务，如果不存在，则抛出异常

        studentService.saveParent();

        studentService.saveChildren();
    }

    @Test
    public void test7() {
        // NEVER:如果当前有事务存在，则抛出异常

        studentService.saveParent();

        studentService.saveChildren();
    }

    @Test
    public void test8() {
        // NESTED:如果当前有事务，则开启子事务（嵌套事务），嵌套事务是独立提交或者回滚；如果当前没有事务，则同 REQUIRED。
        // 但是如果主事务提交，则会携带子事务一起提交。
        // 如果主事务回滚，则子事务会一起回滚。相反，子事务异常，则父事务可以回滚或不回滚。

        studentService.saveParent();

        studentService.saveChildren();
    }
}
