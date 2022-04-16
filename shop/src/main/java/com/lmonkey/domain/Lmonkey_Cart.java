package com.lmonkey.domain;

/**
 * 购物车实体类
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_Cart {
    private Integer cart_id;
    private String cart_p_filename;
    private String cart_p_name;
    private Integer cart_p_price;
    private Integer cart_quantity;
    private Integer cart_p_stock;
    private Integer cart_p_id;
    private String cart_u_id;
    private Integer cart_valid;

    public Lmonkey_Cart() {
    }

    public Lmonkey_Cart(Integer cart_id, String cart_p_filename, String cart_p_name, Integer cart_p_price, Integer cart_quantity, Integer cart_p_stock, Integer cart_p_id, String cart_u_id, Integer cart_valid) {
        this.cart_id = cart_id;
        this.cart_p_filename = cart_p_filename;
        this.cart_p_name = cart_p_name;
        this.cart_p_price = cart_p_price;
        this.cart_quantity = cart_quantity;
        this.cart_p_stock = cart_p_stock;
        this.cart_p_id = cart_p_id;
        this.cart_u_id = cart_u_id;
        this.cart_valid = cart_valid;
    }

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public String getCart_p_filename() {
        return cart_p_filename;
    }

    public void setCart_p_filename(String cart_p_filename) {
        this.cart_p_filename = cart_p_filename;
    }

    public String getCart_p_name() {
        return cart_p_name;
    }

    public void setCart_p_name(String cart_p_name) {
        this.cart_p_name = cart_p_name;
    }

    public Integer getCart_p_price() {
        return cart_p_price;
    }

    public void setCart_p_price(Integer cart_p_price) {
        this.cart_p_price = cart_p_price;
    }

    public Integer getCart_quantity() {
        return cart_quantity;
    }

    public void setCart_quantity(Integer cart_quantity) {
        this.cart_quantity = cart_quantity;
    }

    public Integer getCart_p_stock() {
        return cart_p_stock;
    }

    public void setCart_p_stock(Integer cart_p_stock) {
        this.cart_p_stock = cart_p_stock;
    }

    public Integer getCart_p_id() {
        return cart_p_id;
    }

    public void setCart_p_id(Integer cart_p_id) {
        this.cart_p_id = cart_p_id;
    }

    public String getCart_u_id() {
        return cart_u_id;
    }

    public void setCart_u_id(String cart_u_id) {
        this.cart_u_id = cart_u_id;
    }

    public Integer getCart_valid() {
        return cart_valid;
    }

    public void setCart_valid(Integer cart_valid) {
        this.cart_valid = cart_valid;
    }

    @Override
    public String toString() {
        return "Lmonkey_Cart{" +
                "cart_id=" + cart_id +
                ", cart_p_filename='" + cart_p_filename + '\'' +
                ", cart_p_name='" + cart_p_name + '\'' +
                ", cart_p_price=" + cart_p_price +
                ", cart_quantity=" + cart_quantity +
                ", cart_p_stock=" + cart_p_stock +
                ", cart_p_id=" + cart_p_id +
                ", cart_u_id='" + cart_u_id + '\'' +
                ", cart_valid=" + cart_valid +
                '}';
    }
}
