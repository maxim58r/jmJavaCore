package ru.max.lsn7_2_13;

public class Salary<Integer> extends AbstractSendable<Integer> {
    private final Integer content;

    public Salary(String from, String to, Integer content) {
        super(from,to,content);
        this.content = content;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
