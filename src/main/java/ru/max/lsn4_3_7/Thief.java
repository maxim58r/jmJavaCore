package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class Thief implements MailService {
    private final int price;
    private int sum = 0;

    public Thief(int price) {
        this.price = price;
    }

    public int getStolenValue() {
        return sum;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        String contentParcel = null;
        int contentPrice = 0;
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= price) {
                sum += ((MailPackage) mail).getContent().getPrice();
                contentParcel = "stones instead of " + ((MailPackage) mail).getContent().getContent();
            }
            return new MailPackage(mail.getFrom(), mail.getTo(), new Package(contentParcel, contentPrice));
        } else return mail;
    }
}