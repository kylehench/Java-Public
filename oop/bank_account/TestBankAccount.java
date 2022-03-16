public class TestBankAccount {
  public static void main(String[] args) {
    BankAccount Bob = new BankAccount();
    System.out.println("Created bank acount for Bob");
    System.out.println("Number of accounts: " + BankAccount.getNumberOfBankAccounts());
    BankAccount Fred = new BankAccount();
    System.out.println("Created bank acount for Fred");
    System.out.println("Number of accounts: " + BankAccount.getNumberOfBankAccounts());
    System.out.println("Bob's checking balance: " + Bob.getCheckingBalance());
    System.out.println("Bob deposits $5.50");
    Bob.depositChecking(5.5);
    System.out.println("Bob's new balance: " + Bob.getCheckingBalance());
    System.out.println("Bob attempts to withdraw $10");
    Bob.withdrawChecking(10);
    System.out.println("Bob attempts to withdraw $5");
    Bob.withdrawChecking(5);
    System.out.println("Bob's new balance: " + Bob.getCheckingBalance());
    System.out.println("Bob's account number: " + Bob.getAccountNumber());
  }
}
