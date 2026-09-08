import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentResult extends Application {

    @Override
    public void start(Stage stage) {

        // Labels
        Label nameLabel = new Label("Student Name:");
        Label rollLabel = new Label("Roll Number:");
        Label mark1Label = new Label("Subject 1:");
        Label mark2Label = new Label("Subject 2:");
        Label mark3Label = new Label("Subject 3:");
        Label mark4Label = new Label("Subject 4:");
        Label mark5Label = new Label("Subject 5:");

        // TextFields
        TextField nameField = new TextField();
        TextField rollField = new TextField();
        TextField mark1Field = new TextField();
        TextField mark2Field = new TextField();
        TextField mark3Field = new TextField();
        TextField mark4Field = new TextField();
        TextField mark5Field = new TextField();

        // Buttons
        Button calculateButton = new Button("Calculate Result");
        Button clearButton = new Button("Clear");

        // Result label
        Label resultLabel = new Label();

        // Calculate button
        calculateButton.setOnAction(e -> {

            try {

                String name = nameField.getText();
                String roll = rollField.getText();

                if (name.isEmpty() || roll.isEmpty() ||
                    mark1Field.getText().isEmpty() ||
                    mark2Field.getText().isEmpty() ||
                    mark3Field.getText().isEmpty() ||
                    mark4Field.getText().isEmpty() ||
                    mark5Field.getText().isEmpty()) {

                    resultLabel.setText("Please fill all fields.");
                    return;
                }

                int mark1 = Integer.parseInt(mark1Field.getText());
                int mark2 = Integer.parseInt(mark2Field.getText());
                int mark3 = Integer.parseInt(mark3Field.getText());
                int mark4 = Integer.parseInt(mark4Field.getText());
                int mark5 = Integer.parseInt(mark5Field.getText());

                if (mark1 < 0 || mark1 > 100 ||
                    mark2 < 0 || mark2 > 100 ||
                    mark3 < 0 || mark3 > 100 ||
                    mark4 < 0 || mark4 > 100 ||
                    mark5 < 0 || mark5 > 100) {

                    resultLabel.setText("Marks must be between 0 and 100.");
                    return;
                }

                int total = mark1 + mark2 + mark3 + mark4 + mark5;
                double average = total / 5.0;

                String grade;

                if (average >= 90) {
                    grade = "A+";
                }
                else if (average >= 80) {
                    grade = "A";
                }
                else if (average >= 70) {
                    grade = "B";
                }
                else if (average >= 60) {
                    grade = "C";
                }
                else if (average >= 50) {
                    grade = "D";
                }
                else {
                    grade = "F";
                }

                resultLabel.setText(
                    "Student Name: " + name +
                    "\nRoll Number: " + roll +
                    "\nTotal: " + total +
                    "\nAverage: " + average +
                    "\nGrade: " + grade
                );

            }
            catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        // Clear button
        clearButton.setOnAction(e -> {

            nameField.clear();
            rollField.clear();
            mark1Field.clear();
            mark2Field.clear();
            mark3Field.clear();
            mark4Field.clear();
            mark5Field.clear();

            resultLabel.setText("");
        });

        // GridPane
        GridPane grid = new GridPane();

        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(rollLabel, 0, 1);
        grid.add(rollField, 1, 1);

        grid.add(mark1Label, 0, 2);
        grid.add(mark1Field, 1, 2);

        grid.add(mark2Label, 0, 3);
        grid.add(mark2Field, 1, 3);

        grid.add(mark3Label, 0, 4);
        grid.add(mark3Field, 1, 4);

        grid.add(mark4Label, 0, 5);
        grid.add(mark4Field, 1, 5);

        grid.add(mark5Label, 0, 6);
        grid.add(mark5Field, 1, 6);

        grid.add(calculateButton, 0, 7);
        grid.add(clearButton, 1, 7);

        grid.add(resultLabel, 0, 8, 2, 1);

        Scene scene = new Scene(grid, 450, 500);

        stage.setTitle("Student Result Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}