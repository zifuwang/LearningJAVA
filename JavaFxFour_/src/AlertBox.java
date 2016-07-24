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

public class AlertBox {
	public static void display(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label1 = new Label();
		label1.setText(message);
		Button closeButton = new Button("Close this window");
		closeButton.setOnAction(e -> window.close());
		VBox layout1 = new VBox(10);
		layout1.getChildren().addAll(label1, closeButton);
		layout1.setAlignment(Pos.CENTER);

		//GIT comparison testing
		Scene scene = new Scene(layout1);
		window.setScene(scene);
		window.showAndWait();
		
		
		}
	}
