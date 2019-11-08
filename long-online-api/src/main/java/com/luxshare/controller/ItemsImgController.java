package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.ItemsImg;
import com.luxshare.service.ItemsImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/ItemsImg")
public class ItemsImgController {

    @Autowired
    private ItemsImgService itemsimgService;

    @GetMapping("/{id}")
    public BaseResult<ItemsImg> getOne(@PathVariable String id) {
        return BaseResult.ok(itemsimgService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<ItemsImg> updateOne(@PathVariable String id, @RequestBody ItemsImg itemsimg) {
        itemsimg.setId(id);
        itemsimgService.updateByPrimaryKey(itemsimg);
        return BaseResult.ok(itemsimg);
    }

    @PostMapping("/")
    public BaseResult<ItemsImg> insertOne(@RequestBody ItemsImg itemsimg) {
        itemsimgService.insert(itemsimg);
        return BaseResult.ok(itemsimg);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        itemsimgService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




