package com.lmonkey.service.Imp;

import com.lmonkey.Factory.MapperFactory;
import com.lmonkey.dao.Lmonkey_CartDao;
import com.lmonkey.dao.Lmonkey_CategoryDao;
import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.service.Lmonkey_CartService;
import com.lmonkey.util.TransactionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_CartServiceImp implements Lmonkey_CartService {

    /**
     * 插入购物车实体
     * @param lmonkey_cart
     * @return
     */
    @Override
    public int insert(Lmonkey_Cart lmonkey_cart) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            int result = lmonkey_cartDao.insert(lmonkey_cart);
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
     * 根据用户ID得到该ID下购物车所有信息
     * @param cart_u_id
     * @return
     */
    @Override
    public ArrayList<Lmonkey_Cart> selectByUid(String cart_u_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            ArrayList<Lmonkey_Cart> lmonkey_carts = lmonkey_cartDao.selectByUid(cart_u_id);
            return lmonkey_carts;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 判断该商品在该用户的购物车中是否存在若存在只改变数量
     * @param cart_quantity
     * @param cart_u_id
     * @param cart_p_id
     * @return
     */
    @Override
    public int update(@Param("cart_quantity") Integer cart_quantity,
                      @Param("cart_u_id") String cart_u_id,
                      @Param("cart_p_id") Integer cart_p_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            int result = lmonkey_cartDao.update(cart_quantity,cart_u_id,cart_p_id);
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
     * 判断该商品在该用户的购物车中是否存在
     * @param cart_u_id
     * @param cart_p_id
     * @return
     */
    @Override
    public Lmonkey_Cart  selectByUidPid(String cart_u_id, Integer cart_p_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            Lmonkey_Cart  lmonkey_cart = lmonkey_cartDao.selectByUidPid(cart_u_id,cart_p_id);
            return lmonkey_cart;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 根据购物车ID删除购物车中信息
     * @param cart_id
     * @return
     */
    @Override
    public int delete(Integer cart_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            int result = lmonkey_cartDao.delete(cart_id);
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
     * 根据购物车ID查询
     * @param cart_id
     * @return
     */
    @Override
    public Lmonkey_Cart selectById(Integer cart_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CartDao lmonkey_cartDao = MapperFactory.getMapper(sqlSession, Lmonkey_CartDao.class);
            Lmonkey_Cart lmonkey_cart = lmonkey_cartDao.selectById(cart_id);
            return lmonkey_cart;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

}
