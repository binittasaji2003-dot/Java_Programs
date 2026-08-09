import java.util.Scanner;

class Account {

    // Private variables
    private int account_number;
    private String account_holder;
    private double account_balance;

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter account number: ");
        account_number = sc.nextInt();

        System.out.print("Enter account holder name: ");
        account_holder = sc.next();

        System.out.print("Enter account balance: ");
        account_balance = sc.nextDouble();
    }


    // Setter for account number
    public void setNumber(int account_number) {
        this.account_number = account_number;
    }

    // Getter for account number
    public int getNumber() {
        return account_number;
    }

    // Setter for account holder
    public void setHolder(String account_holder) {
        this.account_holder = account_holder;
    }

    // Getter for account holder
    public String getHolder() {
        return account_holder;
    }

    // Setter for account balance
    public void setBalance(double account_balance) {
        this.account_balance = account_balance;
    }

    // Getter for account balance
    public double getBalance() {
        return account_balance;
    }

}

public class BankAcount {

    public static void main(String[] args) {
        // Create object
        Account a1 = new Account();
        a1.input();


        // Display values using getters
        System.out.println("\nAccount Details:");

        System.out.println("Account Number: " + a1.getNumber());
        System.out.println("Account Holder Name: " + a1.getHolder());
        System.out.println("Account Balance: " + a1.getBalance());

    }
}