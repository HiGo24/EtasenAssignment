package com.TickerData.EtasensAssignment.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TickerMain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String symbol;
    private Long open;


    private  Long close;
    private Date date1;
    public int getId() {
        return id;
    }
    public String getSymbol() {
        return symbol;
    }
    public Long getOpen() {
        return open;
    }
    public Long getClose() {
        return close;
    }
    public Date getDate1() {
        return date1;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setOpen(Long open) {
        this.open = open;
    }
    public void setClose(Long close) {
        this.close = close;
    }
    public void setDate1(Date date1) {
        this.date1 = date1;
    }


}
