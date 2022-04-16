package com.lmonkey.service.Imp;

import com.lmonkey.Factory.MapperFactory;
import com.lmonkey.dao.Lmonkey_CategoryDao;
import com.lmonkey.dao.Lmonkey_ProductDao;
import com.lmonkey.dao.Lmonkey_UserDao;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Lmonkey_ProductService;
import com.lmonkey.util.TransactionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_ProductServiceImp implements Lmonkey_ProductService {
    @Override
    public List<Lmonkey_Product> selectAll() {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            List<Lmonkey_Product> lmonkey_products = lmonkey_productDao.selectAll();
            return lmonkey_products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 插入
     * @param lmonkey_product
     * @return
     */
    @Override
    public int insert(Lmonkey_Product lmonkey_product) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            int result = lmonkey_productDao.insert(lmonkey_product);
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
     * 根据父ID查询
     * @param product_fid
     * @return
     */
    @Override
    public ArrayList<Lmonkey_Product> selectByFid(Integer product_fid) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            ArrayList<Lmonkey_Product> lmonkey_products = lmonkey_productDao.selectByFid(product_fid);
            return lmonkey_products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 根据子ID查询
     * @param product_cid
     * @return
     */
    @Override
    public ArrayList<Lmonkey_Product> selectByCid(Integer product_cid) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            ArrayList<Lmonkey_Product> lmonkey_products = lmonkey_productDao.selectByCid(product_cid);
            return lmonkey_products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 删除
     * @param product_id
     * @return
     */
    @Override
    public int delete(Integer product_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            int result = lmonkey_productDao.delete(product_id);
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

    @Override
    public int update(Lmonkey_Product lmonkey_product) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            int result = lmonkey_productDao.update(lmonkey_product);
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
     * 通过ID查询
     * @param product_id
     * @return
     */
    @Override
    public Lmonkey_Product selectById(Integer product_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_ProductDao lmonkey_productDao = MapperFactory.getMapper(sqlSession, Lmonkey_ProductDao.class);
            Lmonkey_Product lmonkey_product = lmonkey_productDao.selectById(product_id);
            return lmonkey_product;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }
}
