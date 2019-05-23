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
    public class Joincar implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String theowner;

    private String idcard;

    private String address;

    private String carname;

    private String travelnumber;

    private String travelrun;

    private String drivername;

    private String drivernumber;

    private String driverphone;

    private String insurancename;

    private String insurancenumber;

    private String insurancephone;

    private String message;

    private Integer uid;

    private String jointime;

    private Integer joinstatus;

    private String fileurl;


}
