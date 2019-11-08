package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.UserAddress;
import com.luxshare.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/UserAddress")
public class UserAddressController {

    @Autowired
    private UserAddressService useraddressService;

    @GetMapping("/{id}")
    public BaseResult<UserAddress> getOne(@PathVariable String id) {
        return BaseResult.ok(useraddressService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<UserAddress> updateOne(@PathVariable String id, @RequestBody UserAddress useraddress) {
        useraddress.setId(id);
        useraddressService.updateByPrimaryKey(useraddress);
        return BaseResult.ok(useraddress);
    }

    @PostMapping("/")
    public BaseResult<UserAddress> insertOne(@RequestBody UserAddress useraddress) {
        useraddressService.insert(useraddress);
        return BaseResult.ok(useraddress);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        useraddressService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




