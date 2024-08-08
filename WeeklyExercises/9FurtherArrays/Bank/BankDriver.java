package week9;
public class BankDriver {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        bank.createAccount(1001);
        bank.createAccount(1002);

        // Make deposits
        bank.deposit(1001, 500);
        bank.deposit(1002, 1000);

        // Make withdrawals
        bank.withdraw(1001, 200);
        bank.withdraw(1002, 1500);

        // Add interest to all accounts
        bank.addInterestToAll();
    }
}

