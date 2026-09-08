import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class qp extends Application{

	@Override 
	public void start(Stage stage){
	
	Label label1 = new Label("Enter Name");
	TextField name = new TextField();

	Label label2 = new Label("Age");
	TextField age = new TextField();

	Button button = new Button("Submit");
	
	Label result = new Label();

	button.setOnAction(e -> {

		result.setText(
			"Name: " + name.getText() +
			"\nAge: " + age.getText() 
		);

	});

	GridPane root = new GridPane();
	root.setVgap(10);
	root.setHgap(10);

	root.add(label1, 0, 0);
	root.add(name, 1, 0);
	root.add(label2, 0, 1);
	root.add(age, 1, 1);
	root.add(button, 1, 2);

	root.add(result, 1, 3);


	

	
	Scene scene = new Scene(root, 600, 700);
	stage.setTitle("Information");
	stage.setScene(scene);
	stage.show();

	}
	public static void main(String[] args){
		launch(args);

	}


}