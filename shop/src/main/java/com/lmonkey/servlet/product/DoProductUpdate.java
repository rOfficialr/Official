package com.lmonkey.servlet.product;

import com.jspsmart.upload.*;
import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *      更新有问题暂时没修复
 * @author 翟某人~
 * @version 1.0
 */
@WebServlet("/manage/admin_doproductupdate")
public class DoProductUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建SumartUpload对象
        SmartUpload su = new SmartUpload();
        //初始化
        su.initialize(this.getServletConfig(),req,resp);
        //上传过程
        try {
            su.upload();
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        //获取上传文件对象
        Files files = su.getFiles();
        File file = files.getFile(0);
//        String fname = file.getFieldName();
        //图片名
        String fileName = file.getFileName();
        try {
            //将上传的图片放在该目录下
            su.save("/images/product");
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
//        System.out.println(fileName);
        //获取一个request对象使用该对象来获取表单参数
        Request req1 = su.getRequest();
        String p_id = req1.getParameter("product_id");
        String p_name = req1.getParameter("productName");
        String p_Id = req1.getParameter("parentId");
        String p_Price = req1.getParameter("productPrice");
        String p_Desc = req1.getParameter("productDesc");
        String p_Stock = req1.getParameter("productStock");
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();

        //没有重新选择图片则设置为原图
        if ("".equals(fileName)){
//            System.out.println("if语句已经运行");
//            System.out.println("文件名"+newname);
            fileName=lmonkey_productService.selectById(Integer.parseInt(p_id)).getProduct_filename();
        }

        Lmonkey_Product lmonkey_product = new Lmonkey_Product(
                null,
                p_name,p_Desc,
                Integer.parseInt(p_Price),
                Integer.parseInt(p_Stock),
                Integer.parseInt(p_Id.split("-")[0]),
                Integer.parseInt(p_Id.split("-")[1]),
                fileName);

        System.out.println(lmonkey_product);

        int result = lmonkey_productService.update(lmonkey_product);
        //重定向
        if (result>0){  //结果大于0 则表示插入成功 页面重定向到product界面
            resp.sendRedirect("/manage/admin_productselect");
        }else {
            PrintWriter pw = resp.getWriter();
            pw.write("<script>");
            pw.write("alert('产品更新失败');");
            pw.write("location.herf='/manage/admin_productselect'");
            pw.write("</script>");
        }

    }
}
