package com.elcusejungle.vo;

import com.elcusejungle.entity.Clxjcomment;
import com.elcusejungle.entity.Clxjmain;
import lombok.Data;

import java.util.List;

/**
 * 搜索丛林闲居分页
 */

@Data
public class ClxjmainVo extends Clxjmain {

    private List<Clxjcomment> clxjcomment;
    private String startTime;
    private String endTime;
    private Integer avg;    // 评分
    private Integer count;  // 评价记录数
    private Long page;
    private Long limit;

}
