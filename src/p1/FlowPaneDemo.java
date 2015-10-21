package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        // Set horizontal and vertical gaps between elements
        pane.setHgap(5);
        pane.setVgap(5);

        // First name label and field
        TextField tfFirstName = new TextField();
        pane.getChildren().addAll(new Label("First Name:"), tfFirstName);

        // Middle initial label and field
        TextField tfMI = new TextField();
        // Show only one character is this field
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(new Label("MI:"), tfMI);

        // Last name label and field
        TextField tfLastName = new TextField();
        pane.getChildren().addAll(new Label("Last Name:"), tfLastName);

        // Put the pane in the scene
        Scene scene = new Scene(pane, 300, 100);

        // Set the stage up, put the scene on the stage and show it
        primaryStage.setTitle("Flow Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}