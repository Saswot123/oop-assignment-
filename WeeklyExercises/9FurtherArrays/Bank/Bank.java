package week9;

public class Bank {
    private static final int MAX_CUSTOMERS = 30;
    private BankAccount[] accounts;
    private int numCustomers;

    public Bank() {
        accounts = new BankAccount[MAX_CUSTOMERS];
        numCustomers = 0;
    }

    public void createAccount(int accountNumber) {
        if (numCustomers < MAX_CUSTOMERS) {
            accounts[numCustomers] = new BankAccount(accountNumber);
            numCustomers++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Cannot create more accounts. Maximum limit reached.");
        }
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void addInterestToAll() {
        for (int i = 0; i < numCustomers; i++) {
            accounts[i].addInterest();
        }
        System.out.println("Interest added to all accounts successfully.");
    }

    private BankAccount findAccount(int accountNumber) {
        for (int i = 0; i < numCustomers; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}

