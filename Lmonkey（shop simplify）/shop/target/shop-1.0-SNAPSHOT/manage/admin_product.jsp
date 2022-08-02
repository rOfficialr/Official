<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored ="false" %>
<%@ include file="admin_menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/manage/admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">商品管理</span></div>
        </div>
     
        <div id="register" class="result-wrap">
            <form action="/manage/admin_douserdel" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="/manage/admin_toproductadd"><i class="icon-font"></i>新增产品</a>
                     
                        <!--  a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a -->
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="60%">
                        <tr>
            
                            <th>ID</th>
                            <th>商品名称</th>
                            <th>价格</th>
                            <th>库存</th>
                            <th>操作</th>
                           
                        </tr>
                        
                        <c:forEach var="p" items="${plist }">
                        	<tr>
                        		<td>${p.product_id }</td>
                        		<td><img src="../images/product/${p.product_filename}" width="80" height="80">
                        			${p.product_name }
                        		
                        		</td>
                                <td>${p.product_price}</td>
                                <td>${p.product_stock}</td>
                        		<td>
                                        <%-- 修改有问题暂时没修复--%>
<%--                                    <a class="link-update" href="/manage/admin_toproduceupdate?id=${p.product_id }">修改</a>--%>
                                    <a class="link-del" href="javascript:Delete('确定要删除【${p.product_name} 】？', '/manage/admin_doproductdelete?id=${p.product_id}')">删除</a>
                        		</td>
                        	</tr>
	                    </c:forEach>
                        
                        
                        <script>
                        	function catedel(id) {
                        		if(confirm("你确认要删除这个分类吗")) {
                        			location.href="admin_docatedel?id="+id;
                        			
                        		}
                        	}

                            function Delete(mess, url) {
                                if(confirm(mess)) {
                                    location.href=url;

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