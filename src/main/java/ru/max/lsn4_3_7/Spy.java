package ru.max.lsn4_3_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Serov Maxim
 */
public class Spy implements MailService {
    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass().equals(MailMessage.class)) {
            if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers")) {
               logger.log(Level.WARNING, "Detected target mail correspondence: from {from} to {to} {message}", new Object[]
                        {mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
            } else {
                logger.log(Level.INFO, "Usual correspondence: from {from} to {to}", new Object[]
                        {mail.getFrom(), mail.getTo()});
            }
        }
        return mail;
    }
}
