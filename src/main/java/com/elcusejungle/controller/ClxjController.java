package com.elcusejungle.controller;

import com.elcusejungle.entity.Clxjmain;
import com.elcusejungle.service.IClxjmainService;
import com.elcusejungle.vo.ClxjmainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/clxj")
public class ClxjController {

    @Autowired
    private IClxjmainService iClxjmainService;

    // 判断搜索类型
    @RequestMapping(value = "/clxj", method = RequestMethod.GET)
    public String clxj(Model model, ClxjmainVo clxjmainVo){
        model.addAttribute("clxjmainVo", clxjmainVo);
        if(clxjmainVo.getClxjmain().getType2()){    // 丛林
            return "AtList";
        }else{  // 闲居
            return "JungleList";
        }
    }

    // 搜索
    @ResponseBody
    @RequestMapping(value = "/clxjFind", method = RequestMethod.GET)
    public Map<String, Object> clxjFind(ClxjmainVo clxjmainVo){
        return iClxjmainService.selectByfind(clxjmainVo);
    }
}
