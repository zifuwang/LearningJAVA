import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxFour_ extends Application {
	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title");

		HBox topMenu = new HBox();

		Button button1 = new Button("File");
		Button button2 = new Button("Edit");
		Button button3 = new Button("Source");

		topMenu.getChildren().addAll(button1, button2, button3);

		VBox leftMenu = new VBox();

		Button button4 = new Button("Refactor");
		Button button5 = new Button("Navigate");
		Button button6 = new Button("Search");

		leftMenu.getChildren().addAll(button4, button5, button6);

		VBox rightMenu = new VBox();

		Button button7 = new Button("Project");
		Button button8 = new Button("Git");
		Button button9 = new Button("Run");

		rightMenu.getChildren().addAll(button7, button8, button9);

		HBox bottomMenu = new HBox();

		Button button10 = new Button("JML");
		Button button11 = new Button("Window");
		Button button12 = new Button("Help");

		bottomMenu.getChildren().addAll(button10, button11, button12);

		Label centerMenu = new Label("Text");

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setRight(rightMenu);
		borderPane.setLeft(leftMenu);
		borderPane.setBottom(bottomMenu);
		borderPane.setCenter(centerMenu);

		Scene scene1 = new Scene(borderPane, 300, 250);

		window.setScene(scene1);
		window.show();
	}
}