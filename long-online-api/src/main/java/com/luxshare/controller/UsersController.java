package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Users;
import com.luxshare.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 13:22:12
*/
@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public BaseResult<Users> getOne(@PathVariable String id) {
        return BaseResult.ok(usersService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Users> updateOne(@PathVariable String id, @RequestBody Users users) {
        users.setId(id);
        usersService.updateByPrimaryKey(users);
        return BaseResult.ok(users);
    }

    @PostMapping("/")
    public BaseResult<Users> insertOne(@RequestBody Users users) {
        usersService.insert(users);
        return BaseResult.ok(users);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        usersService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




