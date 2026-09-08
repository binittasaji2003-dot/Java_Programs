import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) {

        Label num1Label = new Label("Number 1:");
        Label num2Label = new Label("Number 2:");
        Label resultLabel = new Label("Result:");

        TextField num1Field = new TextField();
        TextField num2Field = new TextField();

        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button mulButton = new Button("*");
        Button divButton = new Button("/");

        Label output = new Label();

        addButton.setOnAction(e -> calculate("+", num1Field, num2Field, output));
        subButton.setOnAction(e -> calculate("-", num1Field, num2Field, output));
        mulButton.setOnAction(e -> calculate("*", num1Field, num2Field, output));
        divButton.setOnAction(e -> calculate("/", num1Field, num2Field, output));

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(num1Label, 0, 0);
        grid.add(num1Field, 1, 0);

        grid.add(num2Label, 0, 1);
        grid.add(num2Field, 1, 1);

        grid.add(addButton, 0, 2);
        grid.add(subButton, 1, 2);
        grid.add(mulButton, 0, 3);
        grid.add(divButton, 1, 3);

        grid.add(resultLabel, 0, 4);
        grid.add(output, 1, 4);

        Scene scene = new Scene(grid, 350, 250);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    void calculate(String operator,
                   TextField num1Field,
                   TextField num2Field,
                   Label output) {

        try {

            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            double result = 0;

            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":

                    if (num2 == 0) {
                        output.setText("Cannot divide by zero");
                        return;
                    }

                    result = num1 / num2;
                    break;
            }

            output.setText(String.valueOf(result));

        }
        catch (NumberFormatException ex) {
            output.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}