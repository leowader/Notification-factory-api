package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.SMSNotification;

public class SMSFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}
