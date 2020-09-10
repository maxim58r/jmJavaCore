package ru.max.lsn4_2_6;

public class Main {
    public static void main(String[] args) throws Exception {
        CreditManager creditManager = new CreditManager();
        BankClient bankClient = new BankClient();
        System.out.println(getCreditForClient(creditManager, bankClient));

    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws Exception {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (Exception e) {
            if (e.toString().contains("BadCreditHistory")) {
                System.out.println("Проблемы с банковской историей");
            }
            return false;
        }
    }
}
