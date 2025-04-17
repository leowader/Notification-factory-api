package com.factroy.notification.dtos;

import com.factroy.notification.domain.EmailNotification;
import com.factroy.notification.domain.SMSNotification;
import com.factroy.notification.domain.WhatsappNotification;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private EmailNotification emailNotification;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private WhatsappNotification whatsappNotification;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SMSNotification smsNotification;
}
