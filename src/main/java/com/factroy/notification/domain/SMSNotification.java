package com.factroy.notification.domain;

import com.factroy.notification.config.TwilioConfig;
import com.factroy.notification.domain.builder.IBuilder;
import com.factroy.notification.domain.builder.SMSBuilder;
import com.factroy.notification.dtos.DtoPaymentResponse;
import com.factroy.notification.dtos.NotificationRequest;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SMSNotification implements INotification {

    private String phoneNumber;
    private String message;
    private String senderId;
    private boolean deliveryReportRequired;
    private LocalDate scheduleTime;

    @Override
    public String sendNotification( ) {
        TwilioConfig twilioConfig = new TwilioConfig();
        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());

        String formattedMessage = (
                "Pago procesado exitosamente:\n" +
                        "Mensaje: %s\n" +
                        this.getMessage()
        );
        Message message = Message.creator(
                new PhoneNumber(twilioConfig.getToNumber()),
                new PhoneNumber("+19809070074"),
                formattedMessage
        ).create();

        return "Mensaje enviado por SMS con SID " + message.getSid() + " al número " + twilioConfig.getToNumber();


    }

}
