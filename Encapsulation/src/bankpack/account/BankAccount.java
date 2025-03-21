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
            throw new IllegalArgumentException("Amount to deposit must be positive");
        }
        amount += balance;
        System.out.println("Deposited: " + amount + " to account: " + accountNumber);
    }
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to withdraw must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
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