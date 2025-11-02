package OOP_A1;

/**
 * SavingsAccount.java
 * The SavingsAccount class represents a savings account with its account number and initial balance.
 * It provides functionality to compute the monthly compounding interest based on the annual interest rate and
 * a way to display and compare two accounts. 
 * 
 * Author: Eddie C. 
 * Date: 01-Nov-2025
 */

import static java.lang.System.out;
import OOP_A1.Helper;

public class SavingsAccount {

  /* constructor parameter */
  private final int ACCOUNT_NUMBER;

  /* constructor parameter */
  private double balance;

  /* interest rates */
  private static double annualInterestRate = 0.00;

  /**
   * Gets the account number
   * 
   * @return the account number
   */
  public int getAccountNumber() {
    return ACCOUNT_NUMBER;
  }

  /**
   * Gets the balance
   * 
   * @return the balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Gets the annual interest rate
   * 
   * @return the annual interest rate
   */
  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /**
   * Sets the annual interest rate
   * 
   * @param double annual interest rate
   */
  public static void setAnnualInterestRate(double rate) {
    annualInterestRate = rate;
  }

  /**
   * Sets the balance (current balance)
   * 
   * @param double amount to set as balance
   */
  public void setCurrentBalance(double amount) {
    balance = amount;
  }

  /**
   * Constructs a new Saving Account with the account number and initial balance.
   * 
   * @param accountNumber is the account number
   * @param balance       is the initial balance
   */

  SavingsAccount(int accountNumber, double balance) {
    this.ACCOUNT_NUMBER = accountNumber;
    this.balance = balance;
  }

  /**
   * Calculates the new balance after adding monthly interest to the current
   * balance.
   * The interest is compounded by multiplying the current balance by (1 + monthly
   * interest rate).
   * 
   * @set the new balance after monthly interest has been added
   */
  public void addMonthlyInterest() {
    setCurrentBalance(balance * (1 + getAnnualInterestRate() / 12));
  }

  /**
   * Returns a string representation of the account, including the account number
   * and the current balance formatted to two decimal places.
   * 
   * The output is formatted as:
   * 
   * [ACCOUNT_NUMBER] $[BALANCE]
   * 
   * @return a formatted string containing the account number and balance.
   */

  @Override
  public String toString() {
    return String.format("%d \t\t$%s\t", ACCOUNT_NUMBER, Helper.formatTwoDecimals(balance));
  }

  /**
   * Compares two savings accounts by generating a 12-month balance projection
   * table
   * showing how each account's balance grows with monthly interest compounding.
   * This method resets both accounts to their initial balances and calculates
   * monthly balances for one year, displaying the results in a formatted table.
   * 
   * @param account1 the first savings account to compare
   * @param account2 the second savings account to compare
   * @return a formatted string containing a 12-month balance comparison table
   *         showing monthly balances for both accounts and their combined final
   *         balance
   */
  public static String compareAccounts(SavingsAccount account1, SavingsAccount account2) {


    StringBuilder display = new StringBuilder("Monthly balances for one year with " +
        SavingsAccount.getAnnualInterestRate() + " annual interest:\n\n");
    display.append("Month\t\tAccount #\tBalance\t\tAccount #\tBalance\n");
    display.append("-----\t\t---------\t-------\t\t---------\t-------\n");

    for (int i = 0; i <= 12; i++) {
      if (i != 0) { // Skip month 0
        account1.addMonthlyInterest();
        account2.addMonthlyInterest();
      }

      String line = String.format("%3d\t\t%s%s\n",
          i, account1.toString(), account2.toString());
      display.append(line);
    }

    // Final combined balance
    double finalBalanceBothAccounts = account1.getBalance() + account2.getBalance();
    display.append("\nFinal balance of both accounts combined\t: $ " +
        Helper.formatTwoDecimals(finalBalanceBothAccounts));

    return display.toString();
  }

}
