<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>${title }</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!------------------------------head------------------------------>

    <%@ include file="header.jsp" %>

    <div class="banner"><a href="#"><img src="img/temp/banner1.jpg"/></a></div>
    <!-----------------address------------------------------->
    <div class="address">
        <div class="wrapper clearfix"><a href="/indexSelect">首页</a>
            <span>/</span><span class="on">${title }</span></div>
    </div><!-------------------current---------------------->
    <div class="current">
        <div class="wrapper clearfix"><h3 class="fl">${title }</h3>
            <div class="fr choice"><p class="default">排序方式</p>
                <ul class="select">
                    <li>新品上市</li>
                    <li>销量从高到低</li>
                    <li>销量从低到高</li>
                    <li>价格从高到低</li>
                    <li>价格从低到高</li>
                </ul>
            </div>
        </div>
    </div><!----------------proList------------------------->
    <ul class="proList wrapper clearfix">

        <%--  得到商品--%>
        <c:forEach var="p" items="${list }">
            <li><a href="selectproductview?id=${p.product_id}">
                <dl>
                    <dt><img src="images/product/${p.product_filename }"></dt>
                    <dd>【OFFICIAL】${p.product_name }</dd>
                    <dd>￥${p.product_price }.00</dd>
                </dl>
            </a></li>
        </c:forEach>


        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro02.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro03.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro04.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro05.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro06.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro07.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro08.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro01.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro02.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro03.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro04.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro05.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro06.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro07.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
        <li><a href="proDetail.html">
            <dl>
                <dt><img src="img/temp/pro08.jpg"></dt>
                <dd>【最家】跳舞兰仿真花干花</dd>
                <dd>￥17.90</dd>
            </dl>
        </a></li>
    </ul><!----------------mask------------------->
    <div class="mask"></div><!-------------------mask内容------------------->
    <div class="proDets"><img class="off" src="img/temp/off.jpg"/>
        <div class="tit clearfix"><h4 class="fl">【最家】非洲菊仿真花干花</h4><span class="fr">￥17.90</span></div>
        <div class="proCon clearfix">
            <div class="proImg fl"><img class="list" src="img/temp/proDet.jpg"/>
                <div class="smallImg clearfix"><img src="img/temp/proDet01.jpg"
                                                    data-src="img/temp/proDet01_big.jpg"><img
                        src="img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg"><img
                        src="img/temp/proDet03.jpg"
                        data-src="img/temp/proDet03_big.jpg"><img
                        src="img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg"></div>
            </div>
            <div class="fr">
                <div class="proIntro"><p>颜色分类</p>
                    <div class="smallImg clearfix categ"><p class="fl"><img src="img/temp/prosmall01.jpg"
                                                                            alt="白瓷花瓶+20支快乐花"
                                                                            data-src="img/temp/proBig01.jpg"></p>
                        <p class="fl"><img src="img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草"
                                           data-src="img/temp/proBig02.jpg"></p>
                        <p class="fl"><img src="img/temp/prosmall03.jpg" alt="20支快乐花" data-src="img/temp/proBig03.jpg">
                        </p>
                        <p class="fl"><img src="img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="img/temp/proBig04.jpg">
                        </p>
                    </div>
                    <p>数量&nbsp;&nbsp;库存<span>2096</span>件</p>
                    <div class="num clearfix"><img class="fl sub" src="img/temp/sub.jpg"><span class="fl"
                                                                                               contentEditable="true">1</span><img
                            class="fl add" src="img/temp/add.jpg">
                        <p class="please fl">请选择商品属性!</p></div>
                </div>
                <div class="btns clearfix"><a href="#2"><p class="buy fl">立即购买</p></a><a href="#2"><p class="cart fr">
                    加入购物车</p></a></div>
            </div>
        </div>
        <a class="more" href="proDetail.html">查看更多细节</a></div><!--返回顶部-->
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
    <%--            违法和不良信息举报电话：188-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p></div>--%>
    <script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/public.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>