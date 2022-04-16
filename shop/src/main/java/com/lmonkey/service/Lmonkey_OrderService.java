package com.lmonkey.service;

import com.lmonkey.domain.Lmonkey_Order;

import java.util.ArrayList;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_OrderService {
    //订单插入
    int insert(Lmonkey_Order lmonkey_order);
    //查询订单通过uid
    ArrayList<Lmonkey_Order> selectByUid(String order_uid);
    //查询订单通过id
    Lmonkey_Order selectById(Integer order_id);
    //查询订单
    ArrayList<Lmonkey_Order> selectAll();
    //根据ID删除
    int deleteByid(Integer order_id);
}
