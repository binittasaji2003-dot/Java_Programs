import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

public class Myapp extends Application {

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Enter number 1:");

        TextField num1 = new TextField();

        Label label2 = new Label("Enter number 2:");

        TextField num2 = new TextField();

        Button button = new Button("Add");

        Label result = new Label("Result:");

        button.setOnAction(e -> {

            try {

                double n1 = Double.parseDouble(num1.getText());

                double n2 = Double.parseDouble(num2.getText());

                double sum = n1 + n2;

                result.setText("Sum: " + sum);

            } catch (NumberFormatException ex) {

                result.setText("Error");

            }

        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
            label1,
            num1,
            label2,
            num2,
            button,
            result
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Addition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }
}