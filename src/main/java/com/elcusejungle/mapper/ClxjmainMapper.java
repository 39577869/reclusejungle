package com.elcusejungle.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.elcusejungle.entity.Clxjmain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elcusejungle.vo.ClxjmainVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
public interface ClxjmainMapper extends BaseMapper<Clxjmain> {

    IPage<ClxjmainVo> selectByfind(Page<ClxjmainVo> page, @Param("clxjmainVo") ClxjmainVo clxjmainVo);

    ClxjmainVo selectById(@Param("id")Integer id);

}
