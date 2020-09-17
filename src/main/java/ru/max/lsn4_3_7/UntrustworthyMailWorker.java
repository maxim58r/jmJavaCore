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
        Sendable sendable = mailServices[0].processMail(mail);
        for (int i = 1; i < mailServices.length; i++) {
            sendable = mailServices[i].processMail(sendable);
        }
//        for (MailService mailService :
//                mailServices) {
//            mailService.processMail(mailService.processMail(mail));
//        }
        return getRealMailService().processMail(mail);
    }
}
