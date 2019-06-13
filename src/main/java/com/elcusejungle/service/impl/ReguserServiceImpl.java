package com.elcusejungle.service.impl;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.exception.ExistException;
import com.elcusejungle.exception.LoginException;
import com.elcusejungle.exception.RegisterException;
import com.elcusejungle.mapper.ReguserMapper;
import com.elcusejungle.service.IReguserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elcusejungle.util.EmailUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.validation.constraints.Email;
import java.sql.Timestamp;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
@Log4j2
@Service
public class ReguserServiceImpl extends ServiceImpl<ReguserMapper, Reguser> implements IReguserService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 登录
     * @param username 登录账号
     * @param password 登录密码
     * @return
     * @throws Exception
     */
    @Override
    public Reguser reguserLogin(String username,String password) throws Exception{
        Reguser reguser = baseMapper.selectByName(username);
        if(reguser==null){
            throw new LoginException("账号不存在");
        }
        if(!reguser.getPwd().equals(password)){
            throw new LoginException("密码错误");
        }
        return reguser;
    }

    /**
     * 注册
     * @param reguser 注册信息
     * @return
     * @throws Exception
     */
    @Override
    public boolean reguserRegister(Reguser reguser,String code) throws Exception {
        Assert.notNull(reguser.getEmail(),"邮箱为空");
        Assert.notNull(reguser.getPwd(),"密码为空");
        this.validation(reguser.getEmail(),code);
        if(baseMapper.selectByName(reguser.getEmail())!=null){
            throw new ExistException("账号已注册");
        }
        reguser.setUsername(reguser.getEmail());
        reguser.setRegtime(new Timestamp(new Date().getTime()));
        try {
            baseMapper.insert(reguser);
        }catch (Exception e){
            e.printStackTrace();
            throw new RegisterException("注册失败");
        }
        return true;
    }

    /**
     * 验证 验证码
     * @param email
     * @param code
     * @throws Exception
     */
    public void validation(String email,String code)throws Exception{
        String validationCode;
        try {
            validationCode = (String) redisTemplate.opsForValue().get(email);
        }catch (Exception e){
            throw new NullPointerException("验证码已失效");
        }
        Assert.notNull(validationCode,"验证码已失效,请重新发送");
        Assert.notNull(code,"验证码已失效,请重新发送");
        log.info("验证码:"+validationCode);
        if (!code.equals(validationCode)){
            throw new RegisterException("验证码错误");
        }
    }

    @Override
    public boolean reguserRetrievePassword(Reguser reguser, String code)throws Exception {
        Assert.notNull(reguser.getEmail(),"邮箱为空");
        Assert.notNull(reguser.getPwd(),"密码为空");
        if(baseMapper.selectByName(reguser.getEmail())==null){
            throw new ExistException("账号不存在");
        }
        this.validation(reguser.getEmail(), code);
        baseMapper.updateByEmail(reguser);
        return true;
    }
}
