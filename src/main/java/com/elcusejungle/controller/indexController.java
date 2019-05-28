package com.elcusejungle.controller;

import com.elcusejungle.service.IClxjmainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class indexController {

    @Autowired
    IClxjmainService mainService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String toIndex(Model model, HttpServletRequest request){
        mainService.show(request);    //将图片地址存入request
        return "index";
    }
}
