import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxFour_ extends Application {
	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Dropdown list");

		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("A");
		choiceBox.getItems().add("B");
		choiceBox.getItems().add("C");
		choiceBox.getItems().add("D");
		choiceBox.getItems().add("E");
		choiceBox.getItems().add("F");
		choiceBox.getItems().add("G");
		choiceBox.getItems().add("H");
		choiceBox.getItems().add("I");
		choiceBox.getItems().add("J");
		choiceBox.getItems().add("K");
		choiceBox.getItems().add("L");
		choiceBox.getItems().add("M");
		choiceBox.getItems().add("N");
		choiceBox.getItems().add("O");
		choiceBox.getItems().add("P");
		choiceBox.getItems().add("Q");
		choiceBox.getItems().add("R");
		choiceBox.getItems().add("S");
		choiceBox.getItems().add("T");
		choiceBox.getItems().add("U");
		choiceBox.getItems().add("V");
		choiceBox.getItems().add("W");
		choiceBox.getItems().add("X");
		choiceBox.getItems().add("Y");
		choiceBox.getItems().add("Z");
		choiceBox.getItems().add("a");
		choiceBox.getItems().add("b");
		choiceBox.getItems().add("c");
		choiceBox.getItems().add("d");
		choiceBox.getItems().add("e");
		choiceBox.getItems().add("f");
		choiceBox.getItems().add("g");
		choiceBox.getItems().add("h");
		choiceBox.getItems().add("i");
		choiceBox.getItems().add("j");
		choiceBox.getItems().add("k");
		choiceBox.getItems().add("l");
		choiceBox.getItems().add("m");
		choiceBox.getItems().add("n");
		choiceBox.getItems().add("o");
		choiceBox.getItems().add("p");
		choiceBox.getItems().add("q");
		choiceBox.getItems().add("r");
		choiceBox.getItems().add("s");
		choiceBox.getItems().add("t");
		choiceBox.getItems().add("u");
		choiceBox.getItems().add("v");
		choiceBox.getItems().add("w");
		choiceBox.getItems().add("x");
		choiceBox.getItems().add("y");
		choiceBox.getItems().add("z");
		choiceBox.getItems().add(" ");

		choiceBox.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> System.out.print(newValue));

		VBox layout = new VBox(10);

		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().add(choiceBox);
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

}