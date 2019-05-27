package com.elcusejungle.Interceptor;

import com.elcusejungle.exception.LoginException;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Log4j2
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> exceptionHandler(Exception ex){
        ex.printStackTrace();
        Map<String,Object> map  = new HashMap<>();
        if(ex instanceof LoginException){
            log.error("登录错误");
        }
        log.error("抛出异常");
        map.put("code",500);
        map.put("msg",ex.getMessage());
        return map;
    }
}
