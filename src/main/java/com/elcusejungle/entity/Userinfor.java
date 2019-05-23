package com.elcusejungle.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Userinfor implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 用户ID
            */
            @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

            /**
            * 用户姓名
            */
    private String userName;

            /**
            * 性别；1：男性，0：女性
            */
    private Boolean userSex;

            /**
            * 工作
            */
    private String userWork;

            /**
            * 联系方式
            */
    private String userContact;

            /**
            * 住址
            */
    private String userAddress;

            /**
            * 婚姻状况；0：未婚，1：已婚
            */
    private Boolean userMarriage;

            /**
            * 用户部门
            */
    private Integer userDepartment;

            /**
            * 入职时间
            */
        @TableField("user_employTime")
    private LocalDateTime userEmploytime;

            /**
            * 登陆密码
            */
    private String userPassword;

            /**
            * 学历
            */
    private String userEducation;

            /**
            * 用户登陆名
            */
        @TableField("user_loginName")
    private String userLoginname;


}
