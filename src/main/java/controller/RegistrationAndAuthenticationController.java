package controller;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.User;
import service.Sender;
import service.UserServImpl;


@Controller
public class RegistrationAndAuthenticationController   {
	private String login;
	private String pass;
	private String passConfirm;
	private String mail;
	private String userName;
	private String phone;
	ApplicationContext context =
		    new ClassPathXmlApplicationContext(new String[] {"data-context.xml", "mailContext.xml"});

	
	
	@RequestMapping(value="userCheck")
	public String checkUser(@RequestParam(value ="login",required=false)String login ,
			@RequestParam(value= "pass",required=false)String pass)
	{
		
		UserServImpl uServ = context.getBean("userServ", UserServImpl.class);
		User user = uServ.Autontification(login, pass);
		if (user!=null){
			return "/general";
		}
		return "/errorPage";
		
	}
	@RequestMapping(value="/userReg")
	public String userReg(@RequestParam(value="login" , required=false) String login,@RequestParam(value="pass" , required=false)String pass,
			@RequestParam(value="passConfirm" , required=false) String passConfirm,@RequestParam(value="mail" , required=false) String mail,
			@RequestParam(value="userName" , required=false) String userName,@RequestParam(value="phone" , required=false) String phone){
		this.login=login;
		this.pass=pass;
		this.passConfirm=passConfirm;
		this.mail=mail;
		this.userName=userName;
		this.phone=phone;
		
		Sender mailer = context.getBean("mailService", Sender.class);	
        mailer.sendMail(mail, "Hello Dier "+login+"", "Перейдя по этой ссылке Вы подтверждаете регистрацию на нашем портале http://localhost:8080/e-portal/confirm");

	return "OKPage";
    	 
    
	
     
	}
	
	@RequestMapping(value="confirm")
	public String Ok(){
		UserServImpl uServ = context.getBean("userServ", UserServImpl.class);
		User user = new User();
		user.setLogin(login);
		user.setPass(pass);
		user.setEmail(mail);
		user.setName(userName);
		user.setContacts(phone);
		uServ.add(user);
		return "OKPage";
	}

}
