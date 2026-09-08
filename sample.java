import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class sample extends Application{

	@Override
	public void start(Stage stage){

	Label label1 = new Label("Enter username: " );
	TextField username = new TextField();

	Label label2 = new Label("Enter password: ");
	PasswordField password = new PasswordField();
	
	Label label3 = new Label("Remember me: ");
	CheckBox rem = new CheckBox("Remember Me:");

	Label label4 = new Label("Gender");
	RadioButton male = new RadioButton("male");
	RadioButton female = new RadioButton("female");

	Button button = new Button("Submit");

	Label result = new Label();
	
	button.setOnAction( e -> {

		String g = "";
		if(male.isSelected()){
			g = "male";
		}else if (female.isSelected()){
			g = "female";
		}

		Boolean re = rem.isSelected();
		
	
		result.setText(
			"Name: " + username.getText() + 
			"\n Gender: " + g + 
			"\n Remember me: " + re

	);
			


	});


	VBox root = new VBox(10);
	root.getChildren().addAll(
			label1,
			username,
			label2,
			password,
			label3,
			rem,
			label4,
			male,
			female,
			button,
			result
			
			
		);

	

	Scene scene = new Scene(root, 500, 600);
	stage.setTitle("Information");
	stage.setScene(scene);
	stage.show();
	}







	public static void main(String[] args){
	
		launch(args);
	}

}
