package com.lmonkey.dao;

import com.lmonkey.domain.Lmonkey_User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_UserDao {
    //查
    List<Lmonkey_User> selectAll();
    //增
    int insert(Lmonkey_User lmonkey_user);
    //删
    int delete(String user_id);
    //改
    int update(Lmonkey_User lmonkey_user);
    //查总条数
    int selectTotalPage();
    //通过条件查询
    List<Lmonkey_User> selectByKey(String name);
    //查总条数
    int selectTotalPageByKey(String name);
    //ID查询
    int selectByID(String user_id);
    //通过id/邮箱/电话获得普通用户信息
    Lmonkey_User selectByid_em_mb(String userName);

}
