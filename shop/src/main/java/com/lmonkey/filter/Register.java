package com.lmonkey.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 对注册信息过滤
 * @author 翟某人~
 * @version 1.0
 */
@WebFilter("/register")
public class Register implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String user_id = req.getParameter("userName");
        PrintWriter writer = resp.getWriter();
        if (user_id.equals("")){
            writer.print("<script>");
            writer.print("alert('ID不能为空');");
            writer.print("location.href='reg.jsp'");
            writer.print("</script>");
            writer.close();
            return; //return直接就返回到被过滤页面
        }

        String passWord = req.getParameter("passWord");
        String rePassWord = req.getParameter("rePassWord");
        //密码为空或者两次密码不一致
        if (passWord==null || !(passWord.equals(rePassWord))){
            writer.print("<script>");
            writer.print("alert('密码为空或者输入不一致');");
            writer.print("location.href='reg.jsp'");
            writer.print("</script>");
            writer.close();
            return; //return直接就返回到被过滤页面
        }

        //放行
        filterChain.doFilter(req,resp);
    }

    @Override
    public void destroy() {

    }
}
