package com.luxshare.transaction;

import com.luxshare.OnlineApplication;
import com.luxshare.pojo.ItemsComments;
import com.luxshare.service.ItemsCommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;

/**
 * ItemComment 测试
 *
 * @author lion hua
 * @since 2019-11-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineApplication.class)
public class ItemCommentTest {

    @Autowired
    private ItemsCommentsService itemsCommentsService;


    // ???
    @Transactional(propagation = Propagation.REQUIRED)
    @Test
    public void test() {
        List<ItemsComments> list = new ArrayList<ItemsComments>() {
            {
                add(ItemsComments.defaultInstance()
                        .setId(UUID.randomUUID().toString())
                        .setCreatedTime(LocalDateTime.now())
                        .setItemName("itemName-1")
                        .setSepcName("specName-1")
                        .setUpdatedTime(LocalDateTime.now())
                        .setCommentLevel(1)
                        .setContent("content-1")
                        .setItemId("item-id")
                        .setItemSpecId("item-spec-id")
                        .setUserId("6c9b552d-c220-4ff5-baae-ca3f08b77848"));

                add(ItemsComments.defaultInstance()
                        .setId(UUID.randomUUID().toString())
                        .setCreatedTime(LocalDateTime.now())
                        .setItemName("itemName-2")
                        .setSepcName("specName-2")
                        .setUpdatedTime(LocalDateTime.now())
                        .setCommentLevel(1)
                        .setContent("content-2")
                        .setItemId("item-id")
                        .setItemSpecId("item-spec-id")
                        .setUserId("2d38b1f1-fddc-4fb1-b6f3-741163cddd26"));

                add(ItemsComments.defaultInstance()
                        .setId(UUID.randomUUID().toString())
                        .setCreatedTime(LocalDateTime.now())
                        .setItemName("itemName-3")
                        .setSepcName("specName-3")
                        .setUpdatedTime(LocalDateTime.now())
                        .setCommentLevel(1)
                        .setContent("content-3")
                        .setItemId("item-id")
                        .setItemSpecId("item-spec-id")
                        .setUserId("4f2ff1e7-e597-4176-902e-c6d93e8da6fa"));
            }
        };

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("commentList", list);
        itemsCommentsService.saveItemContents(paramMap);
    }
}
