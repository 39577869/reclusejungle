package com.elcusejungle.service.impl;

import com.elcusejungle.entity.Donation;
import com.elcusejungle.mapper.DonationMapper;
import com.elcusejungle.service.IDonationService;
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
public class DonationServiceImpl extends ServiceImpl<DonationMapper, Donation> implements IDonationService {

}
