package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aniki.Hsueh
 * @date 2019-02-27
 */
@RestController
@RequestMapping("/springboot")
public class TestController {

    @RequestMapping("/hello")
    public String hello () {
        return "Hello World! Here I come!";
    }

    @RequestMapping("/init")
    public String init () {
        return "Hello World! Start by Tomcat!";
    }
}
