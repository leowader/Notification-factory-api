package com.factroy.notification.config;

import com.twilio.Twilio;
import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import lombok.Getter;

import java.util.Objects;

@Getter

public class TwilioConfig {

    private final String accountSid ;

    private final String authToken ;

    private final String toNumber;
    private final String passwordEmail;
    private final int mailPort ;
    private final String mailHost;
    private final String mailUsername ;
    public TwilioConfig() {
        Dotenv dotenv = Dotenv.load();
        this.accountSid = dotenv.get("accountSid");
        this.authToken = dotenv.get("authToken");
        this.toNumber=dotenv.get("toNumber");
        this.passwordEmail=dotenv.get("emailPassword");
        this.mailPort= Integer.parseInt(Objects.requireNonNull(dotenv.get("MAIL_PORT")));
        this.mailHost=dotenv.get("MAIL_HOST");
        this.mailUsername=dotenv.get("MAIL_USERNAME");
    }

    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }

}
