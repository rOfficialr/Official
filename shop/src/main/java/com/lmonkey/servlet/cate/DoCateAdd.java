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
import java.io.PrintWriter;
import java.util.List;

/**
 * 添加分类
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_docateadd")
public class DoCateAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
//        System.out.println("admin_docateadd已运行！");
        //父ID
        String parent_Id = req.getParameter("parentId");
        System.out.println("parent_Id="+parent_Id);
//        System.out.println("parentid已运行！");
        //分类名称
        String className = req.getParameter("className");
        //调用插入方法插入
        Lmonkey_Category lmonkey_category = new Lmonkey_Category();
        lmonkey_category.setCate_name(className);
        lmonkey_category.setCate_parent_id(Integer.parseInt(parent_Id));

        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        int result = lmonkey_categoryService.insert(lmonkey_category);

        //重定向
        if (result>0){  //结果大于0 则表示插入成功 页面重定向到user界面
            resp.sendRedirect("/manage/admin_cateselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('分类添加失败');");
            // 返回到分类添加页面
            pw.write("location.herf='/manage/admin_tocateadd'");
            pw.write("</script>");
        }
    }
}
