package bankpack.account;

import java.util.ArrayList;
import bankpack.account.BankAccount;

public class BankCustomers {
    private ArrayList<BankAccount> accountList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountList) {
            System.out.println("Account name: " + account.getAccountHolderName() + "\tAccount number: " + account.getAccountNumber() +
            "\tBalance: " + account.getBalance());
            System.out.println();
        }
    }
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        }
        System.out.println("Account with account number " + accountNumber + " not found!");
        return null;
    }
}