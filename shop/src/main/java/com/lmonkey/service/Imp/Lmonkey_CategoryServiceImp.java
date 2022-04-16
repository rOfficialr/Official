package com.lmonkey.service.Imp;

import com.lmonkey.Factory.MapperFactory;
import com.lmonkey.dao.Lmonkey_CategoryDao;
import com.lmonkey.dao.Lmonkey_UserDao;
import com.lmonkey.domain.Lmonkey_Category;
import com.lmonkey.service.Lmonkey_CategoryService;
import com.lmonkey.util.TransactionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_CategoryServiceImp implements Lmonkey_CategoryService {
    /**
     * 查询所有分类的实现方法
     * @return
     */
    @Override
    public List<Lmonkey_Category> selectAll() {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CategoryDao lmonkey_categoryDao = MapperFactory.getMapper(sqlSession, Lmonkey_CategoryDao.class);
            List<Lmonkey_Category> lmonkey_categories = lmonkey_categoryDao.selectAll();
            return lmonkey_categories;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 插入分类
     * @param lmonkey_category
     * @return
     */
    @Override
    public int insert(Lmonkey_Category lmonkey_category) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CategoryDao lmonkey_categoryDao = MapperFactory.getMapper(sqlSession, Lmonkey_CategoryDao.class);
            int result = lmonkey_categoryDao.insert(lmonkey_category);
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
     * 根据ID查询
     * @param cate_id
     * @return
     */
    @Override
    public Lmonkey_Category selectByID(Integer cate_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CategoryDao lmonkey_categoryDao = MapperFactory.getMapper(sqlSession, Lmonkey_CategoryDao.class);
            Lmonkey_Category lmonkey_category = lmonkey_categoryDao.selectByID(cate_id);
            return lmonkey_category;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 修改
     * @param lmonkey_category
     * @return
     */
    @Override
    public int update(Lmonkey_Category lmonkey_category) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CategoryDao lmonkey_categoryDao = MapperFactory.getMapper(sqlSession, Lmonkey_CategoryDao.class);
            int result = lmonkey_categoryDao.update(lmonkey_category);
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
     * 删除
     * @param cate_id
     * @return
     */
    @Override
    public int delete(Integer cate_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_CategoryDao lmonkey_categoryDao = MapperFactory.getMapper(sqlSession, Lmonkey_CategoryDao.class);
            int result = lmonkey_categoryDao.delete(cate_id);
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
