package com.lmonkey.dao;

import com.lmonkey.domain.Lmonkey_Cart;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_CartDao {
    //插入购物车实体
    int insert(Lmonkey_Cart lmonkey_cart);
    //根据用户ID得到该ID下购物车所有信息
    ArrayList<Lmonkey_Cart> selectByUid(String cart_u_id);

    //改变该商品在该用户的购物车中数量
//    int update(Integer cart_quantity,String cart_u_id,Integer cart_p_id);
    int update(@Param("cart_quantity") Integer cart_quantity,
               @Param("cart_u_id") String cart_u_id,
               @Param("cart_p_id") Integer cart_p_id);
    //判断该商品在该用户的购物车中是否存在
    Lmonkey_Cart selectByUidPid(@Param("cart_u_id") String cart_u_id,
                       @Param("cart_p_id") Integer cart_p_id);
    //根据购物车ID删除购物车中信息
    int delete(Integer cart_id);
    //根据购物车ID查询
    Lmonkey_Cart selectById(Integer cart_id);
}
