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
@WebServlet("/manage/admin_douserupdate")
public class DoUserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        Lmonkey_User lmonkey_user = new Lmonkey_User();
        String user_id = req.getParameter("user_id");
//        System.out.println("得到的id="+user_id);
        String user_name = req.getParameter("user_name");
        String user_password = req.getParameter("user_password");
        String user_sex = req.getParameter("user_sex");
        String user_birthday = req.getParameter("user_birthday");
        String user_email = req.getParameter("user_email");
        String user_mobile = req.getParameter("user_mobile");
        String user_address = req.getParameter("user_address");
        lmonkey_user.setUser_id(user_id);
        lmonkey_user.setUser_name(user_name);
        lmonkey_user.setUser_password(user_password);
        lmonkey_user.setUser_sex(user_sex);
        lmonkey_user.setUser_birthday(user_birthday);
        lmonkey_user.setUser_email(user_email);
        lmonkey_user.setUser_mobile(user_mobile);
        lmonkey_user.setUser_address(user_address);
        int result = lmonkey_userService.update(lmonkey_user);
        //重定向
        if (result>0){  //结果大于0 则表示插入成功 页面重定向到user界面
            String cpage = req.getParameter("cpage");
            System.out.println("cpage="+cpage);
//            resp.sendRedirect("/manage/admin_douserselect");
            resp.sendRedirect("/manage/admin_douserselect?cp="+req.getParameter("cpage"));
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('用户修改失败');");
            pw.write("location.herf='/manage/admin_douserselect'");
            pw.write("</script>");
        }
    }
}
