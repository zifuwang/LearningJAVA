
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxCSS extends Application {
	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title");

		Person me = new Person();
		me.firstNameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Name changed to" + newValue);
		});

		StackPane layout = new StackPane();
		layout.setPadding(new Insets(10, 10, 10, 10));

		button = new Button("Submit");
		button.setOnAction(e -> me.setFirstName("akxfjsldkjfdldkjf"));
		layout.getChildren().addAll(button);
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
}