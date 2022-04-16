package com.lmonkey.servlet.home;

import com.lmonkey.domain.Lmonkey_Category;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Imp.Lmonkey_CategoryServiceImp;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_CategoryService;
import com.lmonkey.service.Lmonkey_ProductService;
//import sun.plugin.dom.core.Element;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 得到商品详情
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/selectproductview")
public class SelectProductView extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String product_id = req.getParameter("id");

//        System.out.println("product_id="+product_id);

    //给菜单输送数据
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
    //通过得到的ID来获得商品
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        Lmonkey_Product product = null;
        if (!("".equals(product_id))){
            product = lmonkey_productService.selectById(Integer.parseInt(product_id));
            req.setAttribute("p",product);
        }

        //最近访问
        HttpSession session = req.getSession();
        ArrayList<Integer> ids = (ArrayList<Integer>) session.getAttribute("ids");
//        System.out.println("ids="+ids);
        if (ids==null ){     //该数组为空
//            System.out.println("new ids");
            ids = new ArrayList<Integer>();
        }
        //最多放五个数据 如果超过就删除第一个
        if (ids.size()>5){
            ids.remove(0);
        }
//        System.out.println("product_id="+product_id);
        //相同ID只存一个不重复
        if (!(ids.contains(Integer.parseInt(product_id)))){  //如果已经包含了该ID则不存
//            System.out.println("添加已运行");
//            System.out.println("product_id="+product_id);
            ids.add(Integer.parseInt(product_id));
        }
        session.setAttribute("ids",ids);
        ids = (ArrayList<Integer>)session.getAttribute("ids");
        ArrayList<Lmonkey_Product> lastlylist = new ArrayList<>();
        if (!(ids.isEmpty())){
            //将最近访问商品加入到最近访问列表
            for (Integer id:ids){
                Lmonkey_Product lmonkey_product = lmonkey_productService.selectById(id);
//                System.out.println(lmonkey_product);
                lastlylist.add(lmonkey_product);
            }
            req.setAttribute("lastlylist",lastlylist);
        }

        //推荐商品列表  通过子ID得到该分类下的所有商品
        if (product!=null){
            ArrayList<Lmonkey_Product> lmonkey_products = lmonkey_productService.selectByCid(product.getProduct_cid());
            req.setAttribute("classlist",lmonkey_products);
            Lmonkey_Category cate = lmonkey_categoryService.selectByID(product.getProduct_cid());
            req.setAttribute("cate",cate);
        }
        //重定向到商品详情页面
        req.getRequestDispatcher("productview.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
