package com.liwj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwj0 on 2017/7/6.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello world";
    }
}
