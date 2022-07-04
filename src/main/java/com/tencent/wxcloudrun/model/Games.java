package com.tencent.wxcloudrun.model;

import java.time.LocalDateTime;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2022-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class Games implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime begintime;

    private LocalDateTime endtime;

    private String title;

    private String location;

    private String siteno;

    private String useball;

    private String actiontype;

    private String asklevel;

    private String people;

    private String club;

    private String manager;

    private String price;

    private String addperson;

    private String addprice;

    private String paytype;

    private String paymessage;

    private String cancel;

    private String description;

    private String singedpeople;

    private String substitute;


}
