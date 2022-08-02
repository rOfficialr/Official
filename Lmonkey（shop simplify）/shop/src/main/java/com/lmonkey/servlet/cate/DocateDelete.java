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
 * 删除
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_docatedel")
public class DocateDelete extends HttpServlet {
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
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        List<Lmonkey_Category> lmonkey_categories = lmonkey_categoryService.selectAll();
//        遍历删除子节点
        for (Lmonkey_Category l: lmonkey_categories){
            if (cate_id.equals(l.getCate_parent_id())){
                int result_sub = lmonkey_categoryService.delete(l.getCate_id());
            }
        }
        int result = lmonkey_categoryService.delete(cate_id);
        //重定向
        if (result>0){  //结果大于0 则表示删除成功 页面重定向到category界面
            resp.sendRedirect("/manage/admin_cateselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('分类修改失败');");
            // 返回到分类修改页面
            pw.write("location.herf='/manage/admin_cateselect'");
            pw.write("</script>");
        }
    }
}
