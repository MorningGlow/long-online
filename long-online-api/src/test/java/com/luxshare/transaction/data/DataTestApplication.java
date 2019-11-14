package com.luxshare.transaction.data;

import com.alibaba.fastjson.JSON;
import com.luxshare.OnlineApplication;
import com.luxshare.common.util.PageGridResult;
import com.luxshare.mapper.UserinfoDao;
import com.luxshare.pojo.Userinfo;
import com.luxshare.service.UserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 添加测试数据
 *
 * @author lion hua
 * @since 2019-11-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineApplication.class)
@Slf4j
public class DataTestApplication {

    @Autowired
    private UserinfoService userinfoService;

    @Autowired(required = false)
    private UserinfoDao userinfoDao;

    @Test
    @Transactional(propagation = Propagation.REQUIRED)
    public void test() {
        // 删除数据库所有的数据(使用时慎重)
        userinfoDao.delete(Userinfo.defaultInstance());

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小三")
                .setPassword("123456")
                .setRealname("张三")
                .setMobile("13236251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小四")
                .setPassword("123456")
                .setRealname("李三")
                .setMobile("13246251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小五")
                .setPassword("123456")
                .setRealname("王五")
                .setMobile("13246251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小王")
                .setPassword("123456")
                .setRealname("王王")
                .setMobile("13246251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小七")
                .setPassword("123456")
                .setRealname("李七")
                .setMobile("13246251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

        userinfoService.insert(Userinfo.defaultInstance()
                .setId(UUID.randomUUID().toString())
                .setUsername("小八")
                .setPassword("123456")
                .setRealname("李八")
                .setMobile("13246251814")
                .setFace("xxx.png")
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));

    }

    @Test
    @Transactional(propagation = Propagation.REQUIRED)
    public void test2() {
        final PageGridResult<Userinfo> page = userinfoService.page(1, 5);
        log.info(JSON.toJSONString(page, true));

        final PageGridResult<Userinfo> page2 = userinfoService.page(2, 5);
        log.info(JSON.toJSONString(page2, true));
    }
}
