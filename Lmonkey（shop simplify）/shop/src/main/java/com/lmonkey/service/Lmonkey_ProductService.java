package com.lmonkey.service;

import com.lmonkey.domain.Lmonkey_Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_ProductService {
    //    查询全部
    List<Lmonkey_Product> selectAll();
    //插入
    int insert(Lmonkey_Product lmonkey_product);
    //根据父ID查询
    ArrayList<Lmonkey_Product> selectByFid(Integer product_fid);
    //根据子ID查询
    ArrayList<Lmonkey_Product> selectByCid(Integer product_cid);
    //根据ID删除
    int delete(Integer product_id);
    //更新
    int update(Lmonkey_Product lmonkey_product);
    //根据ID查询
    Lmonkey_Product selectById(Integer product_id);
}
