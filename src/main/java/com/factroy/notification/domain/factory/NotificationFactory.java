package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.dtos.NotificationRequest;

public abstract class NotificationFactory {

    public INotification getNotification(NotificationRequest data){

        return createNotification(data);
    }

    public abstract INotification createNotification(NotificationRequest data);
}
