package com.elcusejungle.service;

import com.elcusejungle.entity.Clxjmain;
import com.baomidou.mybatisplus.extension.service.IService;
import com.elcusejungle.vo.ClxjmainVo;

import java.util.Map;

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
     * 查询丛林闲居信息
     * @param clxjmainVo
     * @return
     */
    public Map<String ,Object> selectByfind(ClxjmainVo clxjmainVo);

    /**
     * 查询丛林详细信息
     * @param id
     * @return
     */
    public ClxjmainVo selectById(Integer id);

}
