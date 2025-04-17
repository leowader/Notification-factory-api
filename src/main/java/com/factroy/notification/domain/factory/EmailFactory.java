package com.factroy.notification.domain.factory;

import com.factroy.notification.domain.EmailNotification;
import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.builder.EmailBuilder;
import com.factroy.notification.dtos.NotificationRequest;

public class EmailFactory extends NotificationFactory {
    @Override
    public INotification createNotification(NotificationRequest data) {
        System.out.println("-------------------SECREO UN NUEVO OBJETO---------------------------");
        return new EmailBuilder()
                .bcc(data.getEmailNotification().getBcc())
                .body(data.getEmailNotification().getBody())
                .cc(data.getEmailNotification().getCc())
                .to(data.getEmailNotification().getTo())
                .priority(data.getEmailNotification().getPriority())
                .attachments(data.getEmailNotification().getAttachments())
                .subject(data.getEmailNotification().getSubject())
                .build();
    }
}
