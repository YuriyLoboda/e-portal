<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ;) from Porta!</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/myjs.js"></script>
</head>
<body>
	<div class="wrap">
		<div class="head">
				
    				
		</div>
			<div class="content">
			<div class="autorization">
			<form method="post"  action="http://localhost:8080/e-portal/userCheck">
    			<input type="text" placeholder="Введите логин" name="login" >
    			<input type="password" placeholder="Введите пароль" name ="pass">
    			<input type="submit" value="Войти">
    			<input type = "button" id ="reg" value = "Регистрация">
    			</form>
    		</div>
    		<div class="registration">
    			<form method="post" action="http://localhost:8080/e-portal/userReg" >
    			<input type="text" placeholder="Введите логин" name="login" >
    			<input type="password" placeholder="Введите пароль" name ="pass">
    			<input type="password" placeholder="Подтвердите пароль" name ="passConfirm">
    			<input type="text" placeholder="e-mail" name="mail">
    			<input type="text" placeholder="ФИО" name="userName" >
    			<input type="text" placeholder="Номер телефона" name="phone" >
    			<input type="submit" value="Зарегистрироваться">
    			</form>
    		</div>
		</div>
	
	
   		 <div class="footer">&#169; Все права защищены</div>
    </div>
</body>
</html>