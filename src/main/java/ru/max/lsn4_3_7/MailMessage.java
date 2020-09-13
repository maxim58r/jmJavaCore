package ru.max.lsn4_3_7;

import java.util.Objects;

/**
 * @author Serov Maxim
 */
public class MailMessage extends AbstractSendable {

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailMessage that = (MailMessage) o;

        if (!Objects.equals(message, that.message)) return false;

        return true;
    }

}