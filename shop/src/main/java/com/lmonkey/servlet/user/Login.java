package com.lmonkey.servlet.user;

import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.domain.Lmonkey_Order;
import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Imp.Lmonkey_OrderServiceImp;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_CartService;
import com.lmonkey.service.Lmonkey_OrderService;
import com.lmonkey.service.Lmonkey_ProductService;
import com.lmonkey.service.Lmonkey_UserService;

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
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
//        System.out.println(userName);
        String passWord = req.getParameter("passWord");
//        System.out.println(passWord);
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
//通过id/email/mobil来获得用户
        Lmonkey_User lmonkey_user = lmonkey_userService.selectByid_em_mb(userName);
//        通过用户ID的到该用户的购物车
        ArrayList<Lmonkey_Cart> lmonkey_carts = lmonkey_cartService.selectByUid(lmonkey_user.getUser_id());
        //  id/em/mb来登录
        if ((lmonkey_user.getUser_password()).equals(passWord)){
//        if (passWord.equals(lmonkey_user.getUser_password())){
            HttpSession session = req.getSession();

//            设置会话  传递用户实体对象
            session.setAttribute("name",lmonkey_user);
//            传递用户购物车对象数量
            session.setAttribute("u_cart_size",lmonkey_carts.size());
            Lmonkey_OrderService lmonkey_orderService = new Lmonkey_OrderServiceImp();
            ArrayList<Lmonkey_Order> lmonkey_orders = lmonkey_orderService.selectByUid(lmonkey_user.getUser_id());
            //传递用户订单数量
            session.setAttribute("order_count",lmonkey_orders.size());
            //判断状态码，根据状态码识别身份
            if (lmonkey_user.getUser_status()==2){
                session.setAttribute("isAdminLogin",2);  //把2传给isAdminLogin 表示已经登陆

            }if (lmonkey_user.getUser_status()==1){
                session.setAttribute("isLogin",1);  //把1传给isLogin 表示已经登陆
            }
//            resp.sendRedirect("/index.jsp");
            resp.sendRedirect("/indexSelect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.print("<script>");
            pw.print("alert('用户登录失败');");
            pw.print("location.href='login.jsp'");
            pw.print("</script>");
            pw.print("</script>");
            pw.close();
        }


    }
}
