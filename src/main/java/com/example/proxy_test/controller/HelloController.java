package com.example.proxy_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test/{name}")
    public String helloName (@PathVariable String name) {

        return "안녕하세요. 저는 " + name + "입니다!";
    }
}
