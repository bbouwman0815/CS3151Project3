package edu.westga.cs3151.animalgame;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class AnimalGameApplication extends Application {
	
	private static final String GUI_FXML = "view/AnimalGame.fxml";
	private static final String GUI_TITLE = "Brian's Animal Game";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource(GUI_FXML));
			Pane pane = (Pane) loader.load();
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle(GUI_TITLE);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
