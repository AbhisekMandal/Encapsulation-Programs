// BankAccount.java
class Bank{
    // Step 1: Private data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Step 2: Constructor to initialize fields
    public Bank(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Step 3: Getter for account number (no setter)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Step 4: Getter and Setter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Step 5: Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Step 6: Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Step 7: Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
// Main.java
public class BankAccount {
    public static void main(String[] args) {
        // Creating a bank account object
        Bank account = new Bank("AC123456", "John Doe", 1000.0);

        // Depositing 5000
        account.deposit(5000);

        // Withdrawing 2000
        account.withdraw(2000);

        // Printing account details
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());
    }
}
