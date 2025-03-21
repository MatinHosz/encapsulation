package bankpack.account;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Transaction Account\n");
    }
    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount to withdraw must be positive\n");
            return;
        }
        if (amount  > getBalance() + overDraftLimit) {
            System.out.println("Insufficient balance\n");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " from account: " + getAccountNumber());
    }
}