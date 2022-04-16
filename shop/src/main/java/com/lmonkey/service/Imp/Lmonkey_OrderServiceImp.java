package com.lmonkey.service.Imp;

import com.lmonkey.Factory.MapperFactory;
import com.lmonkey.dao.Lmonkey_CartDao;
import com.lmonkey.dao.Lmonkey_OrderDao;
import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.service.Lmonkey_OrderService;
import com.lmonkey.util.TransactionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_OrderServiceImp implements Lmonkey_OrderService {

    /**
     * 订单插入
     * @param lmonkey_order
     * @return
     */
    @Override
    public int insert(Lmonkey_Order lmonkey_order) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_OrderDao lmonkey_orderDao = MapperFactory.getMapper(sqlSession, Lmonkey_OrderDao.class);
            int result = lmonkey_orderDao.insert(lmonkey_order);
            //        提交
            TransactionUtil.commit(sqlSession);
            return result;
        } catch (Exception e) {
            //若出现异常则回滚
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 查询订单通过uid
     * @param order_uid
     * @return
     */
    @Override
    public ArrayList<Lmonkey_Order> selectByUid(String order_uid) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_OrderDao lmonkey_orderDao = MapperFactory.getMapper(sqlSession, Lmonkey_OrderDao.class);
            ArrayList<Lmonkey_Order> lmonkey_orders = lmonkey_orderDao.selectByUid(order_uid);
            return lmonkey_orders;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 查询订单通过id
     * @param order_id
     * @return
     */
    @Override
    public Lmonkey_Order selectById(Integer order_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_OrderDao lmonkey_orderDao = MapperFactory.getMapper(sqlSession, Lmonkey_OrderDao.class);
            Lmonkey_Order lmonkey_order = lmonkey_orderDao.selectById(order_id);
            return lmonkey_order;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 查询所有订单
     * @return
     */
    @Override
    public ArrayList<Lmonkey_Order> selectAll() {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_OrderDao lmonkey_orderDao = MapperFactory.getMapper(sqlSession, Lmonkey_OrderDao.class);
            ArrayList<Lmonkey_Order> lmonkey_order = lmonkey_orderDao.selectAll();
            return lmonkey_order;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 根据ID删除
     * @param order_id
     * @return
     */
    @Override
    public int deleteByid(Integer order_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_OrderDao lmonkey_orderDao = MapperFactory.getMapper(sqlSession, Lmonkey_OrderDao.class);
            int result = lmonkey_orderDao.deleteByid(order_id);
            //        提交
            TransactionUtil.commit(sqlSession);
            return result;
        } catch (Exception e) {
            //若出现异常则回滚
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }
}
