package com.elcusejungle.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demoController {

    @Autowired //redis模板
    private StringRedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping(value = "hello")
    public String hello(){

       redisTemplate.opsForValue().set("resisTemplate2","https://blog.csdn.net/qq_16605855/article/details/79528535");
        System.out.println(redisTemplate.opsForValue().get("resisTemplate2"));
        return "你好，封颖鹏";
    }

}
