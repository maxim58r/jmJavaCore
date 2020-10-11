package ru.max.lsn7_2_13;

public class MailMessage<String> extends AbstractSendable<String> {
    private final String content;

    public MailMessage(String from, String to, String content) {
        super(from,to,content);

        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
