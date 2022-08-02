<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>后台管理登录</title>
	<link rel="stylesheet" type="text/css" href="css/admin_login.css"/>
</head>
<body>
<div class="admin_login_wrap" style="background-color: rgba(255,255,255,0.6)">
    <h1><img src="/img/temp/logoxike.png" style="width: 40%;height:40%"></h1>
    <h2 style="text-align: center">后台管理登录</h2>
    <div class="adming_login_border">
        <div class="admin_input">
            <form action="/manage/adminlogin" method="post" >
                <ul class="admin_items">
                    <li>
                        <label for="user">  </label>
                        <input type="text" placeholder="ID" name="userName" value="" id="user" size="40" class="admin_input_style" style="margin-bottom: 20px;margin-top: 20px;width: 270px" />
                    </li>
                    <li>
                        <label for="pwd">  </label>
                        <input type="password" placeholder="密码" name="passWord" value="" id="pwd" size="40" class="admin_input_style" style="margin-bottom: 20px;width: 270px" />
                    </li>
                    <li>
                        <input type="submit" tabindex="3" value="登录" class="btn btn-primary" />
                    </li>
                </ul>
            </form>
        </div>
    </div>
    <p class="admin_copyright"> &copy; 2022 Powered by ：<a href="https://blog.csdn.net/qq_54141095?spm=1000.2115.3001.5343" target="_blank">OfficialUser</a></p>
</div>
</body>
</html>