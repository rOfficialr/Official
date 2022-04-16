package com.lmonkey.servlet.product;

import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_ProductService;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 查询商品
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_productselect")
public class ProductSelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        List<Lmonkey_Product> lmonkey_products = lmonkey_productService.selectAll();
        req.setAttribute("plist",lmonkey_products);
        //重定向到前端首页
        req.getRequestDispatcher("admin_product.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
