package com.elcusejungle.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
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
    public class Catalogs implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

            /**
            * 目录ID
            */
    private String catalogid;

            /**
            * 文件ID
            */
        @TableField("fileId")
    private Integer fileId;


}
