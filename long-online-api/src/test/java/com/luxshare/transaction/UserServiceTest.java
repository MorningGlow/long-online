package com.luxshare.transaction;

import com.alibaba.fastjson.JSON;
import com.luxshare.OnlineApplication;
import com.luxshare.pojo.Userinfo;
import com.luxshare.service.UserinfoService;
import com.luxshare.vo.UserinfoWithItemContentVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 用户相关 service 进行测试
 *
 * @author lion hua
 * @since 2019-11-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineApplication.class)
@Slf4j
public class UserServiceTest {

    @Autowired
    private UserinfoService userinfoService;

    @Test
    public void test() {
        final Userinfo ui = userinfoService.getUserInfoByUserName("小七");
        log.info(JSON.toJSONString(ui, true));
    }

    @Test
    public void test2() {
        final Userinfo ur = userinfoService.getUserInfoByRealName("李七");
        log.info(JSON.toJSONString(ur, true));
    }

    @Test
    public void test3() {
        final UserinfoWithItemContentVO allItemComment = userinfoService.getAllItemCommentByUserinfoId("4f2ff1e7-e597-4176-902e-c6d93e8da6fa");
        log.info(JSON.toJSONString(allItemComment, true));
    }
}
