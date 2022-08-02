package com.lmonkey.servlet.order;

import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Lmonkey_CartService;
import com.lmonkey.service.Lmonkey_OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 我的订单
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/myorderq")
public class MyOrderq extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        HttpSession session = req.getSession();
        //得到普通用户登录记录
        Object isLogin = session.getAttribute("isLogin");
        String islogin = String.valueOf(isLogin);
        //得到管理员登录记录
        Object isAdminLogin = session.getAttribute("isAdminLogin");
        String isadminlogin = String.valueOf(isAdminLogin);

        Lmonkey_User user = (Lmonkey_User) session.getAttribute("name");

        //已经登陆
        if (user != null && (("1".equals(islogin)) || ("2".equals(isadminlogin)))) {
            ArrayList<Lmonkey_Cart> list = (ArrayList<Lmonkey_Cart>)session.getAttribute("list");
            //得到被选中的商品的购物车ID
            Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
            ArrayList<Lmonkey_Order> lmonkey_orders = lmonkey_orderService.selectByUid(user.getUser_id());
            //            传递订单中的信息
            req.setAttribute("orderlist", lmonkey_orders);
            //传递用户订单数量
            session.setAttribute("order_count",lmonkey_orders.size());
            req.getRequestDispatcher("myorderq.jsp").forward(req, resp);
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