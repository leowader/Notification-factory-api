package com.factroy.notification.domain;


import com.factroy.notification.dtos.DtoPaymentResponse;

public interface INotification {
    String sendNotification(DtoPaymentResponse data);
}
