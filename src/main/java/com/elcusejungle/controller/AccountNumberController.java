package com.elcusejungle.controller;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.service.IReguserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 林佳志
 * 登录，注册，忘记密码
 */
@Log4j2
@Controller
public class AccountNumberController {
    @Autowired
    private  IReguserService reguserService;


    @Autowired
    private RedisTemplate redisTemplate;
    @ResponseBody
    @PostMapping("/login")
    public boolean login(Reguser reguser, HttpSession session, HttpServletResponse response, HttpServletRequest request)throws Exception{
        Reguser user = reguserService.reguserLogin(reguser.getUsername(),reguser.getPwd());
        session.setAttribute("user",user.getUsername());
        return true;
    }

    @GetMapping("/login")
    public String login()throws Exception{
        return "login";
    }

    @GetMapping("/register")
    public String register()throws Exception{
        return "register";
    }

    @ResponseBody
    @PostMapping("/register")
    public boolean register(Reguser reguser) throws Exception{
        reguserService.reguserRegister(reguser);
        return true;
    }

    @ResponseBody
    @PostMapping("/email/{email}")
    public boolean sendEmail(@PathVariable("email") String email){
        redisTemplate.convertAndSend("email",email);
        return true;
    }
}
