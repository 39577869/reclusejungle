package com.elcusejungle.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
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
    public class Free implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer confessionid;

    private Boolean type;

    private String content;

    private LocalDateTime ftime;

    private Integer readnum;


}
