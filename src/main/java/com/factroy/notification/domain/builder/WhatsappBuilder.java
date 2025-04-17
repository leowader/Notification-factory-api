package com.factroy.notification.domain.builder;

import com.factroy.notification.domain.WhatsappNotification;

import java.util.ArrayList;

public class WhatsappBuilder implements IBuilder<WhatsappNotification> {
    private WhatsappNotification whatsappNotification = new WhatsappNotification();

    public WhatsappBuilder phoneNumber(String phoneNumber) {
        whatsappNotification.setPhoneNumber(phoneNumber);
        return this;
    }

    public WhatsappBuilder message(String message) {
        whatsappNotification.setMessage(message);
        return this;
    }

    public WhatsappBuilder mediaUrl(String mediaUrl) {
        whatsappNotification.setMediaUrl(mediaUrl);
        return this;
    }

    public WhatsappBuilder caption(String caption) {
        whatsappNotification.setCaption(caption);
        return this;
    }

    public WhatsappBuilder language(String language) {
        whatsappNotification.setLanguage(language);
        return this;
    }

    public WhatsappBuilder interactiveButtons(ArrayList<String> interactiveButtons) {
        whatsappNotification.setInteractiveButtons(interactiveButtons);
        return this;
    }


    @Override
    public WhatsappNotification build() {
        return whatsappNotification;
    }
}
