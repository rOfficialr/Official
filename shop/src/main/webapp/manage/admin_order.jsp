<%--
  Created by IntelliJ IDEA.
  User: EMPEROR
  Date: 2022/4/16/016
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored ="false" %>
<%@ include file="admin_menu.jsp" %>
<!--/sidebar-->
<div class="main-wrap">

    <div class="crumb-wrap">
        <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">订单管理</span></div>
    </div>

    <div id="register" class="result-wrap">
        <form action="/manage/admin_doorderdel" id="myform" method="post">
            <div class="result-title">
                <div class="result-list">
<%--                    <a href="/manage/admin_tocateadd"><i class="icon-font"></i>新增分类</a>--%>

                    <!--  a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a -->
                </div>
            </div>
            <div class="result-content">
                <table class="result-tab" width="60%">
                    <tr>

                        <th>订单号</th>
                        <th>用户ID</th>
                        <th>商品ID</th>
                        <th>商品名称</th>
                        <th>购买数量</th>
                        <th>总价</th>
                        <th>订单日期</th>
                        <th>操作</th>

                    </tr>

                    <c:forEach var="order" items="${orderlist}">
                            <tr>
                                <td>${order.order_id }</td>
                                <td>${order.order_uid }</td>
                                <td>${order.order_pid }</td>
                                <td>${order.order_pname }</td>
                                <td>${order.order_quantity }</td>
                                <td>${order.order_quantity*order.order_price}</td>
                                <td>${order.order_date}</td>
                                <td> <a href="javascript:orderdel(${order.order_id })">删除</a></td>
                            </tr>
                    </c:forEach>


                    <script>
                        function orderdel(id) {
                            if(confirm("你确认要删除这个订单吗")) {
                                location.href="/manage/admin_doorderdel?id="+id;

                            }
                        }


                    </script>

                </table>

            </div>
        </form>
    </div>
</div>
<!--/main-->
</div>
</body>
</html>
