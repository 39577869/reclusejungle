package com.elcusejungle.entity;

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
    public class Joinxj implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String xjname;

    private String houseno;

    private String address;

    private String postcode;

    private String houseidcard;

    private String housephone;

    private String housemobile;

    private String houseperson;

    private String idcard;

    private String phone;

    private String message;

    private Integer uid;

    private String jointime;

    private Integer joinstatus;

    private String fileurl;


}
