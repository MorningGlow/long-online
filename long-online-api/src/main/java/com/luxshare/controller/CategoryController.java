package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Category;
import com.luxshare.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * 通用 Controller 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 13:22:12
 */
@RestController
@RequestMapping("/Category")
@Api(value = "商品分类", tags = {"商品分类相关接口"})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "获取一笔数据", notes = "获取一笔商品分类数据")
    @GetMapping("/{id}")
    public BaseResult<Category> getOne(@PathVariable String id) {
        return BaseResult.ok(categoryService.getOneByPrimaryKey(id));
    }

    @ApiOperation(value = "更新一笔数据", notes = "更新一笔商品分类数据")
    @PutMapping("/{id}")
    public BaseResult<Category> updateOne(@PathVariable Integer id, @RequestBody Category category) {
        category.setId(id);
        categoryService.updateByPrimaryKey(category);
        return BaseResult.ok(category);
    }

    @ApiOperation(value = "插入一笔数据", notes = "插入一笔商品分类数据")
    @PostMapping("/")
    public BaseResult<Category> insertOne(@RequestBody Category category) {
        categoryService.insert(category);
        return BaseResult.ok(category);
    }

    @ApiOperation(value = "删除一笔数据", notes = "删除一笔商品分类数据")
    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        categoryService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




