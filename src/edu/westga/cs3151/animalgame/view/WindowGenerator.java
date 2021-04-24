package edu.westga.cs3151.animalgame.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowGenerator {
	
	private static final String PLAYGAME_TITLE = "Animal Game By Brian";
	private static final String PLAYGAME_FXML = "PlayGame.fxml";
	
	private static final String WONGAME_TITLE = "Animal Game By Brian";
	private static final String WONGAME_FXML = "WonGame.fxml";
	
	/**
	 * Sets up the Scene by using the window root and scene title
	 * 
	 * @param addWindowRoot the window root to set the scene to
	 * @param sceneTitle    the title of the new scene
	 * @precondition none
	 * @postcondition the new scene is shown
	 */
	public static void setupScene(Parent addWindowRoot, String sceneTitle) {
		try {
			Stage addStage = new Stage();
			Scene scene = new Scene(addWindowRoot);
			addStage.setScene(scene);
			addStage.setTitle(sceneTitle);
			addStage.setResizable(false);
			addStage.show();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
	
	public static void setupPlayGame() throws IOException {
		PlayGameCodeBehind voterEducationCodeBehind = new PlayGameCodeBehind();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(voterEducationCodeBehind.getClass().getResource(PLAYGAME_FXML));
		WindowGenerator.setupScene((Parent) loader.load(), PLAYGAME_TITLE);
	}
}
