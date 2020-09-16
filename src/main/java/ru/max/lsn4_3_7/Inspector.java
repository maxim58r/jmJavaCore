package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class Inspector extends RuntimeException implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        String[] illegals = {"weapons", "banned substance"};
        String stolen = "stones";
        if (mail instanceof MailPackage) {
            for (String illegal : illegals) {
                if (((MailPackage) mail).getContent().getContent().contains(illegal)) {
                    throw new IllegalPackageException();
                }
            }
        }
        if (mail instanceof MailMessage) {
            if (((MailMessage) mail).getMessage().contains(stolen)) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
