package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.OrderStatus;
import com.luxshare.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/OrderStatus")
public class OrderStatusController {

    @Autowired
    private OrderStatusService orderstatusService;

    @GetMapping("/{id}")
    public BaseResult<OrderStatus> getOne(@PathVariable String id) {
        return BaseResult.ok(orderstatusService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<OrderStatus> updateOne(@PathVariable String id, @RequestBody OrderStatus orderstatus) {
        orderstatus.setOrderId(id);
        orderstatusService.updateByPrimaryKey(orderstatus);
        return BaseResult.ok(orderstatus);
    }

    @PostMapping("/")
    public BaseResult<OrderStatus> insertOne(@RequestBody OrderStatus orderstatus) {
        orderstatusService.insert(orderstatus);
        return BaseResult.ok(orderstatus);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        orderstatusService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




