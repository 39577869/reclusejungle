package com.elcusejungle.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.elcusejungle.entity.Clxjmain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elcusejungle.vo.ClxjmainVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
public interface ClxjmainMapper extends BaseMapper<Clxjmain> {

    IPage<ClxjmainVo> selectByfind(ClxjmainVo clxjmainVo);

}
