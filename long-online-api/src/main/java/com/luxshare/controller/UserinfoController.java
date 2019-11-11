package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.common.util.PageGridResult;
import com.luxshare.pojo.Userinfo;
import com.luxshare.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用 Controller 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 15:47:14
 */
@RestController
@RequestMapping("/Userinfo")
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/{id}")
    public BaseResult<Userinfo> getOne(@PathVariable String id) {
        return BaseResult.ok(userinfoService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Userinfo> updateOne(@PathVariable String id, @RequestBody Userinfo userinfo) {
        userinfo.setId(id);
        userinfoService.updateByPrimaryKey(userinfo);
        return BaseResult.ok(userinfo);
    }

    @PostMapping("/")
    public BaseResult<Userinfo> insertOne(@RequestBody Userinfo userinfo) {
        userinfoService.insert(userinfo
                .setId(LocalDateTime.now().getNano() + "-" + Math.random() * 100)
                .setCreatedTime(LocalDateTime.now())
                .setUpdatedTime(LocalDateTime.now()));
        return BaseResult.ok(userinfo);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        userinfoService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }

    @GetMapping("/")
    public BaseResult<Map<String, Boolean>> existUserName(@RequestParam String userName) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("exist", userinfoService.existUserName(userName));
        return BaseResult.ok(map);
    }

    @GetMapping("/page")
    public BaseResult<PageGridResult> page(@RequestParam Integer page, @RequestParam Integer pageSize) {
        PageGridResult result = userinfoService.page(page, pageSize);
        return BaseResult.ok(result);
    }
}




