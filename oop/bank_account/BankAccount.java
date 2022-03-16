import java.util.Random;

public class BankAccount {
  private static int numberOfBankAccounts = 0;
  private static int totalAssets = 0;

  private long accountNumber;
  private double checkingBalance;
  private double savingsBalance;

  public BankAccount() {
    numberOfBankAccounts++;
    this.accountNumber = generateAccountNumber();
  }
  public static int getNumberOfBankAccounts() {
    return numberOfBankAccounts;
  }
  public static double getTotalAssets() {
    return totalAssets;
  }
  private long generateAccountNumber() {
    long number;
    number = (long) (Math.random()*999999999)+1;
    return number;
  }

  public double getAccountNumber() {
    return this.accountNumber;
  }
  public double getCheckingBalance() {
    return this.checkingBalance;
  }
  public double getSavingsBalance() {
    return this.savingsBalance;
  }
  public void depositChecking(double deposit) {
    this.checkingBalance += deposit;
    totalAssets += deposit;
  }
  public void depositSavings(double deposit) {
    this.savingsBalance += deposit;
    totalAssets += deposit;
  }
  public void withdrawChecking(double withdraw) {
    if (withdraw <= this.checkingBalance) {
      this.checkingBalance -= withdraw;
      totalAssets -= withdraw;
    } else {
      System.out.println("Insufficient funds.");
    }
  }
  public void withdrawSavings(double withdraw) {
    if (withdraw <= this.savingsBalance) {
      this.savingsBalance -= withdraw;
      totalAssets -= withdraw;
    } else {
      System.out.println("Insufficient funds.");
    }
  }
}
