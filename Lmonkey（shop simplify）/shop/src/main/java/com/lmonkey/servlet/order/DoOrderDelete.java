package com.lmonkey.servlet.order;

import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Lmonkey_OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 删除订单
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_doorderdel")
public class DoOrderDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
        int result = lmonkey_orderService.deleteByid(Integer.parseInt(id));
        if (result>0){
            //        请求转发
            req.getRequestDispatcher("/manage/admin_orderselect").forward(req,resp);
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('订单删除失败');");
            pw.write("location.herf='/manage/admin_orderselect'");
            pw.write("</script>");
            pw.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
