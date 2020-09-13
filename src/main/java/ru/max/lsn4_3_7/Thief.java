package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class Thief implements MailService{
    private final int price;

    public Thief(int price) {
        this.price = price;
    }

    private int getStolenValue() {
        int sum = 0;
        return sum;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
