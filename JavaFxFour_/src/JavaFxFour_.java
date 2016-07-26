import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
		window.setTitle("CheckBox");

		CheckBox box1 = new CheckBox("Bacon");
		CheckBox box2 = new CheckBox("Tuna");
		CheckBox box3 = new CheckBox("Ham");
		CheckBox box4 = new CheckBox("Beef");
		CheckBox box5 = new CheckBox("Chicken");
		CheckBox box6 = new CheckBox("Salmon");
		CheckBox box7 = new CheckBox("Pork");
		CheckBox box8 = new CheckBox("Steak");
		CheckBox box9 = new CheckBox("Mutton");
		CheckBox box10 = new CheckBox("Cod");
		CheckBox box11 = new CheckBox("Halibut");
		CheckBox box12 = new CheckBox("Cheese");
		CheckBox box13 = new CheckBox("Lettuce");
		CheckBox box14 = new CheckBox("Spinach");
		CheckBox box15 = new CheckBox("Celery");
		CheckBox box16 = new CheckBox("Tomato");
		CheckBox box17 = new CheckBox("Mayonaise");
		CheckBox box18 = new CheckBox("Mustard");
		CheckBox box19 = new CheckBox("Guacamole");
		CheckBox box20 = new CheckBox("Relish");

		button = new Button("Order");
		button.setOnAction(e -> handleOptions(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12,
				box13, box14, box15, box16, box17, box18, box19, box20));

		VBox layout =

				new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(button, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12,
				box13, box14, box15, box16, box17, box18, box19, box20);
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5, CheckBox box6,
			CheckBox box7, CheckBox box8, CheckBox box9, CheckBox box10, CheckBox box11, CheckBox box12, CheckBox box13,
			CheckBox box14, CheckBox box15, CheckBox box16, CheckBox box17, CheckBox box18, CheckBox box19,
			CheckBox box20) {
		String message = "User's Order: ";
		if (box1.isSelected()) {
			message += "Bacon";
		}
		if (box2.isSelected()) {
			message += "Tuna";
		}
		if (box3.isSelected()) {
			message += "Ham";
		}
		if (box4.isSelected()) {
			message += "Beef";
		}
		if (box5.isSelected()) {
			message += "Chicken";
		}
		if (box6.isSelected()) {
			message += "Salmon";
		}
		if (box7.isSelected()) {
			message += "Pork";
		}
		if (box8.isSelected()) {
			message += "Steak";
		}
		if (box9.isSelected()) {
			message += "Mutton";
		}
		if (box10.isSelected()) {
			message += "Cod";
		}
		if (box11.isSelected()) {
			message += "Halibut";
		}
		if (box12.isSelected()) {
			message += "Cheese";
		}
		if (box13.isSelected()) {
			message += "Lettuce";
		}
		if (box14.isSelected()) {
			message += "Spinach";
		}
		if (box15.isSelected()) {
			message += "Celery";
		}
		if (box16.isSelected()) {
			message += "Tomato";
		}
		if (box17.isSelected()) {
			message += "Mayonaise";
		}
		if (box18.isSelected()) {
			message += "Mustard";
		}
		if (box19.isSelected()) {
			message += "Guacamole";
		}
		if (box20.isSelected()) {
			message += "Relish";
		}
		System.out.println(message);
	}
}