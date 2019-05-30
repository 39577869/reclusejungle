package com.elcusejungle.controller;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.service.IReguserService;
import com.elcusejungle.util.DigestUtils;
import com.elcusejungle.util.EmailUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
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

    /**
     * 登录
     * @param reguser
     * @param session
     * @param response
     * @param request
     * @return
     * @throws Exception
     *
     */
    @ResponseBody
    @PostMapping("/login")
    public boolean login(Reguser reguser, HttpSession session, HttpServletResponse response, HttpServletRequest request)throws Exception{
        Reguser user = reguserService.reguserLogin(reguser.getUsername(),reguser.getPwd());
        session.setAttribute("user",user.getUsername());
        return true;
    }

    /**
     * 进入登录页面
     * @return
     * @throws Exception
     */
    @GetMapping("/login")
    public String login()throws Exception{
        return "login";
    }

    /**
     * 进入注册页面
     * @return
     * @throws Exception
     */
    @GetMapping("/register")
    public String register()throws Exception{
        return "register";
    }

    /**
     * 注册
     * @param reguser
     * @return
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("/register")
    public boolean register(Reguser reguser) throws Exception{
        reguserService.reguserRegister(reguser);
        return true;
    }

    /**
     * 发送邮箱
     * @param email
     * @param session
     * @return
     */
    @ResponseBody
    @PostMapping("/email/{email}")
    public boolean sendEmail(@PathVariable("email") String email,HttpSession session){
        EmailUtil emailUtil= new EmailUtil();
        emailUtil.setAddress(email);
        String verifyCode = DigestUtils.randomDigitNumber(4);
        emailUtil.setCode(verifyCode);
        session.setAttribute("verifyCode",verifyCode);
        redisTemplate.convertAndSend("mail",emailUtil);
        return true;
    }

    /**
     * 验证码比较
     * @return
     */
    @ResponseBody
    @PostMapping("/compare/{verifyCode}")
    public boolean compare(@PathVariable("verifyCode")String verifyCode,HttpSession session){
        String sysverifyCode = (String) session.getAttribute("verifyCode");
        Assert.notNull(verifyCode,"验证码为空");
        Assert.notNull(sysverifyCode,"原验证码不存在");
        if(sysverifyCode.equals(verifyCode)){
            return true;
        }
        return false;
    }
}
