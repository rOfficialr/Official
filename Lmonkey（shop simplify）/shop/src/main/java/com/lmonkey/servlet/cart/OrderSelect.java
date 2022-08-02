package com.lmonkey.servlet.cart;

import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Lmonkey_CartService;

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
 * 结算订单--->去支付
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/orderselect")
public class OrderSelect extends HttpServlet {
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

        //得到被选中的商品的购物车ID
        String cart_ids = req.getParameter("eids");
        Lmonkey_User user = (Lmonkey_User)session.getAttribute("name");
        ArrayList<Lmonkey_Cart> list = new ArrayList<>();
        //已经登陆
        if (user!=null && (("1".equals(islogin)) || ("2".equals(isadminlogin)))){
            int totalprice = 0;
            String[] ids = cart_ids.split(",");
            for (String cart_id:ids){
                Lmonkey_Cart lmonkey_cart = lmonkey_cartService.selectById(Integer.parseInt(cart_id));
                //总价
                totalprice = totalprice+lmonkey_cart.getCart_quantity()*lmonkey_cart.getCart_p_price();
                list.add(lmonkey_cart);
            }
            //传递订单参数
            session.setAttribute("list",list);

            req.setAttribute("shoplist",list);
            req.setAttribute("totalprice",totalprice);
            //转到订单页面
            req.getRequestDispatcher("order.jsp").forward(req,resp);

        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('未登录，请重新登录');");
            // 返回到分类修改页面
            pw.print("location.href='login.jsp'");
            pw.write("</script>");
            pw.close();
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
