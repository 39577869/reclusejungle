package com.elcusejungle.entity;

    import java.math.BigDecimal;
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
    public class Carorder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String oid;

    private Integer cid;

    private String startplace;

    private String endplace;

    private BigDecimal total;

    private String checkperson;

    private String checkphone;

    private LocalDateTime usetime;

    private Boolean useroption;

    private String message;

    private Integer uid;

    private Integer state;

    private LocalDateTime reservetime;


}
