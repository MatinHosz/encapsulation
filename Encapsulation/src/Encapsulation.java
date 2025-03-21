import bankpack.account.SavingAccount;
import bankpack.account.TransactionAccount;
import bankpack.customers.BankCustomers;

public class Encapsulation {
    public static void main(String[] args) {
        BankCustomers Bank =  new BankCustomers();
        
        SavingAccount savingAccount1 = new SavingAccount("John Doe", "91234", 1000);
        SavingAccount savingAccount2 = new SavingAccount("Jane Wiliam", "95678", 2000);
        SavingAccount savingAccount3 = new SavingAccount("Emma Smith", "91011", 3000);

        TransactionAccount transactionAccount1 = new TransactionAccount("Matin", "789456", 1000);
        TransactionAccount transactionAccount2 = new TransactionAccount("Peshawa", "987654", 2000);
        TransactionAccount transactionAccount3 = new TransactionAccount("Arian", "456789", 3000);

        Bank.addAccount(savingAccount1);
        Bank.addAccount(savingAccount2);
        Bank.addAccount(savingAccount3);
        Bank.addAccount(transactionAccount1);
        Bank.addAccount(transactionAccount2);
        Bank.addAccount(transactionAccount3);

        Bank.findAccount("91234");
        Bank.findAccount("977654");

        savingAccount1.getBalance();
        savingAccount1.deposit(1000);
        savingAccount1.getBalance();

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

