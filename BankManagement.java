import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
        }
    }

    boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolder() {
        return accountHolder;
    }
}


public class BankManagement extends Application {

    @Override
    public void start(Stage stage) {

        // Labels
        Label accountLabel = new Label("Account Number:");
        Label nameLabel = new Label("Account Holder:");
        Label balanceLabel = new Label("Initial Balance:");
        Label amountLabel = new Label("Amount:");

        // TextFields
        TextField accountField = new TextField();
        TextField nameField = new TextField();
        TextField balanceField = new TextField();
        TextField amountField = new TextField();

        // Buttons
        Button createButton = new Button("Create Account");
        Button depositButton = new Button("Deposit");
        Button withdrawButton = new Button("Withdraw");
        Button checkButton = new Button("Check Balance");
        Button clearButton = new Button("Clear");

        // Result
        Label resultLabel = new Label();

        // Store account
        final BankAccount[] account = new BankAccount[1];

        // Create Account
        createButton.setOnAction(e -> {

            try {

                String accountNumber = accountField.getText();
                String name = nameField.getText();

                if (accountNumber.isEmpty() ||
                    name.isEmpty() ||
                    balanceField.getText().isEmpty()) {

                    resultLabel.setText("Please fill all fields.");
                    return;
                }

                double balance =
                    Double.parseDouble(balanceField.getText());

                if (balance < 0) {
                    resultLabel.setText("Balance cannot be negative.");
                    return;
                }

                account[0] =
                    new BankAccount(accountNumber, name, balance);

                resultLabel.setText(
                    "Account created successfully!"
                );

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                    "Enter a valid balance."
                );
            }
        });


        // Deposit
        depositButton.setOnAction(e -> {

            try {

                if (account[0] == null) {
                    resultLabel.setText(
                        "Create an account first."
                    );
                    return;
                }

                double amount =
                    Double.parseDouble(amountField.getText());

                if (amount <= 0) {
                    resultLabel.setText(
                        "Amount must be greater than 0."
                    );
                    return;
                }

                account[0].deposit(amount);

                resultLabel.setText(
                    "Deposit successful.\n" +
                    "Current Balance: ₹" +
                    account[0].getBalance()
                );

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                    "Enter a valid amount."
                );
            }
        });


        // Withdraw
        withdrawButton.setOnAction(e -> {

            try {

                if (account[0] == null) {
                    resultLabel.setText(
                        "Create an account first."
                    );
                    return;
                }

                double amount =
                    Double.parseDouble(amountField.getText());

                if (amount <= 0) {
                    resultLabel.setText(
                        "Amount must be greater than 0."
                    );
                    return;
                }

                boolean success =
                    account[0].withdraw(amount);

                if (success) {

                    resultLabel.setText(
                        "Withdrawal successful.\n" +
                        "Current Balance: ₹" +
                        account[0].getBalance()
                    );

                }
                else {

                    resultLabel.setText(
                        "Insufficient balance."
                    );
                }

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                    "Enter a valid amount."
                );
            }
        });


        // Check Balance
        checkButton.setOnAction(e -> {

            if (account[0] == null) {

                resultLabel.setText(
                    "Create an account first."
                );

            }
            else {

                resultLabel.setText(
                    "Account Holder: " +
                    account[0].getAccountHolder() +
                    "\nAccount Number: " +
                    account[0].getAccountNumber() +
                    "\nCurrent Balance: ₹" +
                    account[0].getBalance()
                );
            }
        });


        // Clear
        clearButton.setOnAction(e -> {

            accountField.clear();
            nameField.clear();
            balanceField.clear();
            amountField.clear();

            resultLabel.setText("");

            account[0] = null;
        });


        // GridPane
        GridPane grid = new GridPane();

        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(accountLabel, 0, 0);
        grid.add(accountField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(balanceLabel, 0, 2);
        grid.add(balanceField, 1, 2);

        grid.add(amountLabel, 0, 3);
        grid.add(amountField, 1, 3);

        grid.add(createButton, 0, 4);

        grid.add(depositButton, 0, 5);
        grid.add(withdrawButton, 1, 5);

        grid.add(checkButton, 0, 6);
        grid.add(clearButton, 1, 6);

        grid.add(resultLabel, 0, 7, 2, 1);


        Scene scene = new Scene(grid, 500, 450);

        stage.setTitle("Bank Account Management");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}