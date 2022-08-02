package com.lmonkey.servlet.user;

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
 * 用户ID核对
 *
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/usernamecheck")
public class UserNameCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        String user_id = req.getParameter("name");
        int result = lmonkey_userService.selectByID(user_id);
//        System.out.println(result);
        PrintWriter writer = resp.getWriter();
        if (result!=0){ //表示数据库中有该ID 则不能使用
            writer.print("false");
        }else { //数据库中无该ID 则能使用
            writer.print("true");
        }
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
