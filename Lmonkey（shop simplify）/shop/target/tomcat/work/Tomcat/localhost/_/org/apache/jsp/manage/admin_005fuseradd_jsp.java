/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2022-04-13 13:12:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fuseradd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/manage/admin_menu.jsp", Long.valueOf(1649773731293L));
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\"/>\r\n");
      out.write("    <title>网上商城后台管理</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"topbar-wrap white\">\r\n");
      out.write("    <div class=\"topbar-inner clearfix\">\r\n");
      out.write("        <div class=\"topbar-logo-wrap clearfix\">\r\n");
      out.write("            <h1 class=\"topbar-logo none\"><a href=\"/manage/admin_index.jsp\" class=\"navbar-brand\">后台管理</a></h1>\r\n");
      out.write("            <ul class=\"navbar-list clearfix\">\r\n");
      out.write("                <li><a class=\"on\" href=\"/manage/admin_index.jsp\">首页</a></li>\r\n");
      out.write("                <li><a href=\"/indexSelect\" target=\"_blank\">商城网站</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top-info-wrap\">\r\n");
      out.write("            <ul class=\"top-info-list clearfix\">\r\n");
      out.write("                <li><a href=\"#\">管理员:${name.user_name}</a></li>\r\n");
      out.write("                <li><a href=\"#\">修改密码</a></li>\r\n");
      out.write("                <li><a href=\"/manage/admin_loginout\">退出</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container clearfix\">\r\n");
      out.write("    <div class=\"sidebar-wrap\">\r\n");
      out.write("        <div class=\"sidebar-title\">\r\n");
      out.write("            <h1>菜单</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar-content\">\r\n");
      out.write("            <ul class=\"sidebar-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><i class=\"icon-font\">&#xe003;</i>常用操作</a>\r\n");
      out.write("                    <ul class=\"sub-menu\">\r\n");
      out.write("                        <li><a href=\"/manage/admin_douserselect\"><i class=\"icon-font\">&#xe008;</i>用户管理</a></li>\r\n");
      out.write("                        <li><a href=\"/manage/admin_cateselect\"><i class=\"icon-font\">&#xe005;</i>分类管理</a></li>\r\n");
      out.write("                        <li><a href=\"/manage/admin_productselect\"><i class=\"icon-font\">&#xe006;</i>图书管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_order.jsp\"><i class=\"icon-font\">&#xe004;</i>订单管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_message.jsp\"><i class=\"icon-font\">&#xe012;</i>留言管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_news.jsp\"><i class=\"icon-font\">&#xe052;</i>新闻管理</a></li>\r\n");
      out.write("                      \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><i class=\"icon-font\">&#xe018;</i>系统管理</a>\r\n");
      out.write("                    <ul class=\"sub-menu\">\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe017;</i>系统设置</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe037;</i>清理缓存</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe046;</i>数据备份</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe045;</i>数据还原</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--/sidebar-->\r\n");
      out.write("    <div class=\"main-wrap\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"crumb-wrap\">\r\n");
      out.write("            <div class=\"crumb-list\"><i class=\"icon-font\"></i><a href=\"/manage/admin_index.jsp\">首页</a><span class=\"crumb-step\">&gt;</span><a class=\"crumb-name\" href=\"/manage/admin_douserselect\">用户管理</a><span class=\"crumb-step\">&gt;</span><span>新增用户</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"result-wrap\">\r\n");
      out.write("            <div class=\"result-content\">\r\n");
      out.write("                <form action=\"/manage/admin_douseradd\" method=\"post\" id=\"myform\" name=\"myform\">\r\n");
      out.write("                    <table class=\"insert-tab\" width=\"100%\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>ID：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"userName\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>用户姓名：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"name\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>登录密码：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"passWord\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>确认密码：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"rePassWord\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <th>性别：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                \t<input type=\"radio\" name=\"sex\" value=\"T\" checked=\"checked\">男\r\n");
      out.write("                                \t<input  type=\"radio\" name=\"sex\" value=\"F\" >女\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>出生日期：</th>\r\n");
      out.write("                                <td><input class=\"common-text\" name=\"birthday\" size=\"50\" value=\"\" type=\"text\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                           \r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>电子邮箱：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"email\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>手机号码：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"mobile\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th><i class=\"require-red\">*</i>送货地址：</th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"common-text required\" id=\"title\" name=\"address\" size=\"50\" value=\"\" type=\"text\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                           \r\n");
      out.write("                         \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input class=\"btn btn-primary btn6 mr10\" value=\"提交\" type=\"submit\">\r\n");
      out.write("                                    <input class=\"btn btn6\" onClick=\"history.go(-1)\" value=\"返回\" type=\"button\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody></table>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/main-->\r\n");
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
