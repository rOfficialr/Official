package com.lmonkey.servlet.home;

import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_CartService;
import com.lmonkey.service.Lmonkey_OrderService;
import com.lmonkey.service.Lmonkey_ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 支付成功  清理掉购物车内已经购买的东西
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/paymentOk")
public class PaymentOK extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        HttpSession session = req.getSession();
        //得到普通用户登录记录
        Object isLogin = session.getAttribute("isLogin");
        String islogin = String.valueOf(isLogin);
        //得到管理员登录记录
        Object isAdminLogin = session.getAttribute("isAdminLogin");
        String isadminlogin = String.valueOf(isAdminLogin);

        Lmonkey_User user = (Lmonkey_User)session.getAttribute("name");

        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        List<Lmonkey_Product> lmonkey_products = lmonkey_productService.selectAll();
        //得到已确定订单的购物车信息
//        ArrayList<Lmonkey_Cart> shoplist = (ArrayList<Lmonkey_Cart>)req.getAttribute("shoplist");
        ArrayList<Lmonkey_Cart> shoplist = (ArrayList<Lmonkey_Cart>)session.getAttribute("list");
        System.out.println("shoplist:");
        System.out.println(shoplist.size());
        Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
        int resultAll = 0;
        //已经登陆
        if (user!=null && (("1".equals(islogin)) || ("2".equals(isadminlogin)))){
            Date date = new Date(); // this object contains the current date value
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println(formatter.format(date));
            //将得到的商品加入到数据库中：
            for (Lmonkey_Cart cart:shoplist){
                Lmonkey_Order lmonkey_order = new Lmonkey_Order(null,
                        cart.getCart_u_id(),
                        cart.getCart_p_filename(),
                        cart.getCart_p_name(),
                        cart.getCart_p_id(),
                        cart.getCart_quantity(),
                        cart.getCart_p_price()*cart.getCart_quantity(),
                        formatter.format(date)
                );
                //订单信息提交到数据库
                int result = lmonkey_orderService.insert(lmonkey_order);
                resultAll+=result;

                //相应的商品从购物车清除
                int deleteresult = lmonkey_cartService.delete(cart.getCart_id());
            }
            if (!(resultAll>=shoplist.size())){    //没全部插入
                PrintWriter pw = resp.getWriter();
                pw.write("<script>");
                pw.write("alert('插入失败');");
                // 返回到分类修改页面
                pw.print("location.href='login.jsp'");
                pw.write("</script>");
                pw.close();
                return;
            }
            //orderselect中设置的  在此处删除掉
            session.removeAttribute("list");
            req.setAttribute("lastlylist",lmonkey_products);
            req.getRequestDispatcher("ok.jsp").forward(req,resp);
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
