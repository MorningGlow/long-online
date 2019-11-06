package com.luxshare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test controller
 *
 * @author lion hua
 * @since 2019-11-06
 */
@RestController
public class HelloController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
