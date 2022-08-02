package com.lmonkey.service;

import com.github.pagehelper.PageInfo;
import com.lmonkey.domain.Lmonkey_User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public interface Lmonkey_UserService {
    //查
    List<Lmonkey_User> selectAll();
    //增
    int insert(Lmonkey_User lmonkey_user);
    //删
    int delete(String user_id);
    //改
    int update(Lmonkey_User lmonkey_user);
    //通过条件查询
    List<Lmonkey_User> selectByKey(String name);
    /**
     * 分页查询数据
     * @param page 页码
     * @param size 每页显示的数据总量
     */
    PageInfo selectAll(int page, int size);
    //查总条数
    int selectTotalPage();
    //通过条件查询并分页
    PageInfo selectByKey(int page, int size, String name);
    //查总条数
    int selectTotalPageByKey(String name);
    //ID查询
    int selectByID(String user_id);
    //通过id/邮箱/电话获得信息
    Lmonkey_User selectByid_em_mb(String userName);

}
