package com.lmonkey.domain;

import java.sql.Date;

/**
 * 订单实体
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_Order {
    private Integer order_id;   //订单ID
    private String order_uid;   //用户ID
    private String order_pfilename; //图片
    private String order_pname;     //商品名
    private Integer order_pid;  //商品ID
    private Integer order_quantity;     //商品数量
    private Integer order_price;    //商品总价格
    private String order_date;

    public Lmonkey_Order() {
    }

    public Lmonkey_Order(Integer order_id, String order_uid, String order_pfilename, String order_pname, Integer order_pid, Integer order_quantity, Integer order_price, String order_date) {
        this.order_id = order_id;
        this.order_uid = order_uid;
        this.order_pfilename = order_pfilename;
        this.order_pname = order_pname;
        this.order_pid = order_pid;
        this.order_quantity = order_quantity;
        this.order_price = order_price;
        this.order_date = order_date;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_uid() {
        return order_uid;
    }

    public void setOrder_uid(String order_uid) {
        this.order_uid = order_uid;
    }

    public String getOrder_pfilename() {
        return order_pfilename;
    }

    public void setOrder_pfilename(String order_pfilename) {
        this.order_pfilename = order_pfilename;
    }

    public String getOrder_pname() {
        return order_pname;
    }

    public void setOrder_pname(String order_pname) {
        this.order_pname = order_pname;
    }

    public Integer getOrder_pid() {
        return order_pid;
    }

    public void setOrder_pid(Integer order_pid) {
        this.order_pid = order_pid;
    }

    public Integer getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(Integer order_quantity) {
        this.order_quantity = order_quantity;
    }

    public Integer getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Integer order_price) {
        this.order_price = order_price;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    @Override
    public String toString() {
        return "Lmonkey_Order{" +
                "order_id=" + order_id +
                ", order_uid='" + order_uid + '\'' +
                ", order_pfilename='" + order_pfilename + '\'' +
                ", order_pname='" + order_pname + '\'' +
                ", order_pid=" + order_pid +
                ", order_quantity=" + order_quantity +
                ", order_price=" + order_price +
                ", order_date='" + order_date + '\'' +
                '}';
    }
}
