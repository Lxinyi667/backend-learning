package top.lxyi.mail.service;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Resource
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String fromEmail;

    public void sendSimpleMail(String to ,String subject,String content){
        //创建简单邮件消息
        SimpleMailMessage message = new SimpleMailMessage();
        //谁发的
        message.setFrom(fromEmail);
        //谁要接收
        message.setTo(to);
        //邮件标题
        message.setSubject(subject);
        //邮件内容
        message.setText(content);
        javaMailSender.send(message);
    }
    public void sendMimeMail(String to ,String subject,String content) throws MessagingException {
        //创建简单邮件消息
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);
        //谁发的
        helper.setFrom(fromEmail);
        //谁要接收
        helper.setTo(to);
        //邮件标题
        helper.setSubject(subject);
        //邮件内容
        helper.setText(content,true);
        javaMailSender.send(message);
    }
}
