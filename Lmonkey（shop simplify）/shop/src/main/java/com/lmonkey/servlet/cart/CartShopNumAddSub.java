package com.lmonkey.servlet.cart;

import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Lmonkey_CartService;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 购物车中通过点击加减号来改变数据库中购物车中的数据
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/cartshopnumadd")
public class CartShopNumAddSub extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到通过点击加减号获得的数量
        String count = req.getParameter("count");

        //得到购物车中该商品ID
        String esid = req.getParameter("esid");

        //得到用户信息
        HttpSession session = req.getSession();
        Lmonkey_User user = (Lmonkey_User)session.getAttribute("name");
//        System.out.println(user);
        //通过商品ID来更新数量
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        int result = lmonkey_cartService.update(Integer.parseInt(count),
                user.getUser_id(),
                Integer.parseInt(esid));

//        System.out.println("result"+result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
