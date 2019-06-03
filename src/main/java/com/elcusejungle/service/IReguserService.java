package com.elcusejungle.service;

import com.elcusejungle.entity.Reguser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @since 2019-05-23
 */
public interface IReguserService extends IService<Reguser> {

    /**
     * 用户登录
     * @param username 登录账号
     * @param password 登录密码
     * @return
     * @throws Exception
     */
    Reguser reguserLogin(String username,String password) throws Exception;

    /**
     * 用户注册
     * @param reguser 注册信息
     * @return
     * @throws Exception
     */
    boolean reguserRegister(Reguser reguser,String code)throws Exception;

    /**
     * 验证 验证码
     * @param email
     * @param code
     * @throws Exception
     */
    void validation(String email,String code)throws Exception;

    /**
     * 忘记密码
     * @param reguser
     * @param code
     * @return
     */
    boolean reguserRetrievePassword(Reguser reguser,String code)throws Exception;
}
