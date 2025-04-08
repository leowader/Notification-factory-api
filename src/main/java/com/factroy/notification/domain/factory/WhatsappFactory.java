package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.WhatsappNotification;

public class WhatsappFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new WhatsappNotification();
    }
}
