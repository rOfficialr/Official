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

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_docateupdate")
public class DoCateUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Integer cate_id = Integer.parseInt(req.getParameter("id"));
        Integer cate_parent_id = Integer.parseInt(req.getParameter("parentId"));
        String cate_name = req.getParameter("className");
        Lmonkey_Category lmonkey_category = new Lmonkey_Category(cate_id,cate_name,cate_parent_id);
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        int result = lmonkey_categoryService.update(lmonkey_category);
        //重定向
        if (result>0){  //结果大于0 则表示修改成功 页面重定向到category界面
            resp.sendRedirect("/manage/admin_cateselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('分类修改失败');");
            // 返回到分类修改页面
            pw.write("location.herf='/manage/admin_tocateupdate'");
            pw.write("</script>");
        }
    }
}
