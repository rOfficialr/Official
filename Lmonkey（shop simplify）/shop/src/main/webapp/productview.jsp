<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!------------------------------head------------------------------>

    <%@ include file="header.jsp" %>

    <!-----------------address------------------------------->
    <div class="address">
        <div class="wrapper clearfix">
            <a href="indexSelect">首页</a><span>/</span>
            <a href="selectproductlist?cid=${cate.cate_id }">${cate.cate_name }</a><span>/</span>
            <span class="on">${p.product_name }</span>
        </div>
    </div><!-----------------------Detail------------------------------>
    <div class="detCon">
        <div class="proDet wrapper">
            <div class="proCon clearfix">
                <div class="proImg fl">
                    <img class="det" src="images/product/${p.product_filename }"/>
                    <div class="smallImg clearfix"><img src="images/product/${p.product_filename }"
                                                        data-src="images/product/${p.product_filename }"><img
                            src="img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg"><img
                            src="img/temp/proDet03.jpg" data-src="img/temp/proDet03_big.jpg"><img
                            src="img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg"></div>
                </div>
                <div class="fr intro">
                    <div class="title"><h4>【OfficialShop】${p.product_name }</h4>
                        <p>【${p.product_description }】</p><span>￥${p.product_price }.00</span></div>
                    <div class="proIntro"><p>分类</p>
                        <div class="smallImg clearfix categ">
                            <p class="fl">
                                <img src="images/product/${p.product_filename }"
                                     data-src="images/product/${p.product_filename }">
                            </p>
                        </div>
                        <p>数量&nbsp;&nbsp;库存<span>${p.product_stock }</span>件</p>
                        <div class="num clearfix">
                            <img class="fl sub" src="img/temp/sub.jpg">
                            <span id="count" class="fl" contentEditable="true">1</span><img
                                class="fl add" src="img/temp/add.jpg">
                            <p class="please fl">请选择商品属性!</p></div>
                    </div>
                    <div class="btns clearfix">
                        <a href="javascript:shopAdd(${p.product_id },'z')"><p class="buy fl">立即购买</p></a>
                        <a href="javascript:shopAdd(${p.product_id },'s')"><p class="cart fr"> 加入购物车</p></a></div>
                </div>
            </div>
        </div>
    </div>

    <script>
        function shopAdd(id, url) {
            var count = document.getElementById("count").innerHTML;

            location.href = 'cartadd?id=' + id + '&count=' + count + '&url=' + url;

        }

    </script>

    <div class="introMsg wrapper clearfix">
        <div class="msgL fl">
            <div class="msgTit clearfix"><a class="on">商品详情</a><a>所有评价</a></div>
            <div class="msgAll">
                <div class="msgImgs"><img src="img/temp/det01.jpg"><img src="img/temp/det02.jpg"><img
                        src="img/temp/det03.jpg"><img src="img/temp/det04.jpg"><img src="img/temp/det05.jpg"><img
                        src="img/temp/det06.jpg"><img src="img/temp/det07.jpg"></div>
                <div class="eva">
                    <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                        <div class="perR fl"><p>馨***呀</p>
                            <p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
                            <div class="clearfix"><p><img src="img/temp/eva01.jpg"></p>
                                <p><img src="img/temp/eva02.jpg"></p>
                                <p><img src="img/temp/eva03.jpg"></p>
                                <p><img src="img/temp/eva04.jpg"></p>
                                <p><img src="img/temp/eva05.jpg"></p></div>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                        <div class="perR fl"><p>么***周</p>
                            <p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                        <div class="perR fl"><p>馨***呀</p>
                            <p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
                            <div class="clearfix"><p><img src="img/temp/eva01.jpg"></p>
                                <p><img src="img/temp/eva02.jpg"></p>
                                <p><img src="img/temp/eva03.jpg"></p>
                                <p><img src="img/temp/eva04.jpg"></p>
                                <p><img src="img/temp/eva05.jpg"></p></div>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                        <div class="perR fl"><p>么***周</p>
                            <p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                        <div class="perR fl"><p>馨***呀</p>
                            <p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
                            <div class="clearfix"><p><img src="img/temp/eva01.jpg"></p>
                                <p><img src="img/temp/eva02.jpg"></p>
                                <p><img src="img/temp/eva03.jpg"></p>
                                <p><img src="img/temp/eva04.jpg"></p>
                                <p><img src="img/temp/eva05.jpg"></p></div>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                        <div class="perR fl"><p>么***周</p>
                            <p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                        <div class="perR fl"><p>馨***呀</p>
                            <p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
                            <div class="clearfix"><p><img src="img/temp/eva01.jpg"></p>
                                <p><img src="img/temp/eva02.jpg"></p>
                                <p><img src="img/temp/eva03.jpg"></p>
                                <p><img src="img/temp/eva04.jpg"></p>
                                <p><img src="img/temp/eva05.jpg"></p></div>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                        <div class="perR fl"><p>么***周</p>
                            <p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per01.jpg">
                        <div class="perR fl"><p>馨***呀</p>
                            <p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
                            <div class="clearfix"><p><img src="img/temp/eva01.jpg"></p>
                                <p><img src="img/temp/eva02.jpg"></p>
                                <p><img src="img/temp/eva03.jpg"></p>
                                <p><img src="img/temp/eva04.jpg"></p>
                                <p><img src="img/temp/eva05.jpg"></p></div>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                    <div class="per clearfix"><img class="fl" src="img/temp/per02.jpg">
                        <div class="perR fl"><p>么***周</p>
                            <p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
                            <p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p></div>
                    </div>
                </div>
            </div>
        </div>
        <%--    推荐商品--%>
        <div class="msgR fr" style="width:210px;"><h4>为你推荐</h4>
            <div class="seeList">
                <c:forEach var="cp" items="${classlist }">
                    <a href="selectproductview?id=${cp.product_id }">
                        <dl>
                            <dt><img style="width: 180px;height: 260px" src="images/product/${cp.product_filename }">
                            </dt>
                            <dd>【OfficialShop】${cp.product_name }</dd>
                            <dd>￥${cp.product_price }.00</dd>
                        </dl>
                    </a>
                </c:forEach>

                <a href="#">
                    <dl>
                        <dt><img src="img/temp/see02.jpg"></dt>
                        <dd>【最家】复古文艺风玻璃花瓶</dd>
                        <dd>￥193.20</dd>
                    </dl>
                </a>

                <a href="#">
                    <dl>
                        <dt><img src="img/temp/see03.jpg"></dt>
                        <dd>【最家】复古文艺风玻璃花瓶</dd>
                        <dd>￥193.20</dd>
                    </dl>
                </a><a href="#">
                <dl>
                    <dt><img src="img/temp/see04.jpg"></dt>
                    <dd>【最家】复古文艺风玻璃花瓶</dd>
                    <dd>￥193.20</dd>
                </dl>
            </a></div>
        </div>
    </div>
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
    <!--返回顶部-->
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
    <script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/public.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
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
