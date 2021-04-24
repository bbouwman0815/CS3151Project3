package edu.westga.cs3151.animalgame.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AnimalGameCodeBehind {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Button startButton;
    
    public AnimalGameCodeBehind() {
    	
    }
    
    @FXML
    void handleStartGame(ActionEvent event) throws IOException {
    	WindowGenerator.setupPlayGame();
    }

}