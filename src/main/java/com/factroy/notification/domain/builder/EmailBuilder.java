package com.factroy.notification.domain.builder;

import com.factroy.notification.domain.EmailNotification;
import com.factroy.notification.domain.PriorityEmail;

import java.util.ArrayList;

public class EmailBuilder implements IBuilder<EmailNotification> {


    private final EmailNotification emailNotification = new EmailNotification();

    public EmailBuilder to(String to) {

        emailNotification.setTo(to);
        return this;
    }

    public EmailBuilder subject(String subject) {

        emailNotification.setSubject(subject);
        return this;
    }

    public EmailBuilder body(String body) {

        emailNotification.setBody(body);
        return this;
    }

    public EmailBuilder cc(ArrayList<String> cc) {

        emailNotification.setCc(cc);
        return this;
    }

    public EmailBuilder priority(PriorityEmail priority) {

        emailNotification.setPriority(priority);
        return this;

    }

    public EmailBuilder bcc(ArrayList<String> bcc) {
        emailNotification.setBcc(bcc);
        return this;
    }

    public EmailBuilder attachments(ArrayList<String> attachments) {
        emailNotification.setAttachments(attachments);
        return this;
    }


    @Override
    public EmailNotification build() {
        return emailNotification;
    }
}
