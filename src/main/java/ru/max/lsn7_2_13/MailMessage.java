package ru.max.lsn7_2_13;

public class MailMessage<String> extends AbstractSendable<String> {

//    public MailMessage(String from, String to, String content) {

//        super(content);
//    }

    public MailMessage(java.lang.String from, java.lang.String to, String content) {
        super(from, to, content);
    }

    @Override
    public String getContent() {
        return getContent();
    }
}
