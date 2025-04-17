package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.SMSNotification;
import com.factroy.notification.dtos.NotificationRequest;

public class SMSFactory extends NotificationFactory {
    @Override
    public INotification createNotification(NotificationRequest data) {
        return new SMSNotification();
    }
}
