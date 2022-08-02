package com.lmonkey.servlet.cart;

import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Lmonkey_CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除购物车里的记录
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/cartshopdel")
public class CartShopDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到购物车ID
        String cart_id = req.getParameter("esid");
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        int result = lmonkey_cartService.delete(Integer.parseInt(cart_id));
        System.out.println(result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
