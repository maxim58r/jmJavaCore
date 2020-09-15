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
        MailService mailService = null;
        for (MailService service : mailServices) {
            mailService = service;
        }
        return mailService;
    }

    private void serialTransmissionOfLetters() {

    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
