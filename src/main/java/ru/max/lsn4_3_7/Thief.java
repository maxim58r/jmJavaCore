package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class Thief implements MailService {
    private final int price;
    private int sum;

    {
        sum = 0;
    }

    public Thief(int price) {
        this.price = price;
    }

    public int getStolenValue() {
        return sum;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        int contentPrice = 0;
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() > price) {
                sum += ((MailPackage) mail).getContent().getPrice();
                String contentParcel = "stones instead of " + ((MailPackage) mail).getContent().getContent();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package(contentParcel, contentPrice));
            }
        }
        return mail;
    }
}