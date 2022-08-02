<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored="false" %>

<div class="head">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a href="/"><img src="img/temp/logoxike.png"
                                                                                style="width: 40%;height:40%"/></a></h1>
            <div class="fr clearfix" id="top1"><p class="fl">

                <%-- isLogin !=1 表示没登陆--%>
                <c:if test="${isLogin !=1 && isAdminLogin !=2}">
                    <a href="login.jsp" id="login">登录</a><a href="reg.jsp" id="reg">注册</a>
                </c:if>
                <%--isLogin !=1 表示已经登陆--%>
                <c:if test="${isLogin ==1 }">
                    <b>Hello：</b><a href="login.jsp" id="login">${name.user_name }</a>
                </c:if>

                <c:if test="${isAdminLogin ==2 }">
                    <i>管理员：</i><b>${name.user_name }</b><a href="manage/admin_index.jsp" style="color: #1f6377;"
                                                           id="login1">进入后台</a>
                </c:if>

            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="热门搜索：干花花瓶"/><input
                        type="button"/></form>
                <div class="btn fl clearfix"><a href="mygxin.jsp"><img src="img/grzx.png"/></a><a href="#"
                                                                                                  class="er1"><img
                        src="img/ewm.png"/></a>
                    <c:if test="${isLogin ==1 || isAdminLogin ==2 }">
                        <a href="/showcart"><img src="img/gwc.png"/></a>
                    </c:if>

                    <p><a href="#"><img src="img/CSDN.png"/></a></p></div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="/indexSelect">首页</a></li>


            <c:forEach var="f" items="${flist }">

                <li><a href="selectproductlist?fid=${f.cate_id }">${f.cate_name }</a>
                    <div class="sList2">
                        <div class="clearfix">
                            <c:forEach var="c" items="${clist }">
                                <c:if test="${f.cate_id == c.cate_parent_id }">
                                    <a href="selectproductlist?cid=${c.cate_id }">${c.cate_name }</a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>