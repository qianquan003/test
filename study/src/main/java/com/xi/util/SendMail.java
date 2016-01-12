package com.xi.util;


import java.io.File;
import java.util.*;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SendMail {
    private String to;
    private String from_username="sd61ts1@163.com";
    private String from_nickname="xisir";
    private String subject;
    private String content;
    private boolean isHTML=true;
    private HashMap<String,File> attachment=new HashMap<String,File>();
    private HashMap<String,File> htmlFile=new HashMap<String,File>();


    public SendMail(String mail,Map<String,Object> obj) {
        this.to=mail;
        this.subject=obj.get("subject").toString();
        this.content=obj.get("content").toString();
    }

    public void setHtml(boolean isHTML){
        this.isHTML=isHTML;
    }

    public void addAttachment(File file){
        attachment.put(file.getName(),file);
    }

    public void addAttachment(String filename,File file){
        attachment.put(filename,file);
    }

    public void setLocalFileToHTMLContect(String content_id,File file){
        htmlFile.put(content_id, file);
    }

    public boolean send() {
        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
        MimeMessage mailMessage = senderImpl.createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"UTF-8");
            messageHelper.setTo(to);
            messageHelper.setFrom(from_username,from_nickname);
            messageHelper.setSubject(new String(subject.getBytes("UTF-8"), "UTF-8"));
            messageHelper.setText(content,this.isHTML);
            if(this.isHTML&&htmlFile.size()>0){
                Iterator<String> keys=htmlFile.keySet().iterator();
                while(keys.hasNext()){
                    String key=keys.next();
                    messageHelper.addInline(key,htmlFile.get(key));
                }
            }
            if(attachment.size()>0){
                Iterator<String> keys= attachment.keySet().iterator();
                while(keys.hasNext()){
                    String key=keys.next();
                    messageHelper.addAttachment(MimeUtility.encodeWord(key),attachment.get(key));
                }
            }
            senderImpl.setHost("smtp.163.com");
            senderImpl.setUsername(PropertiesUtils.getProperty("email"));
            senderImpl.setPassword(PropertiesUtils.getProperty("password"));
            senderImpl.send(mailMessage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Map<String,Object> obj =new HashMap<String,Object>();
        String subject="subject";
        obj.put("subject",subject);
        String content="content";
        obj.put("content",content);
        SendMail sm=new SendMail("sd61ts1@163.com",obj);
        sm.send();
    }
}