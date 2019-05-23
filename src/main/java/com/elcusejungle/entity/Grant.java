package com.elcusejungle.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import java.time.LocalDate;
    import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Grant implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String donationname;

    private String goods;

    private BigDecimal num;

    private BigDecimal worthless;

    private String useto;

    private String recipients;

        @TableField("donationTime")
    private LocalDate donationTime;


}
