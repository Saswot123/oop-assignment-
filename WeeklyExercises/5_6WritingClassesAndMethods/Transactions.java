package Assignment;


public class Transactions {
    public static void main(String[] args) {
        // Creating accounts with different constructors
        Account account1 = new Account("kaushal", "45678", 1000.0);
        Account account2 = new Account("ram", "1234");
        
        // Printing account information
        System.out.println("Account Information:");
        System.out.println("Name: " + account1.getName() + ", Account Number: " + account1.getAccountNumber() + ", Balance: $" + account1.getBalance());
        System.out.println("Name: " + account2.getName() + ", Account Number: " + account2.getAccountNumber() + ", Balance: $" + account2.getBalance());
    }
}
