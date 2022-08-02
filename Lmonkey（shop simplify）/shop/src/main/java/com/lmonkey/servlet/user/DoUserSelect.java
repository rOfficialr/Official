package com.lmonkey.servlet.user;

import com.github.pagehelper.PageInfo;
import com.lmonkey.dao.Lmonkey_UserDao;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_douserselect")
public class DoUserSelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        int cpage = 1;//当前页
        int count = 5;//每页显示条数
        int page = 0;//总页数
        String cp = req.getParameter("cp");
        //获得得到的关键字
        String keywords = req.getParameter("keywords");
        System.out.println(keywords);
        PageInfo list = null;
        int sum = 0;
        if (cp!=null){
            cpage = Integer.parseInt(cp);
        }
        //调用业务层查询方法返回一个数组；


        if (keywords != null){  //若已经输入则执行条件查询
            //条件查询并分页
            list = lmonkey_userService.selectByKey(cpage, count, keywords);
            sum = lmonkey_userService.selectTotalPageByKey(keywords);//条件查询总条数
        }else {
            //查询并分页
            list = lmonkey_userService.selectAll(cpage, count);
            sum = lmonkey_userService.selectTotalPage();    //全查总条数
        }
        //算总页数
        if (sum%count==0){
            page = sum/count;
        }else { page = sum/count +1;}
//        放到请求域里
        req.setAttribute("userlist",list);
        req.setAttribute("cpage",cpage);   //当前页
        req.setAttribute("tsum",sum);   //总条数
        req.setAttribute("tpage",page); //总页数
        if (keywords!=null){
            //拼接路径  用来实现条件查询时点=击下一页时仍然是条件查询
            req.setAttribute("searchParams","&keywords="+keywords);
        }
//        请求转发
        req.getRequestDispatcher("admin_user.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
