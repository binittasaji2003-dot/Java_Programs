import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class srf extends Application{
	
	@Override
	public void start(Stage stage){
	
	Label label1 = new Label("Enter student name: ");
	TextField name = new TextField();
	
	Label label2 = new Label("Mark1: ");
	TextField mark1 = new TextField();

	Label label3 = new Label("Mark2: ");
	TextField mark2 = new TextField();
	
	Label label4 = new Label("Mark3: ");
	TextField mark3 = new TextField();

	Label gender = new Label("Gender: ");
	RadioButton male = new RadioButton("Male");
	RadioButton female = new RadioButton("Female");

	ToggleGroup gen = new ToggleGroup();
	male.setToggleGroup(gen);
	female.setToggleGroup(gen);	

	Button button = new Button("Calculate");

	Label result = new Label();

	button.setOnAction(e -> {
		double m1 = Double.parseDouble(mark1.getText());
		double m2 = Double.parseDouble(mark2.getText());
		double m3= Double.parseDouble(mark3.getText());

		double total = m1 + m2 + m3;
		double average = total/3;

		String r = "";
		if(average >=50){
			r = "pass";
		} else if (average >=80){
			r = "Excellent";

		}else if (average >=60 && average <=79){
			r = "Good";
		} else {
			r = "Fail";
			}

		String g = "";
		if(male.isSelected()){
			g = "male";

		} else if (female.isSelected()){
			g = "female";
		}

		result.setText(
			"Name: " + name.getText() +
			"\ngender:" + g +
			"\nTotal: " + total +
			"\nAverage: " + average +
			"\nResult: " + r
		);

	});


	GridPane root = new GridPane();
	root.setHgap(10);
	root.setVgap(10);
	root.add(label1,0, 0);
	root.add(name, 1, 0);
	root.add(label2, 0,1);
	root.add(mark1, 1, 1);
	root.add(label3, 0,2);
	root.add(mark2, 1,2);
	root.add(label4, 0, 3);
	root.add(mark3, 1,3);
	root.add(gender, 0, 4);
	root.add(male, 0,5);
	root.add(female, 0, 6);
	root.add(button,2,7);
	root.add(result, 0, 8);

	Scene scene = new Scene(root, 800, 700);
	stage.setTitle("Student registration form");
	stage.setScene(scene);
	stage.show();


	}




	public static void main(String[] args){
		launch(args);
	}


}
