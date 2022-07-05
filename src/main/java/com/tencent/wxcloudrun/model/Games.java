package com.tencent.wxcloudrun.model;


import java.time.LocalDate;
import java.time.LocalTime;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2022-07-05
 */

public class Games implements Serializable {

    private static final long serialVersionUID = 1L;


    private String id;

    private LocalDate day;

    private LocalTime begintime;

    private LocalTime endtime;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }
    public LocalTime getBegintime() {
        return begintime;
    }

    public void setBegintime(LocalTime begintime) {
        this.begintime = begintime;
    }
    public LocalTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalTime endtime) {
        this.endtime = endtime;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getSiteno() {
        return siteno;
    }

    public void setSiteno(String siteno) {
        this.siteno = siteno;
    }
    public String getUseball() {
        return useball;
    }

    public void setUseball(String useball) {
        this.useball = useball;
    }
    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }
    public String getAsklevel() {
        return asklevel;
    }

    public void setAsklevel(String asklevel) {
        this.asklevel = asklevel;
    }
    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getAddperson() {
        return addperson;
    }

    public void setAddperson(String addperson) {
        this.addperson = addperson;
    }
    public String getAddprice() {
        return addprice;
    }

    public void setAddprice(String addprice) {
        this.addprice = addprice;
    }
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
    public String getPaymessage() {
        return paymessage;
    }

    public void setPaymessage(String paymessage) {
        this.paymessage = paymessage;
    }
    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getSingedpeople() {
        return singedpeople;
    }

    public void setSingedpeople(String singedpeople) {
        this.singedpeople = singedpeople;
    }
    public String getSubstitute() {
        return substitute;
    }

    public void setSubstitute(String substitute) {
        this.substitute = substitute;
    }

    @Override
    public String toString() {
        return "Games{" +
            "id=" + id +
            ", day=" + day +
            ", begintime=" + begintime +
            ", endtime=" + endtime +
            ", title=" + title +
            ", location=" + location +
            ", siteno=" + siteno +
            ", useball=" + useball +
            ", actiontype=" + actiontype +
            ", asklevel=" + asklevel +
            ", people=" + people +
            ", club=" + club +
            ", manager=" + manager +
            ", price=" + price +
            ", addperson=" + addperson +
            ", addprice=" + addprice +
            ", paytype=" + paytype +
            ", paymessage=" + paymessage +
            ", cancel=" + cancel +
            ", description=" + description +
            ", singedpeople=" + singedpeople +
            ", substitute=" + substitute +
        "}";
    }
}
