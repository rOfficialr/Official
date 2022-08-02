<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored ="false" %>
<%@ include file="admin_menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font">&#xe06b;</i><span>  <i>WELCOM!</i></span></div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
<%--                <h1>快捷操作</h1>--%>
            </div>

        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>系统基本信息</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">操作系统</label><span class="res-info">Windows 10</span>
                    </li>
                    <li>
                        <label class="res-lab">技术</label><span class="res-info">Mybatis+Servlet+Jsp</span>
                    </li>
                    <li>
                        <label class="res-lab">工程</label><span class="res-info">Maven</span>
                    </li>
                    <li>
                        <label class="res-lab">后端开发</label><span class="res-info">OfficialUser</span>
                    </li>
<%--                    <li>--%>
<%--                        <label class="res-lab">上传附件限制</label><span class="res-info">2M</span>--%>
<%--                    </li>--%>
                    <li>
                        <label class="res-lab">时间</label><span class="res-info">壬寅年甲辰月</span>
                    </li>
<%--                    <li>--%>
<%--                        <label class="res-lab">服务器域名/IP</label><span class="res-info">localhost [ 127.0.0.1 ]</span>--%>
<%--                    </li>--%>
<%--                    <li>--%>
<%--                        <label class="res-lab">Host</label><span class="res-info">127.0.0.1</span>--%>
<%--                    </li>--%>
                </ul>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>@个人</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">CSDN：</label><span class="res-info"><a href="https://blog.csdn.net/qq_54141095?spm=1000.2115.3001.5343" target="_blank">OfficialUser</a></span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>