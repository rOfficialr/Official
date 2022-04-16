package com.lmonkey.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 翟某人~
 * @version 1.0
 */

/**
 * 退出管理员页面登录
 */
@WebServlet("/manage/admin_loginout")
public class Admin_LoginOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        session.removeAttribute("name");    //删除登录信息
        session.removeAttribute("isAdminLogin");
        req.removeAttribute("isAdminLogin");
        req.removeAttribute("name");
        resp.sendRedirect("/manage/login.jsp");     //转到登录页面
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
