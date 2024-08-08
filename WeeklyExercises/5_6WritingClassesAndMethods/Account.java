package Assignment;
class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor with name, account number, and initial balance
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Constructor with name and account number (initial balance set to zero)
    public Account(String name, String accountNumber) {
        this(name, accountNumber, 0.0); // Calling the other constructor with initial balance as zero
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}