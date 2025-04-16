package com.factroy.notification.domain.builder;

import com.factroy.notification.domain.SMSNotification;

import java.time.LocalDate;

public abstract class SMSBuilder implements IBuilder<SMSNotification> {

    private final SMSNotification smsNotification = new SMSNotification();

    public SMSBuilder phoneNumber(String phoneNumber) {
        smsNotification.setPhoneNumber(phoneNumber);
        return this;
    }

    public SMSBuilder message(String message) {
        smsNotification.setMessage(message);
        return this;
    }
    public SMSBuilder senderId(String senderId) {
        smsNotification.setSenderId(senderId);
        return this;
    }
    public SMSBuilder deliveryReportRequired(boolean deliveryReportRequired) {
        smsNotification.setDeliveryReportRequired(deliveryReportRequired);
        return this;
    }
    public SMSBuilder scheduleTime(LocalDate scheduleTime) {
        smsNotification.setScheduleTime(scheduleTime);
        return this;
    }

    @Override
    public SMSNotification build() {
        return smsNotification;
    }
}
