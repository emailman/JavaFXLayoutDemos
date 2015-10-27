package p5;

/*
 * Created by emailman on 10/22/2015.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        pane.setLeft(getVBox1());
        pane.setRight(getVBox2());

        Button btnCenter = new Button();
        btnCenter.setPrefSize(100, 80);
        pane.setCenter(btnCenter);

        Scene scene = new Scene(pane, 400, 100);
        primaryStage.setTitle("Border and Vbox Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox getVBox1() {
        VBox vBox = new VBox(10);
        vBox.setPadding((new Insets(10, 10, 10, 10)));

        Button btnRed = new Button("RED");
        btnRed.setPrefWidth(100);

        Button btnYellow = new Button("YELLOW");
        btnYellow.setPrefWidth(100);

        Button btnGreen = new Button("GREEN");
        btnGreen.setPrefWidth(100);

        vBox.getChildren().addAll(btnRed, btnYellow, btnGreen);
        return vBox;
    }

    private VBox getVBox2() {
        VBox vBox = new VBox(10);
        vBox.setPadding((new Insets(10, 10, 10, 10)));

        Button btnBlink = new Button("BLINK");
        btnBlink.setPrefWidth(100);

        Button btnAllOff = new Button("ALL OFF");
        btnAllOff.setPrefWidth(100);

        vBox.getChildren().addAll(btnBlink, btnAllOff);
        return vBox;
    }
}
