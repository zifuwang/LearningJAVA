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


public class JavaFxFour_ extends Application {
	Stage window;
	Button button1;
	
public static void main(String[] args){
		launch(args);
	}
	
	@Override 
public void start(Stage primaryStage){
	window = primaryStage;
	window.setTitle("Title");
	window.setOnCloseRequest(e -> {
		e.consume();
		closeProgram();	
	});
	
	button1 = new Button("Close new window");
	button1.setOnAction(e -> closeProgram());
	
	StackPane layout1 = new StackPane();
	layout1.getChildren().add(button1);
	Scene scene1 = new Scene(layout1, 300, 250);
	
	window.setScene(scene1);
	window.show();
	}

private void closeProgram(){
	boolean answer = ComfirmBox.display("Alert!", "Are you sure you want to close this window?");
	if(answer)
		window.close();
	
	}
}



