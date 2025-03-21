package bankpack.account;

public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();
    
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount to deposit must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " to account: " + accountNumber);
    }
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount to withdraw must be positive");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " from account: " + accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
}