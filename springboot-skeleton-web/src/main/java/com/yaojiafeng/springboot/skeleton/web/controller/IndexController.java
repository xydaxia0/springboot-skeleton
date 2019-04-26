package com.yaojiafeng.springboot.skeleton.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaojiafeng on 2019/4/23 10:57 AM.
 */
@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String ok() {
        return "ok";
    }

}
