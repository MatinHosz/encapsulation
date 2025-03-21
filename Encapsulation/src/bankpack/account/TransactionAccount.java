package bankpack.account;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Transaction Account");
    }
    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to withdraw must be positive");
        }
        if (amount  > getBalance() + overDraftLimit) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " from account: " + getAccountNumber());
    }
}
