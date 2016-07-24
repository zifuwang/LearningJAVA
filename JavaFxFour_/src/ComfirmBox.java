import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ComfirmBox {
	
	static boolean answer;
	public static boolean display(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label1 = new Label();
		label1.setText(message);
		
		Button YesButton = new Button("Yes");
		Button NoButton = new Button("No");
		
		YesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		NoButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		VBox layout1 = new VBox(10);
		layout1.getChildren().addAll(label1, YesButton, NoButton);
		layout1.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout1);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	}
}

