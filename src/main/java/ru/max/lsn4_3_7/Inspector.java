package ru.max.lsn4_3_7;

/**
 * @author Serov Maxim
 */
public class Inspector implements MailService{
    public void IllegalPackageException() {

    }

    public void StolenPackageException() {

    }

    @Override
    public Sendable processMail(Sendable mail) {


        return mail;
    }
}
