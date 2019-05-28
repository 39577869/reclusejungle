package com.elcusejungle.service.impl;

import com.elcusejungle.entity.Clxjmain;
import com.elcusejungle.mapper.ClxjmainMapper;
import com.elcusejungle.service.IClxjmainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
@Service
public class ClxjmainServiceImpl extends ServiceImpl<ClxjmainMapper, Clxjmain> implements IClxjmainService {
    @Autowired //redis模板
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override//获取index图片地址
    public void show(HttpServletRequest request) {
        request.setAttribute("cn",stringRedisTemplate.opsForList().range("cn",0,-1));
        request.setAttribute("cn_home",stringRedisTemplate.opsForList().range("cn_home",0,-1));
        request.setAttribute("vn",stringRedisTemplate.opsForList().range("vn",0,-1));
        request.setAttribute("vn_home",stringRedisTemplate.opsForList().range("vn_home",0,-1));
        request.setAttribute("popular",stringRedisTemplate.opsForList().range("popular",0,-1));
    }
}
