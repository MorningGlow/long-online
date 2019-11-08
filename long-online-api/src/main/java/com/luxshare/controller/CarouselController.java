package com.luxshare.controller;

import com.luxshare.common.response.BaseResult;
import com.luxshare.pojo.Carousel;
import com.luxshare.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 通用 Controller 代码生成器
*
* @author lion hua
* @since 2019-11-08 15:33:33
*/
@RestController
@RequestMapping("/Carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @GetMapping("/{id}")
    public BaseResult<Carousel> getOne(@PathVariable String id) {
        return BaseResult.ok(carouselService.getOneByPrimaryKey(id));
    }

    @PutMapping("/{id}")
    public BaseResult<Carousel> updateOne(@PathVariable String id, @RequestBody Carousel carousel) {
        carousel.setId(id);
        carouselService.updateByPrimaryKey(carousel);
        return BaseResult.ok(carousel);
    }

    @PostMapping("/")
    public BaseResult<Carousel> insertOne(@RequestBody Carousel carousel) {
        carouselService.insert(carousel);
        return BaseResult.ok(carousel);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> deleteOne(@PathVariable String id) {
        carouselService.deleteByPrimaryKey(id);
        return BaseResult.ok("删除一笔数据成功");
    }
}




