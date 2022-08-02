<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--确认订单--%>
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>ok</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!----------------------------------------order------------------>
    <%@ include file="header.jsp" %>


    <div class="order mt cart">
        <div class="site"><p class="wrapper clearfix"><span class="fl">支付成功</span><img class="top"
                                                                                       src="img/temp/cartTop03.png"></p>
        </div>
        <%--    此处跳转写在pro.js文件里 101行  --%>
        <p class="ok">支付成功！剩余<span>5</span>秒<a href="myorderq">返回订单页</a></p></div>
    <%--最近访问--%>
    <div class="like"><h4>最近访问</h4>
        <div class="bottom">
            <div class="hd"><span class="prev"><img src="img/temp/prev.png"></span><span class="next"><img
                    src="img/temp/next.png"></span></div>
            <div class="imgCon bd">
                <div class="likeList clearfix">
                    <div>


                        <c:forEach var="lp" items="${lastlylist }">
                            <a href="selectproductview?id=${lp.product_id }">
                                <dl>
                                    <dt><img src="images/product/${lp.product_filename }"></dt>
                                    <dd>【OfficialShop】${lp.product_name }</dd>
                                    <dd>￥${lp.product_price }.00</dd>
                                </dl>
                            </a>
                        </c:forEach>


                        <a href="proDetail.html">
                            <dl>
                                <dt><img src="img/temp/like01.jpg"></dt>
                                <dd>【最家】复古文艺风玻璃花瓶</dd>
                                <dd>￥193.20</dd>
                            </dl>
                        </a>

                        <a href="proDetail.html">
                            <dl>
                                <dt><img src="img/temp/like02.jpg"></dt>
                                <dd>【最家】复古文艺风玻璃花瓶</dd>
                                <dd>￥193.20</dd>
                            </dl>
                        </a><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like03.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like04.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html" class="last">
                        <dl>
                            <dt><img src="img/temp/like05.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a></div>
                    <div><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like01.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like02.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like03.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html">
                        <dl>
                            <dt><img src="img/temp/like04.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a><a href="proDetail.html" class="last">
                        <dl>
                            <dt><img src="img/temp/like05.jpg"></dt>
                            <dd>【最家】复古文艺风玻璃花瓶</dd>
                            <dd>￥193.20</dd>
                        </dl>
                    </a></div>
                </div>
            </div>
        </div>
    </div>
    </div>
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
    <script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">jQuery(".bottom").slide({
        titCell: ".hd ul",
        mainCell: ".bd .likeList",
        autoPage: true,
        autoPlay: false,
        effect: "leftLoop",
        autoPlay: true,
        vis: 1
    });</script>
</body>
</html>