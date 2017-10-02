package com.latewind.common.tools.mail;

public class EmailSender {
	
	public static void main(String[] args){  
        //这个类主要是设置邮件  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.163.com");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     mailInfo.setUserName("lsqwell@163.com");   
     mailInfo.setPassword("password");//您的邮箱密码   
     mailInfo.setFromAddress("lsqwell@163.com");   
     mailInfo.setToAddress("lsqwell@sina.com");   
     mailInfo.setSubject("设置邮箱标题");   
     mailInfo.setContent("设置邮箱内容");  
     System.out.println("send");
        //这个类主要来发送邮件  
     SimpleMailSender sms = new SimpleMailSender();  
         sms.sendTextMail(mailInfo);//发送文体格式   
   } 
}
