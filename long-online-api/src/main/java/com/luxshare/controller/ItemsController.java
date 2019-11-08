package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Items;
import com.luxshare.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/Items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/{id}")
    public BaseResult<Items> getOne(@PathVariable String id) {
        return BaseResult.ok(itemsService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Items> updateOne(@PathVariable String id, @RequestBody Items items) {
        items.setId(id);
        itemsService.updateByPrimaryKey(items);
        return BaseResult.ok(items);
    }

    @PostMapping("/")
    public BaseResult<Items> insertOne(@RequestBody Items items) {
        itemsService.insert(items);
        return BaseResult.ok(items);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        itemsService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




