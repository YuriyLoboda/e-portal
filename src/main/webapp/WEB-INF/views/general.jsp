
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
    <title>Мой Кабинет</title>
    <link rel="stylesheet" href="resources/css/style.css">
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <script type="text/javascript"  src="resources/js/myjs.js"></script>
    
	
    
</head>

<body>
<div id="header">
<div class="language">
		<ul>
 			<a onclick="sandLanRU()"><li>RU</li></a>
 			<a onclick ="sandLanEN()"><li>EN</li></a>
		</ul>
	</div>
</div>
	<div class = "buttons">
		<%ApplicationContext context = new ClassPathXmlApplicationContext("messages.xml"); %>
		<%MessageSource ms = context.getBean("messageSourse", MessageSource.class); %>
		<%Locale locale = (Locale)session.getAttribute("language"); %>
		<input type="button" id ="myAdwords" value = <% out.println(ms.getMessage("myAdwords", null, locale)); %>>
		<input type="button" id ="add" value =<%out.println(ms.getMessage("add", null, locale)); %> >
		<input type="button" id ="delete" value = <%out.println(ms.getMessage("delete", null, locale)); %>>	
	</div>
		
	


</body>
</html>