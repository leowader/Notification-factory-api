package com.factroy.notification.domain.factory;


import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.SMSNotification;
import com.factroy.notification.domain.builder.SMSBuilder;
import com.factroy.notification.dtos.NotificationRequest;

public class SMSFactory extends NotificationFactory {
    @Override
    public INotification createNotification(NotificationRequest data) {
        return new SMSBuilder()
                .phoneNumber(data.getSmsNotification().getPhoneNumber())
                .message(data.getSmsNotification().getMessage())
                .senderId(data.getSmsNotification().getSenderId())
                .deliveryReportRequired(data.getSmsNotification().isDeliveryReportRequired())
                .scheduleTime(data.getSmsNotification().getScheduleTime())
                .build();
    }
}
