package com.lmonkey.domain;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_Product {
    private Integer product_id;
    private String product_name;
    private String product_description;
    private Integer product_price;
    private Integer product_stock;
    private Integer product_fid;
    private Integer product_cid;
    private String product_filename ;

    public Lmonkey_Product() {
    }

    public Lmonkey_Product(Integer product_id, String product_name, String product_description, Integer product_price,
                           Integer product_stock, Integer product_fid, Integer product_cid, String product_filename) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
        this.product_stock = product_stock;
        this.product_fid = product_fid;
        this.product_cid = product_cid;
        this.product_filename = product_filename;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }

    public Integer getProduct_fid() {
        return product_fid;
    }

    public void setProduct_fid(Integer product_fid) {
        this.product_fid = product_fid;
    }

    public Integer getProduct_cid() {
        return product_cid;
    }

    public void setProduct_cid(Integer product_cid) {
        this.product_cid = product_cid;
    }

    public String getProduct_filename() {
        return product_filename;
    }

    public void setProduct_filename(String product_filename) {
        this.product_filename = product_filename;
    }

    @Override
    public String toString() {
        return "Lmonkey_Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_price=" + product_price +
                ", product_stock=" + product_stock +
                ", product_fid=" + product_fid +
                ", product_cid=" + product_cid +
                ", product_filename='" + product_filename + '\'' +
                '}';
    }
}
