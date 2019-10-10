package com.springboot.controller;


import com.springboot.entity.User;
import com.springboot.service.HelloServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private HelloServiceImpl helloService;


    @ResponseBody
    @RequestMapping("/hello")
    public String helloService(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/hi")
    public String find(){
        return helloService.find();
    }

    @ResponseBody
    @RequestMapping("/hao")
    public String addUser(User user){
        Integer i = helloService.addUser(user);
        return "插入"+i+"条数据";
    }






}
