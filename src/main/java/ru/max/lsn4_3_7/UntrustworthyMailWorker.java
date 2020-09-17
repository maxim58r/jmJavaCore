package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private final RealMailService realMailService;

    {
        realMailService = new RealMailService();
    }

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable s = mail;
        for (MailService mailService : mailServices) {
            s = mailService.processMail(s);
        }
        return getRealMailService().processMail(mail);
    }
}