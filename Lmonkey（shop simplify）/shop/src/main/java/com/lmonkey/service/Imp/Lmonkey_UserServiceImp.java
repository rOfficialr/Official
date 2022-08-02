package com.lmonkey.service.Imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmonkey.Factory.MapperFactory;
import com.lmonkey.dao.Lmonkey_UserDao;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Lmonkey_UserService;
import com.lmonkey.util.TransactionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_UserServiceImp implements Lmonkey_UserService {
    /**
     * 全查询
     * @return
     */
    @Override
    public List<Lmonkey_User> selectAll() {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            List<Lmonkey_User> all = lmonkey_userDao.selectAll();
            return all;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }
    /**
     * 插入
     * @param lmonkey_user
     * @return
     */
    @Override
    public int insert(Lmonkey_User lmonkey_user) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.insert(lmonkey_user);
//        提交
            TransactionUtil.commit(sqlSession);
            return result;
        } catch (Exception e) {
            //若出现异常则回滚
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 删除
     * @param user_id
     * @return
     */
    @Override
    public int delete(String user_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.delete(user_id);
//        提交
            TransactionUtil.commit(sqlSession);
            return result;
        } catch (Exception e) {
            //若出现异常则回滚
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 更新
     * @param lmonkey_user
     * @return
     */
    @Override
    public int update(Lmonkey_User lmonkey_user) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.update(lmonkey_user);
            //        提交
            TransactionUtil.commit(sqlSession);
            return result;
        } catch (Exception e) {
            //若出现异常则回滚
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 通过关键字查询
     * @param name
     * @return
     */
    @Override
    public List<Lmonkey_User> selectByKey(String name) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            List<Lmonkey_User> all = lmonkey_userDao.selectByKey(name);
            return all;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 分页查询
     * @param page 页码
     * @param size 每页显示的数据总量
     * @return
     */
    @Override
    public PageInfo selectAll(int page, int size) {
        SqlSession sqlSession = null;
        try{
            //1.获取SqlSession
            sqlSession = MapperFactory.getSqlSession();
            //2.获取Dao
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            //3.调用Dao层操作
            PageHelper.startPage(page,size);
            List<Lmonkey_User> all = lmonkey_userDao.selectAll();
//            分页
            PageInfo pageInfo = new PageInfo(all);
            return pageInfo;
        }catch (Exception e){
            throw new RuntimeException(e);
            //记录日志
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 全查询的总条数
     * @return
     */
    @Override
    public int selectTotalPage() {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.selectTotalPage();
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * 条件查询
     * @param page
     * @param size
     * @param name
     * @return
     */
    @Override
    public PageInfo selectByKey(int page, int size, String name) {
        SqlSession sqlSession = null;
        try{
            //1.获取SqlSession
            sqlSession = MapperFactory.getSqlSession();
            //2.获取Dao
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            //3.调用Dao层操作
            PageHelper.startPage(page,size);
            List<Lmonkey_User> all = lmonkey_userDao.selectByKey(name);
//            分页
            PageInfo pageInfo = new PageInfo(all);
            return pageInfo;
        }catch (Exception e){
            throw new RuntimeException(e);
            //记录日志
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 条件查询的总条数
     * @param name
     * @return
     */
    @Override
    public int selectTotalPageByKey(String name) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.selectTotalPageByKey(name);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    /**
     * ID查询返回总条数0/1
     * @param user_id
     * @return
     */
    @Override
    public int selectByID(String user_id) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            int result = lmonkey_userDao.selectByID(user_id);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

    @Override
    public Lmonkey_User selectByid_em_mb(String userName) {
        SqlSession sqlSession = null;
        try {
            //调用工厂类的方法获得sqlSession 等
            sqlSession = MapperFactory.getSqlSession();
            Lmonkey_UserDao lmonkey_userDao = MapperFactory.getMapper(sqlSession, Lmonkey_UserDao.class);
            Lmonkey_User lmonkey_user = lmonkey_userDao.selectByid_em_mb(userName);
            return lmonkey_user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            TransactionUtil.close(sqlSession);
        }
    }

}
