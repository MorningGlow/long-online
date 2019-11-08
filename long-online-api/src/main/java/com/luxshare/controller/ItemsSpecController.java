package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.ItemsSpec;
import com.luxshare.service.ItemsSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/ItemsSpec")
public class ItemsSpecController {

    @Autowired
    private ItemsSpecService itemsspecService;

    @GetMapping("/{id}")
    public BaseResult<ItemsSpec> getOne(@PathVariable String id) {
        return BaseResult.ok(itemsspecService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<ItemsSpec> updateOne(@PathVariable String id, @RequestBody ItemsSpec itemsspec) {
        itemsspec.setId(id);
        itemsspecService.updateByPrimaryKey(itemsspec);
        return BaseResult.ok(itemsspec);
    }

    @PostMapping("/")
    public BaseResult<ItemsSpec> insertOne(@RequestBody ItemsSpec itemsspec) {
        itemsspecService.insert(itemsspec);
        return BaseResult.ok(itemsspec);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        itemsspecService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




