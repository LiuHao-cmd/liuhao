package com.liuhao.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuhao
 * @Date: 2021/5/28 17:44
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping("/find")
    public String findCache() {
        return "success";
    }
}

