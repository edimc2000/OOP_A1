package OOP_A1;

/**
 * SavingsAccountDriver.java
 * The SavingsAccountDriver class serves as the main controller and demonstration class
 * for the SavingsAccount class.
 * 
 * Author: Eddie C. 
 * Date: 01-Nov-2025
 */

import static java.lang.System.*;

public class SavingsAccountDriver {
    public static void main(String[] args) {

        // instantiation of 2 savings account     
        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);
        
        // annual interest rate setting 
        SavingsAccount.setAnnualInterestRate(0.05);
        
        // display to compare 
        out.println(SavingsAccount.compareAccounts(saver1, saver2));
    }
}
