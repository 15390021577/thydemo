package com.offcn.thydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/helloGit")
    public String hell(){
        System.out.println("----------11111111111111111111111");
        return "success";
    }
}
