/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2022-07-06 12:20:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>注册</title>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/public.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login1.css\"/>\r\n");
      out.write("    <script src=\"js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    <script src=\"js/calendar.js\"></script>\r\n");
      out.write("    <script src=\"js/function_.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("    \t.reg p .error {\r\n");
      out.write("    \t\tdisplay:inline-block;\r\n");
      out.write("    \t\tborder:1px solid #ff855a;\r\n");
      out.write("    \t\tbackground-color:#ffe8e0;\r\n");
      out.write("    \t\theight:25px;\r\n");
      out.write("    \t\tline-height:25px;\r\n");
      out.write("    \t\tpadding:0px 20px;\r\n");
      out.write("    \t\tmargin-left:20px;\r\n");
      out.write("    \t}\r\n");
      out.write("        .reg {\r\n");
      out.write("            top:10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body><!-------------------reg-------------------------->\r\n");
      out.write("<div class=\"reg\">\r\n");
      out.write("    <form action=\"register\" method=\"post\" onsubmit=\"return checkForm(this)\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"index.jsp\"><img src=\"img/temp/logoxike.png\" style=\"width: 40%\"></a>\r\n");
      out.write("\r\n");
      out.write("        <h2 style=\"border-style: hidden; width:560px;pxpadding:0px;magin:0px;font-size:20px;background: #b9bfb6;;text-align:center;line-height:60px;color:#000000;\">REGISTER</h2>\r\n");
      out.write("        <p><input type=\"text\" name=\"userName\" value=\"\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this)\" placeholder=\"用户ID\"><span></span></p>\r\n");
      out.write("        <p><input type=\"text\" name=\"name\" value=\"\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this)\" placeholder=\"姓名\"><span></span></p>\r\n");
      out.write("        <p><input type=\"text\" name=\"passWord\" value=\"\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this)\" placeholder=\"密码\"><span></span></p>\r\n");
      out.write("         <p><input type=\"text\" name=\"rePassWord\" value=\"\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this)\" placeholder=\"确认密码\"><span></span></p>\r\n");
      out.write("        <p>\r\n");
      out.write("        \t<input style=\"width:13px;height:13px\" type=\"radio\" name=\"sex\" value=\"T\" checked=\"checked\">男\r\n");
      out.write("        \t<input style=\"width:13px;height:13px\" type=\"radio\" name=\"sex\" value=\"F\" >女\r\n");
      out.write("        \t</p>\r\n");
      out.write("        <p><input type=\"text\" name=\"birthday\" value=\"\" onfocus=\"c.show(this)\" placeholder=\"请输出生日期\"><span></span></p>\r\n");
      out.write("         <p><input type=\"text\" name=\"email\" value=\"\" placeholder=\"请输入邮箱\"><span></span></p>\r\n");
      out.write("        <p><input type=\"text\" name=\"mobile\" value=\"\" placeholder=\"请输入手机号码\"><span></span></p>\r\n");
      out.write("        <p><input type=\"text\" name=\"address\" value=\"\" placeholder=\"请输入送货地址\"><span></span></p>\r\n");
      out.write("        <p><input class=\"code\" type=\"text\" name=\"veryCode\" value=\"\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this)\" placeholder=\"验证码\">\r\n");
      out.write("        <img height=\"25\" src=\"getcode\" alt=\"看不清，换一张\" onclick=\"change(this)\"><span></span></p>\r\n");
      out.write("        <p><input type=\"submit\" name=\"\" value=\"注册\" style=\"background-color: rgb(12, 82, 182)\"></p>\r\n");
      out.write("        <p class=\"txtL txt\">完成此注册，即表明您同意了我们的<a href=\"#\">使用条款和隐私策略</a></p>\r\n");
      out.write("        <p class=\"txt\"><a href=\"login.jsp\"><span></span>已有账号登录</a></p>\r\n");
      out.write("        <!--<a href=\"#\" class=\"off\"><img src=\"img/temp/off.png\"></a>--></form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
