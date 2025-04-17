package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.WhatsappNotification;
import com.factroy.notification.dtos.NotificationRequest;

public class WhatsappFactory extends NotificationFactory {
    @Override
    public INotification createNotification(NotificationRequest data) {
        return new WhatsappNotification();
    }
}
