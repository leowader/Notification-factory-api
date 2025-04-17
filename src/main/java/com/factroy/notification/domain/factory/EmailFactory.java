package com.factroy.notification.domain.factory;

import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.builder.EmailBuilder;
import com.factroy.notification.dtos.NotificationRequest;

public class EmailFactory extends NotificationFactory {
    @Override
    public INotification createNotification(NotificationRequest data) {
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


/*


    private ArrayList<String> cc;
    private PriorityEmail priority;
    private ArrayList<String> bcc;
    private ArrayList<String> attachments;
    static TwilioConfig twilioConfig = new TwilioConfig();
*/