import bankpack.account.SavingAccount;
import bankpack.account.TransactionAccount;
import bankpack.customers.BankCustomers;

public class Encapsulation {
    public static void main(String[] args) {
        BankCustomers Bank =  new BankCustomers();
        
        SavingAccount savingAccount1 = new SavingAccount("91234", "John Doe", 1000);
        SavingAccount savingAccount2 = new SavingAccount("95678", "Jane Wiliam", 2000);
        SavingAccount savingAccount3 = new SavingAccount("91011", "Emma Smith", 3000);

        TransactionAccount transactionAccount1 = new TransactionAccount("789456", "Matin", 1000);
        TransactionAccount transactionAccount2 = new TransactionAccount("987654", "Peshawa", 2000);
        TransactionAccount transactionAccount3 = new TransactionAccount("456789", "Arian", 3000);

        Bank.addAccount(savingAccount1);
        Bank.addAccount(savingAccount2);
        Bank.addAccount(savingAccount3);
        Bank.addAccount(transactionAccount1);
        Bank.addAccount(transactionAccount2);
        Bank.addAccount(transactionAccount3);

        Bank.findAccount("91234");
        Bank.findAccount("977654");

        System.out.println("Balance: " + savingAccount1.getBalance() + " to account: " + savingAccount1.getAccountNumber());
        savingAccount1.deposit(1000);
        System.out.println("Balance: " + savingAccount1.getBalance() + " to account: " + savingAccount1.getAccountNumber());

        transactionAccount1.deposit(-1000);

        savingAccount2.calculateInterest();
        transactionAccount2.calculateInterest();

        savingAccount3.withdraw(500);
        savingAccount3.withdraw(-100);
        savingAccount3.withdraw(4000);
        transactionAccount3.withdraw(-500);
        transactionAccount3.withdraw(100);
        transactionAccount3.withdraw(3000);

        Bank.showAllBalances();
    }
}

