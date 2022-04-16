package com.lmonkey.domain;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_Category {
    private Integer cate_id;
    private String cate_name;
    private Integer cate_parent_id;

    public Lmonkey_Category() {
    }

    public Lmonkey_Category(Integer cate_id, String cate_name, Integer cate_parent_id) {
        this.cate_id = cate_id;
        this.cate_name = cate_name;
        this.cate_parent_id = cate_parent_id;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public Integer getCate_parent_id() {
        return cate_parent_id;
    }

    public void setCate_parent_id(Integer cate_parent_id) {
        this.cate_parent_id = cate_parent_id;
    }

    @Override
    public String toString() {
        return "Lmonkey_Category{" +
                "cate_id=" + cate_id +
                ", cate_name='" + cate_name + '\'' +
                ", cate_parent_id=" + cate_parent_id +
                '}';
    }
}
