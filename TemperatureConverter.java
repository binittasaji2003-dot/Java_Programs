import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

    @Override
    public void start(Stage stage) {

        Label tempLabel = new Label("Temperature:");

        TextField tempField = new TextField();

        ComboBox<String> choice = new ComboBox<>();

        choice.getItems().addAll(
            "Celsius to Fahrenheit",
            "Fahrenheit to Celsius"
        );

        Button convertButton = new Button("Convert");

        Label resultLabel = new Label();

        convertButton.setOnAction(e -> {

            try {

                double temp =
                    Double.parseDouble(tempField.getText());

                String selected = choice.getValue();

                if (selected == null) {
                    resultLabel.setText(
                        "Select a conversion type"
                    );
                    return;
                }

                double result;

                if (selected.equals("Celsius to Fahrenheit")) {

                    result = (temp * 9 / 5) + 32;

                    resultLabel.setText(
                        "Fahrenheit: " + result
                    );

                }
                else {

                    result = (temp - 32) * 5 / 9;

                    resultLabel.setText(
                        "Celsius: " + result
                    );
                }

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                    "Enter a valid temperature"
                );
            }
        });

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(tempLabel, 0, 0);
        grid.add(tempField, 1, 0);

        grid.add(new Label("Conversion:"), 0, 1);
        grid.add(choice, 1, 1);

        grid.add(convertButton, 0, 2);
        grid.add(resultLabel, 1, 2);

        Scene scene = new Scene(grid, 450, 250);

        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}