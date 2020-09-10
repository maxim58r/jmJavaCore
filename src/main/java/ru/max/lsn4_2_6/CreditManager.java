package ru.max.lsn4_2_6;

public class CreditManager implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws Exception {
        return switch (bankClient.getHistory()) {
            case "OK" -> true;
            case "BadCreditHistory" -> throw new BadCreditHistoryException();
            case "ProblemWithLaw" -> throw new ProblemWithLawException();
            default -> false;
        };
    }
}
