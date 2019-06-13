package com.elcusejungle.mapper;

import com.elcusejungle.entity.Reguser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
public interface ReguserMapper extends BaseMapper<Reguser> {
    @Select("select * from reguser where email=#{username}")
    Reguser selectByName(String username);

    int updateByEmail(Reguser reguser)throws Exception;
}
