package com.elcusejungle.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.elcusejungle.entity.Adminuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */

public interface AdminuserMapper extends BaseMapper<Adminuser> {
//    @Select("")
    IPage<Adminuser> selectPageVo(Page page, @Param("state") Integer state);
}
