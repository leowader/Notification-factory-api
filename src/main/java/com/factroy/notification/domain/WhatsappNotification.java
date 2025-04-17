package com.factroy.notification.domain;


import com.factroy.notification.config.TwilioConfig;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WhatsappNotification implements INotification {

    private String phoneNumber;
    private String message;
    private String mediaUrl;
    private String caption;
    private String language;
    private ArrayList<String> interactiveButtons;

    @Override
    public String sendNotification( ) {
        TwilioConfig twilioConfig = new TwilioConfig();
        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
        String formattedMessage = (
                "🧾 *Pago procesado exitosamente*\n\n" +
                        "💬 *Mensaje:* %s\n" +
                       this.getMessage()
        );

        Message message = Message.creator(
                new PhoneNumber("whatsapp:" + twilioConfig.getToNumber()),
                new PhoneNumber("whatsapp:+14155238886"),
                formattedMessage
        ).create();

        return "Mensaje enviado a WHATSAPP con SID " + message.getSid() + " al número +57 3022575805";
    }
}


