package com.lmonkey.servlet.user;

import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/adminlogin")
public class AdminLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");

//        System.out.println("userName:"+userName+"passWord:"+passWord);

        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
//      通过ID/em/mb 获得的密码
        Lmonkey_User lmonkey_user = lmonkey_userService.selectByid_em_mb(userName);

//        System.out.println(lmonkey_user);

        //  id/em/mb来登录
        if (lmonkey_user!=null && lmonkey_user.getUser_status()==2 && passWord.equals(lmonkey_user.getUser_password())){
            HttpSession session = req.getSession();
            session.setAttribute("isAdminLogin",2);  //管理员已登录
            session.setAttribute("name",lmonkey_user);
            resp.sendRedirect("/manage/admin_index.jsp");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.print("<script>");
            pw.print("alert('用户登录失败');");
            pw.print("location.href='/manage/login.jsp'");
            pw.print("</script>");
            pw.print("</script>");
            pw.close();
        }

    }

}
