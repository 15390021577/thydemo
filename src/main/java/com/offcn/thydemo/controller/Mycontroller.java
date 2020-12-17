package com.offcn.thydemo.controller;

import com.offcn.thydemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class Mycontroller {
    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("==========111111111111111111111111111111111111111111111");
        model.addAttribute("msg","hello thymeleaf");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2Page(Model model){
        User user = new User(1001,"lucy",18,"长沙市 ");
        model.addAttribute("user",user);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("map",map);
        model.addAttribute("msg","欢迎来到梁翔办公室，请看大图片");
        return "index2";

    }
    @RequestMapping("/index3")
    public String index3page(Model model){
        User user1 = new User(1001,"lucy",18,"长沙市 ");
        User user2 = new User(1002,"jack",18,"长沙市 ");
        User user3 = new User(1003,"tom",18,"上海 ");
        User user4 = new User(1004,"tim",18,"长沙市 ");
        List<User> list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("userList",list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4page(Model model){
        model.addAttribute("userName","james");
        model.addAttribute("href","http://www.baidu.com");
        return "index4";
    }
    @RequestMapping("/index5")
    public String index5page(Model model){
        model.addAttribute("result","yes");
        model.addAttribute("menu","manager");
        model.addAttribute("manag","manager");
        return "index5";
    }
    @RequestMapping("/index6")
    public String index6page(Model model){
        return "index6";
    }

    @RequestMapping("/index7")
    public String index7page(Model model){
        //日期
        Date date = new Date();
        //字符串
        String str1 = "十几个方式国风大赏规范的爽肤水方法第三规范" +
                "范德萨发发达购房合同 进入呵呵的都是是 "+
                "范德萨发发大范德萨发大发大" ;
        String str2="com-offcn";
        //数字
        double price=314.1592688;
        model.addAttribute("date",date);
        model.addAttribute("str1",str1);
        model.addAttribute("str2",str2);
        model.addAttribute("price",price);
        return "index7";
    }
}
