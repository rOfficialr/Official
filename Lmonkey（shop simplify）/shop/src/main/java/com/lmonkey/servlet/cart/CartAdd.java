package com.lmonkey.servlet.cart;

import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_CartService;
import com.lmonkey.service.Lmonkey_ProductService;

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
 * 加入购物车
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/cartadd")
public class CartAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        Lmonkey_Product p = null;
        String product_id = req.getParameter("id");
//        System.out.println(product_id);

        String count = req.getParameter("count");
        String url = req.getParameter("url");
        HttpSession session = req.getSession();
        //得到普通用户登录记录
        Object isLogin = session.getAttribute("isLogin");
        String islogin = String.valueOf(isLogin);
        //得到管理员登录记录
        Object isAdminLogin = session.getAttribute("isAdminLogin");
        String isadminlogin = String.valueOf(isAdminLogin);

        Lmonkey_User user = (Lmonkey_User)session.getAttribute("name");
//        System.out.println(user);
        //已经登陆
        if (user!=null && (("1".equals(islogin)) || ("2".equals(isadminlogin)))){
            //获得该用户ID
            String user_id = user.getUser_id();
            if (product_id != null){
                //通过商品ID获得该商品全部信息
                p = lmonkey_productService.selectById(Integer.parseInt(product_id));

            }
            Lmonkey_Cart lmonkey_cart = new Lmonkey_Cart(null,
                    p.getProduct_filename(),
                    p.getProduct_name(),
                    p.getProduct_price(),
                    Integer.parseInt(count),
                    p.getProduct_stock(),
                    Integer.parseInt(product_id),
                    user_id,
                    1);
            //判断该商品在该用户的购物车中是否存在若存在只改变数量
            Lmonkey_Cart count_u_p = lmonkey_cartService.selectByUidPid(user_id, Integer.parseInt(product_id));
            //购物车已经存在该商品
            if (count_u_p!=null){
                //得到的数量加上数据库中原本的数量进行更新
                Integer newcount = Integer.parseInt(count) + count_u_p.getCart_quantity();
                if (newcount>5){    //限购九件
                    newcount = 5;
                }
                int update_result = lmonkey_cartService.update(newcount,
                        user_id,
                        Integer.parseInt(product_id));
            }else { //若该用户的购物车原本不存在该商品则进行插入
                //添加到购物车
                lmonkey_cartService.insert(lmonkey_cart);
                //        通过用户ID的到该用户的购物车
                ArrayList<Lmonkey_Cart> lmonkey_carts = lmonkey_cartService.selectByUid(user_id);
                //            传递用户购物车对象数量
                session.setAttribute("u_cart_size",lmonkey_carts.size());
            }
//            System.out.println(lmonkey_cart);
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
        //根据url的值来判断是否跳转到购物车页面
        if("z".equals(url)){
            resp.sendRedirect("/showcart");
        }else {
            resp.sendRedirect("/selectproductview?id="+product_id);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
