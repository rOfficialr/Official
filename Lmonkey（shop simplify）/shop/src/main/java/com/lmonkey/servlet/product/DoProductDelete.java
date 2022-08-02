package com.lmonkey.servlet.product;

import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 删除
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_doproductdelete")
public class DoProductDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String product_id = req.getParameter("id");
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        int result = lmonkey_productService.delete(Integer.parseInt(product_id));

        //重定向
        if (result>0){  //结果大于0 则表示删除成功 页面重定向到product界面
            resp.sendRedirect("/manage/admin_productselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('产品删除失败');");
            pw.write("location.herf='/manage/admin_productselect'");
            pw.write("</script>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
