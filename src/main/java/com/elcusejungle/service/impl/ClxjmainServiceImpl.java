package com.elcusejungle.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.elcusejungle.entity.Clxjmain;
import com.elcusejungle.mapper.ClxjmainMapper;
import com.elcusejungle.service.IClxjmainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elcusejungle.utils.LayuiUtil;
import com.elcusejungle.vo.ClxjmainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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


    @Override
    public Map<String, Object> selectByfind(ClxjmainVo clxjmainVo) {
        IPage<ClxjmainVo> clxjmain = baseMapper.selectByfind(clxjmainVo);
        return LayuiUtil.data(clxjmainVo.getPages(), clxjmain.getRecords());
    }
}
