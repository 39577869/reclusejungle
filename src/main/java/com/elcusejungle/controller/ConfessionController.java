package com.elcusejungle.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfessionController {

    /**
     * 进入忏悔页面
     * @return
     */
    @GetMapping("ConEntryPage")
    public String conEntryPage(){
        return "ConEntryPage";
    }
}
