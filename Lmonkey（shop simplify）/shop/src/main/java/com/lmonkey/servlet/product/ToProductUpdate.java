package com.lmonkey.servlet.product;

import com.lmonkey.domain.Lmonkey_Category;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Imp.Lmonkey_CategoryServiceImp;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_CategoryService;
import com.lmonkey.service.Lmonkey_ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_toproduceupdate")
public class ToProductUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String product_id = req.getParameter("id");
//        System.out.println("ID="+product_id);
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();

        Lmonkey_Product product = lmonkey_productService.selectById(Integer.parseInt(product_id));
//        System.out.println(product);

        //得到父ID子ID
        ArrayList<Lmonkey_Category> flist = new ArrayList<>();
        ArrayList<Lmonkey_Category> clist = new ArrayList<>();
        //得到父子节点信息
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        List<Lmonkey_Category> lmonkey_categories = lmonkey_categoryService.selectAll();
        for (Lmonkey_Category l:lmonkey_categories){
            if (l.getCate_parent_id()==0){  //父节点
                flist.add(l);
            }else {     //子节点
                clist.add(l);
            }
        }

        String fid = req.getParameter("fid");
        String cid = req.getParameter("cid");
        req.setAttribute("flist",flist);
        req.setAttribute("clist",clist);
        req.setAttribute("product",product);
        //重定向到页面
        req.getRequestDispatcher("admin_productmodify.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
