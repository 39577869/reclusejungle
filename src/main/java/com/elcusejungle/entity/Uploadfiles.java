package com.elcusejungle.entity;

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
    public class Uploadfiles implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "FileId", type = IdType.AUTO)
    private Integer FileId;

            /**
            * 文件原始名称
            */
        @TableField("FileName")
    private String FileName;

            /**
            * 文件描述
            */
        @TableField("FileDescription")
    private String FileDescription;

            /**
            * 文件创建时间
            */
        @TableField("FileCreateDate")
    private LocalDate FileCreateDate;

            /**
            * 文件类型
            */
        @TableField("FileKind")
    private String FileKind;

            /**
            * 文件所属目录
            */
        @TableField("FileModule")
    private String FileModule;

            /**
            * 文件目标名称，上传到服务器后生成的随机名称
            */
        @TableField("targetFileName")
    private String targetFileName;

            /**
            * 文件类型
            */
        @TableField("FileType")
    private String FileType;

            /**
            * 文件大小，单位为字节
            */
        @TableField("FileSize")
    private Integer FileSize;


}
