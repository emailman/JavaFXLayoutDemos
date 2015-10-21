package p2;
 
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		// Set horizontal and vertical gaps between elements
		pane.setHgap(5);
		pane.setVgap(5);
		
		// First name label and field
		TextField tfFirstName = new TextField();
		pane.add(new Label("First Name"), 0, 0);
		pane.add(tfFirstName, 1, 0);
		
		// Middle initial label and field
		TextField tfMI = new TextField();
		pane.add(new Label("MI:"), 0, 1);		
		pane.add(tfMI, 1, 1);
				
		// Last name label and field
		TextField tfLastName = new TextField();
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(tfLastName, 1, 2);
		
		// Put a button on the bottom right of the pane
		Button btAdd = new Button("Add Name");
		pane.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		
		// Put the pane in the scene (autofit)
		Scene scene = new Scene(pane);
		
		// Set the stage up, put the scene on the stage and show it
		primaryStage.setTitle("Flow Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}




