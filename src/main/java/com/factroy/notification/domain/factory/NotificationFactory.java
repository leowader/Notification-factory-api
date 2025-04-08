package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;

public abstract class NotificationFactory {

    public INotification getNotification(){

        return createNotification();

    }

    public abstract INotification createNotification();
}
