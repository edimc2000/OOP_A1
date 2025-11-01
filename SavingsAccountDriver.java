package OOP_A1;

import static java.lang.System.*;

public class SavingsAccountDriver {

    public static void main(String[] args) {


        SavingsAccount saver1 = new SavingsAccount(10002, (double) 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, (double) 3000);
        SavingsAccount.setAnnualInterestRate(0.05);

        out.println(saver1.getAccountNumber());
        out.println(Helper.formatTwoDecimals(saver1.getInitialBalance()));
        out.println(saver2.getAccountNumber());
        out.println(Helper.formatfourDecimals(SavingsAccount.getMonthlyInterestRate()));
        out.println(Helper.formatfourDecimals(SavingsAccount.getAnnualInterestRate()));
        
        // SavingsAccount.setAnnualInterestRate(0.10);
        out.println(Helper.formatfourDecimals(SavingsAccount.getMonthlyInterestRate()));
        out.println(Helper.formatfourDecimals(SavingsAccount.getAnnualInterestRate()));
        out.println("----");
        out.println(saver1.getInitialBalance());
        out.println(saver1.getBalance());
        out.println("----");
        out.println(saver1.addMonthlyInterest((double)2000));
    }
}
