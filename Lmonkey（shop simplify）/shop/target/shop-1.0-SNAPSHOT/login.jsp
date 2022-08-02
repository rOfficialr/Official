<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/login1.css"/>
</head>
<body><!-------------------login-------------------------->
<div class="login">

    <form action="/manage/login" method="post"><h1><img src="img/temp/logoxike.png" style="width: 40%;height:40%"></h1>
        <p></p>
        <div class="msg-warn hide"><b></b>In the login~</div>
        <p><input type="text" name="userName" value="" placeholder="ID/邮箱/手机号"></p>
        <p><input type="password" name="passWord" value="" placeholder="密码" style="border: 1px solid #dbdbdb;padding-left: 10px;font-size: 20px"></p>
        <p ><input type="submit" name="" value="登  录" style="background-color: rgb(0, 67, 199)"></p>
        <p class="txt"><a class="" href="reg.jsp">免费注册</a><a href="forget.html">忘记密码？</a></p>
    </form>

</div>
</body>
</html>