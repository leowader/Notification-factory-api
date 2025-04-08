package com.factroy.notification.domain;


import com.factroy.notification.config.TwilioConfig;
import com.factroy.notification.dtos.DtoPaymentResponse;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class WhatsappNotification implements INotification {


    @Override
    public String sendNotification(DtoPaymentResponse data) {
        TwilioConfig twilioConfig = new TwilioConfig();
        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
        String formattedMessage = String.format(
                "🧾 *Pago procesado exitosamente*\n\n" +
                        "📌 *Estado:* %s\n" +
                        "💬 *Mensaje:* %s\n" +
                        "💳 *Tipo de pago:* %s\n" +
                        "💰 *Monto inicial:* $%.2f\n" +
                        "🧾 *Monto final (con recargos):* $%.2f",
                data.getState(),
                data.getMessage(),
                data.getPaymentType(),
                data.getInitialAmount(),
                data.getFinalAmount()
        );

        Message message = Message.creator(
                new PhoneNumber("whatsapp:" + twilioConfig.getToNumber()),
                new PhoneNumber("whatsapp:+14155238886"),
                formattedMessage
        ).create();

        return "Mensaje enviado a WHATSAPP con SID " + message.getSid() + " al número +57 3022575805";
    }
}


