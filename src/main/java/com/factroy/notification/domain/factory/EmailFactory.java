package com.factroy.notification.domain.factory;

import com.factroy.notification.domain.EmailNotification;
import com.factroy.notification.domain.INotification;
public class EmailFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
