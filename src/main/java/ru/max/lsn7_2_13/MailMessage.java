package ru.max.lsn7_2_13;

public class MailMessage extends AbstractSendable<String> {

    public MailMessage(java.lang.String from, java.lang.String to, String content) {
        super(from, to, content);
    }
}
