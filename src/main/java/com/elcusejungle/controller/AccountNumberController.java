package com.elcusejungle.controller;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.service.IReguserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 林佳志
 * 登录，注册，忘记密码
 */
@Controller
public class AccountNumberController {
    @Autowired
    IReguserService reguserService;

    @ResponseBody
    @PostMapping("/login")
    public boolean login(Reguser reguser, HttpSession session)throws Exception{
        Reguser user = reguserService.reguserLogin(reguser.getUsername(),reguser.getPwd());
        session.setAttribute("user",user);
        return true;
    }

    @GetMapping("/login")
    public String login()throws Exception{
        return "login";
    }
}
