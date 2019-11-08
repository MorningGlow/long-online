package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.ItemsParam;
import com.luxshare.service.ItemsParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/ItemsParam")
public class ItemsParamController {

    @Autowired
    private ItemsParamService itemsparamService;

    @GetMapping("/{id}")
    public BaseResult<ItemsParam> getOne(@PathVariable String id) {
        return BaseResult.ok(itemsparamService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<ItemsParam> updateOne(@PathVariable String id, @RequestBody ItemsParam itemsparam) {
        itemsparam.setId(id);
        itemsparamService.updateByPrimaryKey(itemsparam);
        return BaseResult.ok(itemsparam);
    }

    @PostMapping("/")
    public BaseResult<ItemsParam> insertOne(@RequestBody ItemsParam itemsparam) {
        itemsparamService.insert(itemsparam);
        return BaseResult.ok(itemsparam);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        itemsparamService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




