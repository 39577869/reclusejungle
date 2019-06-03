package com.elcusejungle.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.elcusejungle.entity.Clxjcomment;
import com.elcusejungle.entity.Clxjmain;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ClxjmainVo extends Page<Clxjmain> {

    private Clxjmain clxjmain;
    private Clxjcomment clxjcomment;
    private String startTime;
    private String endTime;
    private Integer avg;    // 评分
    private Integer count;  // 评价记录数
//    private Long page;
//    private Long limit;
    public ClxjmainVo(Long page,Long limit){
        super(page,limit);
    }
}
