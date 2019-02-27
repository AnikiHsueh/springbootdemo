package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aniki.Hsueh
 * @date 2019-02-27
 */
@RestController
@RequestMapping("/springboot/test")
public class TestController {
    @RequestMapping("/hello")
    public String hello () {
        return "This is my first web project demo for spring boot!!!";
    }
}
