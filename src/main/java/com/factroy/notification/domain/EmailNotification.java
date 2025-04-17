package com.factroy.notification.domain;

import com.factroy.notification.config.TwilioConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.ArrayList;
import java.util.Properties;
@Getter
@Setter
public class EmailNotification implements INotification {
    private String to;
    private String subject;
    private String body;
    private ArrayList<String> cc;
    private PriorityEmail priority;
    private ArrayList<String> bcc;
    private ArrayList<String> attachments;
    static TwilioConfig twilioConfig = new TwilioConfig();

    @Override
    public String sendNotification() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(twilioConfig.getMailHost());
        mailSender.setPort(twilioConfig.getMailPort());
        mailSender.setUsername(twilioConfig.getMailUsername());
        mailSender.setPassword(twilioConfig.getPasswordEmail());
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        SimpleMailMessage message = getSimpleMailMessage();

        mailSender.send(message);

        return "Email ✉ enviado correctamente a waderhe@gmail.com";
    }




    private SimpleMailMessage getSimpleMailMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("waderhe@gmail.com");
        message.setSubject(this.getSubject());
        message.setText(this.getBody());
        message.setFrom(twilioConfig.getMailUsername());
        return message;
    }
}