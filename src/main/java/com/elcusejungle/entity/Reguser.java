package com.elcusejungle.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;

    import java.sql.Timestamp;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;
    import org.springframework.beans.factory.annotation.Value;

/**
* @since 2019-05-23
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Reguser implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String mobile;

    private String email;

    private String pwd;

    private Boolean sex;

    private String realname;

    private String idcard;

    private Integer city;

    private Timestamp regtime;

    private Boolean enableflag;


}
