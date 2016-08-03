
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFxCSS extends Application {
	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(8);

		Label nameLabel = new Label("UserName:");
		grid.setConstraints(nameLabel, 0, 0);
		nameLabel.setId("bold-label");

		TextField nameInput = new TextField("User");
		grid.setConstraints(nameInput, 1, 0);

		Label passwordLabel = new Label("Password:");
		grid.setConstraints(passwordLabel, 0, 1);

		TextField passwordInput = new TextField();
		passwordInput.setPromptText("password");
		grid.setConstraints(passwordInput, 1, 1);

		Button LogInButton = new Button("Log in");
		grid.setConstraints(LogInButton, 1, 2);

		Button SignInButton = new Button("Sign in");
		SignInButton.getStyleClass().add("button-rainbow");
		grid.setConstraints(SignInButton, 1, 3);

		grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, LogInButton, SignInButton);

		Scene scene = new Scene(grid, 300, 200);
		scene.getStylesheets().add("file:///C:/Users/gaofj/workspace/zifu/JavaFxCSS/src/viper.css");
		// scene.getStylesheets().add(getClass().getResource("viper.css").toExternalForm());

		window.setScene(scene);
		window.show();
	}
}