import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class st extends Application {

    @Override
    public void start(Stage stage) {

        // Name
        Label label1 = new Label("Name:");
        TextField name = new TextField();

        // Email
        Label label2 = new Label("Email:");
        TextField email = new TextField();

        // Password
        Label label3 = new Label("Password:");
        PasswordField password = new PasswordField();

        // Gender
        Label label4 = new Label("Gender:");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();

        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        // Course
        Label label5 = new Label("Course:");

        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");
        CheckBox web = new CheckBox("Web Development");

        // Buttons
        Button register = new Button("Register");
        Button clear = new Button("Clear");

        // Result Label
        Label result = new Label();

        // Register button
        register.setOnAction(e -> {

            String gender = "";

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }

            String courses = "";

            if (java.isSelected()) {
                courses = courses + "Java ";
            }

            if (python.isSelected()) {
                courses = courses + "Python ";
            }

            if (web.isSelected()) {
                courses = courses + "Web Development";
            }

            result.setText(
                "Name: " + name.getText() +
                "\nEmail: " + email.getText() +
                "\nPassword: " + password.getText() +
                "\nGender: " + gender +
                "\nCourse: " + courses
            );
        });

        // Clear button
        clear.setOnAction(e -> {

            name.clear();
            email.clear();
            password.clear();

            genderGroup.selectToggle(null);

            java.setSelected(false);
            python.setSelected(false);
            web.setSelected(false);

            result.setText("");
        });

        // GridPane
        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);

        // Add controls to GridPane
        grid.add(label1, 0, 0);
        grid.add(name, 1, 0);

        grid.add(label2, 0, 1);
        grid.add(email, 1, 1);

        grid.add(label3, 0, 2);
        grid.add(password, 1, 2);

        grid.add(label4, 0, 3);
        grid.add(male, 1, 3);
        grid.add(female, 2, 3);

        grid.add(label5, 0, 4);
        grid.add(java, 1, 4);
        grid.add(python, 2, 4);
        grid.add(web, 3, 4);

        grid.add(register, 1, 5);
        grid.add(clear, 2, 5);

        grid.add(result, 0, 6, 4, 1);

        // Scene
        Scene scene = new Scene(grid, 600, 400);

        stage.setTitle("Student Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}