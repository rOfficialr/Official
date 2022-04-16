package com.lmonkey.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebFilter("/manage/*")
public class AdminLogin implements Filter {
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

        HttpSession session = req.getSession();
        Object flag = session.getAttribute("isAdminLogin");
        String requestURI = req.getRequestURI();    //访问的全路径
        String contextPath = req.getContextPath();  //上下文路径
        String substring = requestURI.substring(contextPath.length());
//        System.out.println(requestURI+":"+contextPath+":"+substring+":"+flag);
        PrintWriter writer = resp.getWriter();
//        如果路径中包含admin_ 对其判断
        if (substring.contains("admin_")){
            if (flag!=null && flag.equals(2)){    //表示已经登陆
                filterChain.doFilter(req,resp);
            }else {
                writer.print("<script>");
                writer.print("alert('请登录');");
                writer.print("location.href='login.jsp'");
                writer.print("</script>");
                writer.close();
                return;
            }
     //        如果路径中不包含admin_ 直接放行
        }else {
            filterChain.doFilter(req,resp);
        }

    }

    @Override
    public void destroy() {

    }
}
