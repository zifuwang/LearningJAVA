
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxFour_ extends Application {
	Stage window;
	Scene scene;
	Button button;
	ListView<String> listView;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ListView");
		button = new Button("Submit");
		listView = new ListView<>();
		listView.getItems().addAll("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Purple");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(button);
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
}