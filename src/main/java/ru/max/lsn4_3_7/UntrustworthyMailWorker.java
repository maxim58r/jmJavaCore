package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class UntrustworthyMailWorker implements MailService{
   private final MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;

    }
    private MailService getRealMailService() {
        for (MailService mailService : this.mailServices) {
            processMail(mailService)
        }
        return new RealMailService();
    }


    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
