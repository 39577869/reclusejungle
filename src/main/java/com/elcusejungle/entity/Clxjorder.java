package com.elcusejungle.entity;

    import java.math.BigDecimal;
    import java.time.LocalDate;
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
    public class Clxjorder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String oid;

    private Integer cid;

    private Integer uid;

    private LocalDate checkstartdate;

    private LocalDate checkenddate;

    private BigDecimal total;

    private String checkperson;

    private String relperson;

    private String relphone;

    private String relemail;

    private Integer state;

    private LocalDateTime reservetime;


}
