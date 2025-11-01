package OOP_A1;

import static java.lang.System.*;

public class SavingsAccountDriver {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);
        SavingsAccount.setAnnualInterestRate(0.05);

        SavingsAccount.compareAccounts(saver1, saver2);
    }
}
