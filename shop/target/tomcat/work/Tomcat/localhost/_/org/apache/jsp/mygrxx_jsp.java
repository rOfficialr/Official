/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2022-04-16 14:43:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mygrxx_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/broadside.jsp", Long.valueOf(1650092997206L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1650117801532L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head lang=\"en\">\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <title>个人信息</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/public.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mygrxx.css\"/>\n");
      out.write("</head>\n");
      out.write("<body><!------------------------------head------------------------------>\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"head\">\r\n");
      out.write("    <div class=\"wrapper clearfix\">\r\n");
      out.write("        <div class=\"clearfix\" id=\"top\"><h1 class=\"fl\"><a href=\"index.html\"><img src=\"img/temp/logoxike.png\" style=\"width: 40%;height:40%\"/></a></h1>\r\n");
      out.write("            <div class=\"fr clearfix\" id=\"top1\"><p class=\"fl\">\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \t\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </p>\r\n");
      out.write("                <form action=\"#\" method=\"get\" class=\"fl\"><input type=\"text\" placeholder=\"热门搜索：干花花瓶\"/><input\r\n");
      out.write("                        type=\"button\"/></form>\r\n");
      out.write("                <div class=\"btn fl clearfix\"><a href=\"mygxin.jsp\"><img src=\"img/grzx.png\"/></a><a href=\"#\" class=\"er1\"><img\r\n");
      out.write("                        src=\"img/ewm.png\"/></a>\r\n");
      out.write("                      ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                        \r\n");
      out.write("                    <p><a href=\"#\"><img src=\"img/CSDN.png\"/></a></p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"clearfix\" id=\"bott\">\r\n");
      out.write("            <li><a href=\"/indexSelect\">首页</a></li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("<!------------------------------idea------------------------------>\n");
      out.write("<div class=\"address mt\">\n");
      out.write("    <div class=\"wrapper clearfix\"><a href=\"index.html\" class=\"fl\">首页</a><span>/</span><a href=\"mygxin.html\" class=\"on\">个人信息</a>\n");
      out.write("    </div>\n");
      out.write("</div><!------------------------------Bott------------------------------>\n");
      out.write("<div class=\"Bott\">\n");
      out.write("    <div class=\"wrapper clearfix\">\n");
      out.write("        <div class=\"zuo fl\">\n");
      out.write("            <h3><a href=\"#\"><img src=\"img/tx.png\"/></a>\n");
      out.write("                <p class=\"clearfix\"><span class=\"fl\">[");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("]</span><span class=\"fr\">[退出登录]</span></p></h3>\n");
      out.write("            <div><h4>我的交易</h4>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"/showcart\">我的购物车</a></li>\n");
      out.write("                    <li><a href=\"/myorderq\">我的订单</a></li>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <li><a href=\"#\">评价晒单</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <h4>个人中心</h4>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"mygxin.jsp\">我的中心</a></li>\n");
      out.write("                    <li><a href=\"address.html\">地址管理</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <h4>账户管理</h4>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"on\"><a href=\"mygrxx.jsp\">个人信息</a></li>\n");
      out.write("                    <li><a href=\"remima.html\">修改密码</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"you fl\"><h2>个人信息</h2>\n");
      out.write("            <div class=\"gxin\">\n");
      out.write("                <div class=\"tx\"><a href=\"#\"><img src=\"img/tx.png\"/>\n");
      out.write("                    <p id=\"avatar\">修改头像</p></a></div>\n");
      out.write("                <div class=\"xx\"><h3 class=\"clearfix\"><strong class=\"fl\">基础资料</strong><a href=\"#\" class=\"fr\" id=\"edit1\">编辑</a>\n");
      out.write("                </h3>\n");
      out.write("                    <div>姓名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("                    <div>生日：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("                    <div>性别：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_sex==\"T\"?\"男\":\"女\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("                    <h3>高级设置</h3><!--<div><span class=\"fl\">银行卡</span><a href=\"#\" class=\"fr\">管理</a></div>-->\n");
      out.write("                    <div><span class=\"fl\">账号地区：中国</span><a href=\"#\" class=\"fr\" id=\"edit2\">修改</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div><!--遮罩-->\n");
      out.write("<div class=\"mask\"></div><!--编辑弹框-->\n");
      out.write("<div class=\"bj\">\n");
      out.write("    <div class=\"clearfix\"><a href=\"#\" class=\"fr gb\"><img src=\"img/icon4.png\"/></a></div>\n");
      out.write("    <h3>编辑基础资料</h3>\n");
      out.write("    <form action=\"#\" method=\"get\"><p><label>姓名：</label><input type=\"text\" value=\"六六六\"/></p>\n");
      out.write("        <p><label>生日：</label><input type=\"text\"/></p>\n");
      out.write("        <p><label>性别：</label><span><input type=\"radio\"/>男</span><span><input type=\"radio\"/>女</span></p>\n");
      out.write("        <div class=\"bc\"><input type=\"button\" value=\"保存\"/><input type=\"button\" value=\"取消\"/></div>\n");
      out.write("    </form>\n");
      out.write("</div><!--高级设置修改-->\n");
      out.write("<div class=\"xg\">\n");
      out.write("    <div class=\"clearfix\"><a href=\"#\" class=\"fr gb\"><img src=\"img/icon4.png\"/></a></div>\n");
      out.write("    <h3>切换账号地区</h3>\n");
      out.write("    <form action=\"#\" method=\"get\"><p><label>姓名：</label><input type=\"text\" value=\"六六六\"/></p>\n");
      out.write("        <div class=\"bc\"><input type=\"button\" value=\"保存\"/><input type=\"button\" value=\"取消\"/></div>\n");
      out.write("    </form>\n");
      out.write("</div><!--修改头像-->\n");
      out.write("<div class=\"avatar\">\n");
      out.write("    <div class=\"clearfix\"><a href=\"#\" class=\"fr gb\"><img src=\"img/icon4.png\"/></a></div>\n");
      out.write("    <h3>修改头像</h3>\n");
      out.write("    <form action=\"#\" method=\"get\"><h4>请上传图片</h4><input type=\"button\" value=\"上传头像\"/>\n");
      out.write("        <p>jpg或png，大小不超过2M</p><input type=\"submit\" value=\"提交\"/></form>\n");
      out.write("</div>\n");
      out.write("<!--返回顶部-->\n");
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"gotop\"><a href=\"/showcart\">\r\n");
      out.write("    <dl class=\"goCart\">\r\n");
      out.write("        <dt><img src=\"img/gt1.png\"/></dt>\r\n");
      out.write("        <dd>去购<br/>物车</dd>\r\n");
      out.write("\r\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_cart_size}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></dl>\r\n");
      out.write("</a><a href=\"#\" class=\"dh\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt><img src=\"img/gt2.png\"/></dt>\r\n");
      out.write("        <dd>联系<br/>客服</dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</a><a href=\"mygxin.jsp\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt><img src=\"img/gt3.png\"/></dt>\r\n");
      out.write("        <dd>个人<br/>中心</dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</a><a href=\"#\" class=\"toptop\" style=\"display: none;\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt><img src=\"img/gt4.png\"/></dt>\r\n");
      out.write("        <dd>返回<br/>顶部</dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</a>\r\n");
      out.write("    <p>110-120-119</p></div>\r\n");
      out.write("<div class=\"msk\"></div>\r\n");
      out.write("\n");
      out.write("<!--footer-->\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"top\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"clearfix\"><a href=\"#2\" class=\"fl\"><img src=\"img/foot1.png\"/></a><span class=\"fl\">7天无理由退货</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"><a href=\"#2\" class=\"fl\"><img src=\"img/foot2.png\"/></a><span class=\"fl\">15天免费换货</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"><a href=\"#2\" class=\"fl\"><img src=\"img/foot3.png\"/></a><span class=\"fl\">满599包邮</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"><a href=\"#2\" class=\"fl\"><img src=\"img/foot4.png\"/></a><span class=\"fl\">手机特色服务</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"dibu\">最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br/>\n");
      out.write("        违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p></div>\n");
      out.write("<script src=\"js/jquery-1.12.4.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("<script src=\"js/public.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("<script src=\"js/user.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /header.jsp(14,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin !=1 && isAdminLogin !=2}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <a href=\"login.jsp\" id=\"login\">登录</a><a href=\"reg.jsp\" id=\"reg\">注册</a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /header.jsp(18,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin ==1 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t<b>Hello：</b><a href=\"login.jsp\" id=\"login\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("            \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /header.jsp(22,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isAdminLogin ==2 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <i>管理员：</i><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name.user_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</b><a href=\"manage/admin_index.jsp\" style=\"color: #1f6377;\"  id=\"login1\">进入后台</a>\r\n");
        out.write("            \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /header.jsp(31,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin ==1 || isAdminLogin ==2 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"/showcart\"><img src=\"img/gwc.png\"/></a>\r\n");
        out.write("                       ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /header.jsp(42,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("f");
    // /header.jsp(42,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/header.jsp(42,12) '${flist }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${flist }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \r\n");
          out.write("            <li><a href=\"selectproductlist?fid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f.cate_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f.cate_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("                <div class=\"sList2\">\r\n");
          out.write("                    <div class=\"clearfix\">\r\n");
          out.write("                    \t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            </li>\r\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /header.jsp(47,21) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("c");
    // /header.jsp(47,21) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/header.jsp(47,21) '${clist }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${clist }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    \t\t");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                    \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /header.jsp(48,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f.cate_id == c.cate_parent_id }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    \t\t\t<a href=\"selectproductlist?cid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cate_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cate_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("                    \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }
}