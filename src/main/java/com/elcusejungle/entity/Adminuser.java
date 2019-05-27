package com.elcusejungle.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;

    import java.sql.Timestamp;
    import java.time.LocalDateTime;
    import java.io.Serializable;

    import com.fasterxml.jackson.annotation.JsonFormat;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;
/**
*
* @author lin
* @since 2019-05-23
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Adminuser implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String pwd;

    private String name;

    private String mobile;

    private String usertype;

    private Boolean userflag;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss ",timezone = "GMT+8")
    private Timestamp regtime;

    private Integer joinid;


}
