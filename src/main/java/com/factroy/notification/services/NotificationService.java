package com.factroy.notification.services;

import com.factroy.notification.config.ConfigFactoryNotification;
import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.builder.IBuilder;
import com.factroy.notification.domain.factory.NotificationFactory;
import com.factroy.notification.dtos.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class NotificationService {
    @Autowired
    private ConfigFactoryNotification configFactoryNotification;

    public String processNotification(String notificationType, NotificationRequest data) {
        NotificationFactory notificationFactory = configFactoryNotification.configurationFactory(notificationType);
        return notificationFactory.getNotification(data).sendNotification();
    }
}
