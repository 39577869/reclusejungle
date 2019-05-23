package com.elcusejungle.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Helpinfo implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Boolean sex;

    private Integer age;

    private String idcard;

    private String phonenum;

    private String email;

    private String address;

    private BigDecimal income;

    private Boolean basicliving;

    private BigDecimal applymoney;

    private String fileurl;

    private String applycontent;

    private Integer applystatus;

    private Boolean applytype;

    private String time;

    private Integer uid;

    private String applymoneyusertime;

    private String vouchname;

    private String vouchidcard;

    private String vouchaddress;

    private String vouchcompany;

    private String vouchphonenum;

    private String vouchmobile;

    private String vouchdddress;


}
