package com.lmonkey.servlet.user;

import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
        String name = req.getParameter("name");
        String pwd = req.getParameter("passWord");
        String sex = req.getParameter("sex");
        String year = req.getParameter("birthday");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String address = req.getParameter("address");

        Lmonkey_User lmonkey_user = new Lmonkey_User(userName,name,pwd,sex,year,
                null,email,mobile,address,1);

        //添加到数据库中
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        int result = lmonkey_userService.insert(lmonkey_user);

        //重定向
        if (result>0){  //结果大于0 则表示插入成功 页面重定向到user界面
            resp.sendRedirect("/login.jsp");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.print("<script>");
            pw.print("alert('用户注册失败');");
            pw.print("location.herf='reg.jsp'");
            pw.print("</script>");
        }
    }
}
