package com.lmonkey.servlet.order;

import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Lmonkey_OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 订单详情
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/orderxq")
public class Orderxq extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
        HttpSession session = req.getSession();
        Lmonkey_User user = (Lmonkey_User)session.getAttribute("name");
//        String order_id = (String)req.getAttribute("id");
        String order_id = req.getParameter("id");

        //得到普通用户登录记录
        Object isLogin = session.getAttribute("isLogin");
        String islogin = String.valueOf(isLogin);
        //得到管理员登录记录
        Object isAdminLogin = session.getAttribute("isAdminLogin");
        String isadminlogin = String.valueOf(isAdminLogin);

        if ((("1".equals(islogin)) || ("2".equals(isadminlogin)))) {
            Lmonkey_Order lmonkey_order = lmonkey_orderService.selectById(Integer.parseInt(order_id));
            req.setAttribute("order_u",lmonkey_order);
            req.getRequestDispatcher("orderxq.jsp").forward(req, resp);
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('请重新登录');");
            // 返回到分类修改页面
            pw.print("location.href='login.jsp'");
            pw.write("</script>");
            pw.close();
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
