package com.factroy.notification.config;


import com.factroy.notification.domain.factory.EmailFactory;
import com.factroy.notification.domain.factory.NotificationFactory;
import com.factroy.notification.domain.factory.SMSFactory;
import com.factroy.notification.domain.factory.WhatsappFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class ConfigFactoryNotification {
    private NotificationFactory notificationFactory;

    public NotificationFactory configurationFactory(String paymentType) {
        return switch (paymentType.toLowerCase()) {
            case "sms" -> new SMSFactory();
            case "whatsapp" -> new WhatsappFactory();
            case "email" -> new EmailFactory();
            default -> throw new IllegalArgumentException("Método de notificacion no soportado: " + paymentType);
        };
    }
}
