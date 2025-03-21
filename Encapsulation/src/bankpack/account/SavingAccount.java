package bankpack.account;

public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest calculated: " + interest + " account type: Saving Account");
    }
}