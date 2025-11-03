`This readme.md file has been generated with assistance from Perplexity AI. The rest of the codes were without AI.`

# Savings Account Application

A small Java project demonstrating basic object-oriented programming using a `SavingsAccount` model. The code lives under the `OOP_A1` package and includes a small driver that prints a 12-month monthly-compounding comparison for two accounts.

## Project Overview

Files in this repository (found in package `OOP_A1`):

- `Helper.java` — Utility formatting methods used across the project.
- `SavingsAccount.java` — Core savings account model with balance and monthly interest computations.
- `SavingsAccountDriver.java` — Driver program that demonstrates the model by instantiating two accounts, setting the annual interest rate, and printing a 12-month comparison.

## Quick Features

- Represent savings accounts with account number and balance.
- Configure a shared annual interest rate (static) and compute monthly compounding.
- Utility formatting for decimal numbers and week numbers.
- A driver that prints a formatted 12-month projection table for two accounts.

## Package / Class Structure (extracted from source)

Package: `OOP_A1`

### `SavingsAccount` (file: `SavingsAccount.java`)

Instance fields:
- `private final int ACCOUNT_NUMBER` — account identifier (set at construction)
- `private double balance` — current balance

Static fields:
- `private static double annualInterestRate` — shared annual interest rate (default 0.00)

Constructor:
- `SavingsAccount(int accountNumber, double balance)`

Public methods (signatures taken from the source):
- `public int getAccountNumber()`
- `public double getBalance()`
- `public static double getAnnualInterestRate()`
- `public static void setAnnualInterestRate(double rate)`
- `public void setCurrentBalance(double amount)`
- `public void addMonthlyInterest()`
- `@Override public String toString()` — formats the account number and balance using `Helper.formatTwoDecimals`
- `public static String compareAccounts(SavingsAccount account1, SavingsAccount account2)` — builds a 12-month comparison table and returns it as a formatted string

Notes:
- `addMonthlyInterest()` multiplies the balance by (1 + annualInterestRate / 12) to simulate monthly compounding.

### `Helper` (file: `Helper.java`)

Utility static methods:
- `public static String formatTwoDecimals(double decimal)` — returns a string formatted with grouping separators and two decimal places (e.g. "1,234.56").
- `public static String formatfourDecimals(double decimal)` — returns a string with four decimal places.
- `public static String formatWeekNumber(int weekNumber)` — returns a zero-padded week number string for week numbers 1–9 (e.g. "05" for week 5).

### `SavingsAccountDriver` (file: `SavingsAccountDriver.java`)

This is a simple `main` driver. Behavior observed in the repository:

1. Creates two accounts:
	- `new SavingsAccount(10002, 2000)`
	- `new SavingsAccount(10003, 3000)`
2. Sets the annual interest rate:
	- `SavingsAccount.setAnnualInterestRate(0.05);` (5% annual)
3. Prints the monthly comparison table using:
	- `System.out.println(SavingsAccount.compareAccounts(saver1, saver2));`

## How to compile and run (Windows cmd.exe)

From the folder that contains the package directory `OOP_A1` (for example the `src\\OOP_A1` parent shown in this workspace), run:

```bat
javac OOP_A1\\*.java
java OOP_A1.SavingsAccountDriver
```

If you prefer to compile from the package folder directly (not recommended when packages are used), adjust commands accordingly.

## Actual sample output (captured by running the driver)

The driver prints a 12-month projection table. Exact output from a run in this workspace (annual interest rate = 0.05):

```
Monthly balances for one year with 0.05 annual interest:

Month           Account #       Balance         Account #       Balance
-----           ---------       -------         ---------       -------
  0             10002           $2,000.00       10003           $3,000.00
  1             10002           $2,008.33       10003           $3,012.50
  2             10002           $2,016.70       10003           $3,025.05
  3             10002           $2,025.10       10003           $3,037.66
  4             10002           $2,033.54       10003           $3,050.31
  5             10002           $2,042.02       10003           $3,063.02
  6             10002           $2,050.52       10003           $3,075.79
  7             10002           $2,059.07       10003           $3,088.60
  8             10002           $2,067.65       10003           $3,101.47
  9             10002           $2,076.26       10003           $3,114.39
 10             10002           $2,084.91       10003           $3,127.37
 11             10002           $2,093.60       10003           $3,140.40
 12             10002           $2,102.32       10003           $3,153.49

Final balance of both accounts combined : $ 5,255.81
```

## Requirements

- Java 8 or later
- No external dependencies (uses only Java Standard Library)



## Contact

For questions or issues regarding this project, please refer to the course materials or author.

