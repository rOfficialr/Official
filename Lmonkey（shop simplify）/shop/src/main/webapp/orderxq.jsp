<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--我的订单--%>
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>个人信息</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/myorder.css"/>
</head>
<body><!------------------------------head------------------------------>

    <%@ include file="header.jsp" %>
    <!------------------------------idea------------------------------>
    <div class="address mt">
        <div class="wrapper clearfix"><a href="/indexSelect" class="fl">首页</a><span>/</span><a href="/myorderq"
                                                                                               class="on">我的订单</a><span>/</span><a
                href="#" class="on">订单详情</a></div>
    </div><!------------------------------Bott------------------------------>
    <div class="Bott">
        <div class="wrapper clearfix">
            <div class="zuo fl">
                <h3><a href="#"><img src="img/tx.png"/></a>
                    <p class="clearfix"><span class="fl">${name.user_name }</span><span>[<a
                            href="loginout">退出登录</a>]</span></p></h3>
                <div><h4>我的交易</h4>
                    <ul>
                        <li><a href="/showcart">我的购物车</a></li>
                        <li><a href="/myorderq">我的订单</a></li>
<%--                        <li><a href="myprod.html">评价晒单</a></li>--%>
                    </ul>
                    <h4>个人中心</h4>
                    <ul>
                        <li class="on"><a href="mygxin.jsp">我的中心</a></li>
<%--                        <li><a href="address.html">地址管理</a></li>--%>
                    </ul>
                    <h4>账户管理</h4>
                    <ul>
                        <li><a href="mygrxx.jsp">个人信息</a></li>
<%--                        <li><a href="remima.html">修改密码</a></li>--%>
                    </ul>
                </div>
            </div>
            <div class="you fl">
                <div class="my clearfix"><h2>订单详情</h2>
                    <h3>订单号：<span>${order_u.order_id}</span></h3></div>
                <div class="orderList">
                    <div class="orderList1"><h3>待收货</h3>
                        <div class="clearfix"><a href="#" class="fl"><img style="width: 100px;height: 100px"
                                                                          src="images/product/${order_u.order_pfilename}"/></a>
                            <p class="fl"><a href="#">${order_u.order_pname}</a><a
                                    href="#">¥${order_u.order_price}×${order_u.order_quantity}</a></p></div>
                    </div>
                    <div class="orderList1"><h3>收货信息</h3>
                        <p>姓 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<span>${name.user_name}</span></p>
                        <p>联系电话：<span>${name.user_mobile}</span></p>
                        <p>收货地址：<span>${name.user_address}</span></p></div>
                    <div class="orderList1"><h3>支付方式及送货时间</h3>
                        <p>支付方式：<span>在线支付</span></p>
                        <p>送货时间：<span>不限送货时间</span></p></div>
                    <div class="orderList1 hei"><h3>
                        <strong>商品总价：</strong><span>¥${order_u.order_price * order_u.order_quantity}</span></h3>
                        <p><strong>运费：</strong><span>¥0</span></p>
                        <p><strong>订单金额：</strong><span>¥${order_u.order_price * order_u.order_quantity}</span></p>
                        <p><strong>实付金额：</strong><span>¥${order_u.order_price * order_u.order_quantity}</span></p></div>
                </div>
            </div>
        </div>
    </div>
    <<!--返回顶部-->
    <%--侧边栏--%>
    <%@ include file="broadside.jsp" %>
    <!--footer-->
<%--    <div class="footer">--%>
<%--        <div class="top">--%>
<%--            <div class="wrapper">--%>
<%--                <div class="clearfix"><a href="#2" class="fl"><img src="img/foot1.png"/></a><span--%>
<%--                        class="fl">7天无理由退货</span>--%>
<%--                </div>--%>
<%--                <div class="clearfix"><a href="#2" class="fl"><img src="img/foot2.png"/></a><span--%>
<%--                        class="fl">15天免费换货</span>--%>
<%--                </div>--%>
<%--                <div class="clearfix"><a href="#2" class="fl"><img src="img/foot3.png"/></a><span--%>
<%--                        class="fl">满599包邮</span>--%>
<%--                </div>--%>
<%--                <div class="clearfix"><a href="#2" class="fl"><img src="img/foot4.png"/></a><span--%>
<%--                        class="fl">手机特色服务</span>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <p class="dibu">最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br/>--%>
<%--            违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p></div>--%>
    <script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/public.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/user.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>