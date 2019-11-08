package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.ItemsComments;
import com.luxshare.service.ItemsCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/ItemsComments")
public class ItemsCommentsController {

    @Autowired
    private ItemsCommentsService itemscommentsService;

    @GetMapping("/{id}")
    public BaseResult<ItemsComments> getOne(@PathVariable String id) {
        return BaseResult.ok(itemscommentsService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<ItemsComments> updateOne(@PathVariable String id, @RequestBody ItemsComments itemscomments) {
        itemscomments.setId(id);
        itemscommentsService.updateByPrimaryKey(itemscomments);
        return BaseResult.ok(itemscomments);
    }

    @PostMapping("/")
    public BaseResult<ItemsComments> insertOne(@RequestBody ItemsComments itemscomments) {
        itemscommentsService.insert(itemscomments);
        return BaseResult.ok(itemscomments);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        itemscommentsService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




