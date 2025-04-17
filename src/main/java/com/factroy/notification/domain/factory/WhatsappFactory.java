package com.factroy.notification.domain.factory;

import com.factroy.notification.domain.INotification;
import com.factroy.notification.domain.builder.WhatsappBuilder;
import com.factroy.notification.dtos.NotificationRequest;

public class WhatsappFactory extends NotificationFactory {
    @Override

    public INotification createNotification(NotificationRequest data) {
        return new WhatsappBuilder()
                .phoneNumber(data.getSmsNotification().getPhoneNumber())
                .message(data.getSmsNotification().getMessage())
                .mediaUrl(data.getWhatsappNotification().getMediaUrl())
                .caption(data.getWhatsappNotification().getCaption())
                .language(data.getWhatsappNotification().getLanguage())
                .build();
    }
}
