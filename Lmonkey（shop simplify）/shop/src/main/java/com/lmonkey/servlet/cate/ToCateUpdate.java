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

/**去更新
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_tocateupdate")
public class ToCateUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Integer cate_id = Integer.parseInt(req.getParameter("id"));
        //需要得到信息通过ID
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        Lmonkey_Category category = lmonkey_categoryService.selectByID(cate_id);
        List<Lmonkey_Category> list = lmonkey_categoryService.selectAll();
        req.setAttribute("cate1",category);
        req.setAttribute("catelist",list);
//        请求转发
//        System.out.println("admin_tocateadd已运行！");
        req.getRequestDispatcher("admin_catemodify.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
