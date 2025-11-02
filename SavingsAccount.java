package OOP_A1;

import static java.lang.System.out;
import OOP_A1.Helper;

public class SavingsAccount {

  private String accountName;
  private double initialBalance;
  private double balance;
  private final int ACCOUNT_NUMBER;

  private static double annualInterestRate = 0.00;
  private static double monthlyInterestRate = annualInterestRate / 12;

  public String getAccountName() {
    return accountName;
  }

  public int getAccountNumber() {
    return ACCOUNT_NUMBER;
  }

  public double getInitialBalance() {
    return initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public static double getMonthlyInterestRate() {
    monthlyInterestRate = annualInterestRate / 12;
    return monthlyInterestRate;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public static void setAnnualInterestRate(double rate) {
    annualInterestRate = rate;
  }

  public void setCurrentBalance(double amount) {
    balance = amount;
  }

  SavingsAccount(String accountName, int accountNumber, double initialBalance) {
    this.accountName = accountName;
    this.ACCOUNT_NUMBER = accountNumber;
    this.initialBalance = initialBalance;
  }

  // overload
  SavingsAccount(int accountNumber, double initialBalance) {
    this.ACCOUNT_NUMBER = accountNumber;
    this.initialBalance = initialBalance;
  }

  public double addMonthlyInterest(double balance) {
    return balance * getMonthlyInterestRate();
  }

  public static void compareAccounts(SavingsAccount account1, SavingsAccount account2) {

    account1.setCurrentBalance(account1.getInitialBalance());
    account2.setCurrentBalance(account2.getInitialBalance());
    double finalBalanceBothAccounts = 0;

    StringBuilder display = new StringBuilder(
        "Monthly balances for one year with " + SavingsAccount.getAnnualInterestRate() + " annual interest:\n\n");
    display.append("Month\t\tAccount #\tBalance\t\tAccount #\tBalance\n");
    display.append("-----\t\t---------\t-------\t\t---------\t-------\n");

    for (int i = 0; i < 13; i++) {
      display.append(String.format("%3d", i)); // Right-align: 3-char width
      display.append("\t\t" + account1.ACCOUNT_NUMBER);
      display.append("\t\t$ " + Helper.formatTwoDecimals(account1.getBalance()));

      display.append("\t" + account2.ACCOUNT_NUMBER);
      display.append("\t\t$ " + Helper.formatTwoDecimals(account2.getBalance()));

      display.append("\n");
      account1.setCurrentBalance(account1.getBalance() + account1.addMonthlyInterest(account1.getBalance()));
      account2.setCurrentBalance(account2.getBalance() + account2.addMonthlyInterest(account2.getBalance()));

      if (i == 11)
        finalBalanceBothAccounts += account1.getBalance() + account2.getBalance();
    }

    display
        .append("\nFinal balance of both accounts combined\t: $ " + Helper.formatTwoDecimals(finalBalanceBothAccounts));
    out.println(display);

  }

}
