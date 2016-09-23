<%@page import="java.util.Locale"%>
<%@page import="org.springframework.context.MessageSource"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
		<div class="header">
				<div class="language">
		<ul>
 			<a onclick="sandLanRU()"><li>RU</li></a>
 			<a onclick ="sandLanEN()"><li>EN</li></a>
		</ul>
	</div>
    	<%ApplicationContext context = new ClassPathXmlApplicationContext("messages.xml"); %>
		<%MessageSource ms = context.getBean("messageSourse", MessageSource.class); %>
		<%Locale locale = (Locale)session.getAttribute("language"); %>		
		</div>
			<div class="content">
			<div class="autorization">
			
			<form method="post"  action="http://localhost:8080/e-portal/userCabinet">
    			<input type="text" placeholder=<%out.println(ms.getMessage("inputlogin", null, locale)); %> name="login" >
    			<input type="password" placeholder=<%out.println(ms.getMessage("inputpassword", null, locale)); %> name ="pass">
    			<input type="submit" value=<%out.println(ms.getMessage("login", null, locale)); %>>
    			<input type = "button" id ="reg" value = <%out.println(ms.getMessage("registration", null, locale));%>>
    			</form>
    		</div>
    		<div class="registration">
    			<form method="post" action="http://localhost:8080/e-portal/userReg" >
    			<input type="text" placeholder=<%out.println(ms.getMessage("inputlogin", null, locale)); %> name="login" >
    			<input type="password" placeholder=<%out.println(ms.getMessage("inputpassword", null, locale)); %> name ="pass">
    			<input type="password" placeholder=<%out.println(ms.getMessage("confirmpassword", null, locale)); %> name ="passConfirm">
    			<input type="text" placeholder=<%out.println(ms.getMessage("inputemail", null, locale)); %> name="mail">
    			<input type="text" placeholder=<%out.println(ms.getMessage("inputname", null, locale)); %> name="userName" >
    			<input type="text" placeholder=<%out.println(ms.getMessage("inputphone", null, locale)); %> name="phone" >
    			<input type="submit" value=<%out.println(ms.getMessage("registration", null, locale)); %>>
    			</form>
    		</div>
		</div>
	
	
   		 <div class="footer">&#169; Все права защищены</div>
    </div>
</body>
</html>