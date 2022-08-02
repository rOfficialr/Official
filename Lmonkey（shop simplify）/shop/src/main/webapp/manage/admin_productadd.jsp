<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置该属性为false 这样el表达式才能被识别  如果设定为真，那么JSP中的表达式被当成字符串处理。--%>
<%@ page isELIgnored ="false" %>
<%@ include file="admin_menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/manage/admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="/manage/admin_productselect">图书管理</a><span class="crumb-step">&gt;</span><span>新增图书</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">

<%--                上传文件必须是Post方法而且必须加上： enctype="multipart/form-data"--%>
                <form action="/manage/admin_doproductadd" method="post"  enctype="multipart/form-data" id="myform" name="myform">
                    <table class="insert-tab" width="100%">
                        <tbody>
                          <tr>
                                <th><i class="require-red">*</i>图书名称：</th>
                                <td>
                                    <input class="common-text required" id="title" name="productName" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>图书分类：</th>
                                <td>
                                    <select class="common-text required"  name="parentId">
                                    	
                                    	<c:forEach var="f" items="${flist }">
<%--                                            父级分类名不可被选中--%>
                                    		<option value="${f.cate_id }" disabled="disabled"> --${f.cate_name }-- </option>
                                    		<c:forEach var="c" items="${clist }">
                                    			<c:if test="${c.cate_parent_id == f.cate_id}">
                                    				<option value="${f.cate_id }-${c.cate_id }"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${c.cate_name } </option>
                                    			</c:if>
                                    		</c:forEach>
                                    	</c:forEach>
                                    </select>
                                </td>
                            </tr>
                            
                             <tr>
                                <th><i class="require-red">*</i>图书图片：</th>
                                <td>
                                    <input class="common-text required" id="title" name="photo" size="50" value="" type="file">
                                </td>
                            </tr>
                              <tr>
                                <th><i class="require-red">*</i>图书价格：</th>
                                <td>
                                    <input class="common-text required" id="title" name="productPrice" size="50" value="" type="text">
                                </td>
                            </tr>
                              <tr>
                                <th><i class="require-red">*</i>图书介绍：</th>
                                <td>
                                    <input class="common-text required" id="title" name="productDesc" size="50" value="" type="text">
                                </td>
                            </tr>
                              <tr>
                                <th><i class="require-red">*</i>图书库存：</th>
                                <td>
                                    <input class="common-text required" id="title" name="productStock" size="50" value="" type="text">
                                </td>
                            </tr>
                            
                            
                           
                            <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                                    <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                                </td>
                            </tr>
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>