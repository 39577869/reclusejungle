package com.elcusejungle.exception;

/**
 * 登录异常
 */
public class LoginException extends Exception{
    public LoginException(){

    }
    public LoginException(String msg){
        super(msg);
    }
}
