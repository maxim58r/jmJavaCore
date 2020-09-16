package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;

    }

    private MailService getRealMailService() {
        RealMailService realMailService = null;

        return realMailService;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        Sendable sendable = null;
        for (int i = 0; i < mailServices.length; i++) {

        }
        for (MailService service : mailServices) {
          sendable = service.processMail(mail);
        }
        return sendable;
    }
}
