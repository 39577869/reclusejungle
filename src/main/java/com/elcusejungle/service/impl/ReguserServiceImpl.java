package com.elcusejungle.service.impl;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.exception.LoginException;
import com.elcusejungle.mapper.ReguserMapper;
import com.elcusejungle.service.IReguserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
@Service
public class ReguserServiceImpl extends ServiceImpl<ReguserMapper, Reguser> implements IReguserService {

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
}
