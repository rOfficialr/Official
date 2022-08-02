package com.lmonkey.servlet.user;

import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_touserupdate")
public class ToUserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        Lmonkey_User user = null;
                String user_id = req.getParameter("user_id");
        //模糊查询所以返回一个数组
        List<Lmonkey_User> lmonkey_users = lmonkey_userService.selectByKey(user_id);
        for (Lmonkey_User lmonkey_user:lmonkey_users){
            user = lmonkey_user;
        }
        String cpage = req.getParameter("cpage");
        req.setAttribute("user",user);
        //从user.jsp中得到页数传给usermodify.jsp
        req.setAttribute("cpage",cpage);
        //重定向到页面
        req.getRequestDispatcher("admin_usermodify.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
