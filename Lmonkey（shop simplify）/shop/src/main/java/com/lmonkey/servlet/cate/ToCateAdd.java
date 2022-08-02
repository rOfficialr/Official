package com.lmonkey.servlet.cate;

import com.lmonkey.domain.Lmonkey_Category;
import com.lmonkey.service.Imp.Lmonkey_CategoryServiceImp;
import com.lmonkey.service.Lmonkey_CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_tocateadd")
public class ToCateAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //需要得到其父分类做下拉列表；
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        List<Lmonkey_Category> list = lmonkey_categoryService.selectAll();
        req.setAttribute("catelist",list);
//        resp.sendRedirect("");
//        请求转发
//        System.out.println("admin_tocateadd已运行！");
        req.getRequestDispatcher("admin_cateadd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
