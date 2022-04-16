package com.lmonkey.dao;

import com.lmonkey.domain.Lmonkey_Category;

import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_CategoryDao {
    //    查询全部分类
    List<Lmonkey_Category> selectAll();
    //插入
    int insert(Lmonkey_Category lmonkey_category);
    //根据ID查询
    Lmonkey_Category selectByID(Integer cate_id);
    //根据ID修改
    int update(Lmonkey_Category lmonkey_category);
    //根据ID删除
    int delete(Integer cate_id);

}
