package com.elcusejungle.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;

    import java.sql.Timestamp;
    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* @since 2019-05-23
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Clxjmain implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Boolean type1;

    private Boolean type2;

    private String belongCity;

    private String firstImgBig;

    private String firstImgMin;

    private String carouselImg;

    private BigDecimal price;

    private String introduction;

    private String address;

    private String longitude;

    private String latitude;

    private Integer reserveNum;

    private Boolean recommend;

    private Integer joinid;

        @TableField("checkStatus")
    private Integer checkStatus;

    private String abbot;

    private String abbotresume;

    private Timestamp opentime;

    private Timestamp createtime;

    private String mobile;


}
