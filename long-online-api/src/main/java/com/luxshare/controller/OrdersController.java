package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Orders;
import com.luxshare.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/{id}")
    public BaseResult<Orders> getOne(@PathVariable String id) {
        return BaseResult.ok(ordersService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Orders> updateOne(@PathVariable String id, @RequestBody Orders orders) {
        orders.setId(id);
        ordersService.updateByPrimaryKey(orders);
        return BaseResult.ok(orders);
    }

    @PostMapping("/")
    public BaseResult<Orders> insertOne(@RequestBody Orders orders) {
        ordersService.insert(orders);
        return BaseResult.ok(orders);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        ordersService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




