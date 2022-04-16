package com.lmonkey.servlet.order;

import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Lmonkey_OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 查询所有订单
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_orderselect")
public class DoOrderSelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
        ArrayList<Lmonkey_Order> lmonkey_orders = lmonkey_orderService.selectAll();

        req.setAttribute("orderlist",lmonkey_orders);
        //        请求转发
        req.getRequestDispatcher("admin_order.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
