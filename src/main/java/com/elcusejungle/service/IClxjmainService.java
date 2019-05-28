package com.elcusejungle.service;

import com.elcusejungle.entity.Clxjmain;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
public interface IClxjmainService extends IService<Clxjmain> {

    /**
     * 获取index页面现实图片地址
     */
    public void show(HttpServletRequest request);
}
