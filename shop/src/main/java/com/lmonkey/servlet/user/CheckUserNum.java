package com.lmonkey.servlet.user;

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

/**
 * 校验验证码
 */
@WebServlet("/checkusernum")
public class CheckUserNum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String num = req.getParameter("num");//得到输入的验证码
        String num_1ow = num.toLowerCase();// 将字符串中的字母全部转换为小写，非字母不受影响
        HttpSession session = req.getSession();
        String sysCode = (String) session.getAttribute("code");//得到正确的验证码
        String sysCode_low = sysCode.toLowerCase();
        PrintWriter writer = resp.getWriter();
        if (sysCode_low.equals(num_1ow)){
            writer.print("true");
        }else {
            writer.print("false");
        }
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
