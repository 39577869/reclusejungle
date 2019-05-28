package com.elcusejungle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demoController {

    @Autowired //redis模板
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping(value = "hello")
    public String hello(){

        stringRedisTemplate.opsForList().rightPushAll("popular","Popular_1.jpeg","Popular_2.jpg","Popular_3.jpg","Popular_4.jpg");
        //stringRedisTemplate.opsForList().rightPushAll("vn","vn_1.jpg","vn_2.jpeg","vn_3.jpg","vn_4.jpg","vn_5.jpg");
        List<String> list = stringRedisTemplate.opsForList().range("popular",0,-1);
        for (String s : list) {
            System.out.println(s);
        }
        return "你好，封颖鹏";
    }

}
