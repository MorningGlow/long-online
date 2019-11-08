package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.OrderItems;
import com.luxshare.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/OrderItems")
public class OrderItemsController {

    @Autowired
    private OrderItemsService orderitemsService;

    @GetMapping("/{id}")
    public BaseResult<OrderItems> getOne(@PathVariable String id) {
        return BaseResult.ok(orderitemsService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<OrderItems> updateOne(@PathVariable String id, @RequestBody OrderItems orderitems) {
        orderitems.setId(id);
        orderitemsService.updateByPrimaryKey(orderitems);
        return BaseResult.ok(orderitems);
    }

    @PostMapping("/")
    public BaseResult<OrderItems> insertOne(@RequestBody OrderItems orderitems) {
        orderitemsService.insert(orderitems);
        return BaseResult.ok(orderitems);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        orderitemsService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




