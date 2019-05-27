package com.elcusejungle.controller;

import com.elcusejungle.entity.Adminuser;
import com.elcusejungle.service.IAdminuserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Log4j2
@Controller
public class Test {

    @Autowired
    IAdminuserService adminuserService;

    //@ResponseBody
    @RequestMapping("/test")
    public String test(){
        List<Adminuser> list = adminuserService.list();
        list.forEach(log::info);
        return "index";
    }
}
