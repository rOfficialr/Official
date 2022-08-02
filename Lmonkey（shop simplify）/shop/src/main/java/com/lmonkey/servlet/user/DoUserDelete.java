package com.lmonkey.servlet.user;

import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_douserdel")
public class DoUserDelete extends HttpServlet {
//    get方法是删除一个
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String user_id = req.getParameter("user_id");
        System.out.println("user_id:"+user_id);
        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        int result = lmonkey_userService.delete(user_id);
        System.out.println("结果："+result);
        //重定向
        if (result>0){  //结果大于0 则表示删除成功 页面重定向到user界面
            resp.sendRedirect("/manage/admin_douserselect?cp="+req.getParameter("cpage"));
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('用户删除失败')");
            pw.write("location.herf='/manage/admin_douserselect'");
            pw.write("</script>");
        }
    }

//    post方法是删除多个
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //得到被复选框选中的所有的数据的value值即：ID
        String[] ids = req.getParameterValues("id[]");
        int result = 0;
                Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        for (String user_id:ids){
            result = lmonkey_userService.delete(user_id);
            result++;
        }
        System.out.println("结果："+result);
        //重定向
        if (result==ids.length){  //结果大于0 则表示删除成功 页面重定向到user界面
            resp.sendRedirect("/manage/admin_douserselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('删除失败');");
            pw.write("location.herf='/manage/admin_douserselect'");
            pw.write("</script>");
        }
    }
}
