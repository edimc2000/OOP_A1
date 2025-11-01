package OOP_A1;

import static java.lang.System.out;

public class SavingsAccount {

  private String accountName;
  private Double initialBalance;
  private Double balance;
  private final int ACCOUNT_NUMBER;

  private static Double annualInterestRate = 0.00 ;
  private static Double monthlyInterestRate = annualInterestRate / 12;

  public String getAccountName() {
    return accountName;
  }

  public int getAccountNumber() {
    return ACCOUNT_NUMBER;
  }

  public Double getInitialBalance() {
    return initialBalance;
  }

  public Double getBalance() {
    return balance;
  }

  public static Double getMonthlyInterestRate() {
    monthlyInterestRate = annualInterestRate / 12;
    return monthlyInterestRate;
  }

  public static Double getAnnualInterestRate() {
    return annualInterestRate;
  }


  public static void  setAnnualInterestRate(Double rate) {
    annualInterestRate = rate;
  }

  SavingsAccount(String accountName, int accountNumber, Double initialBalance) {
    this.accountName = accountName;
    this.ACCOUNT_NUMBER = accountNumber;
    this.initialBalance = initialBalance;
  }

  // overload
  SavingsAccount(int accountNumber, Double initialBalance) {
    this.ACCOUNT_NUMBER = accountNumber;
    this.initialBalance = initialBalance;
  }

  public Double addMonthlyInterest(Double balance){
    return balance * getMonthlyInterestRate(); 
  }

}
