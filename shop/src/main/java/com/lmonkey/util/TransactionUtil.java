package com.lmonkey.util;

import org.apache.ibatis.session.SqlSession;

/**
 * @author 翟某人~
 * @version 1.0
 */

/**
 * 事物控制，
 * mybatis
 */
public class TransactionUtil {
    public static void commit(SqlSession sqlSession){
        if(sqlSession!=null) {
            sqlSession.commit();
        }
    }

    /**
     * 回滚释放
     * @param sqlSession
     */
    public static void rollback(SqlSession sqlSession){
        if(sqlSession!=null) {
            sqlSession.rollback();
        }
    }

    /**
     * 单独释放
     * @param sqlSession
     */
    public static void close(SqlSession sqlSession){
        if(sqlSession!=null) sqlSession.close();
    }
}
