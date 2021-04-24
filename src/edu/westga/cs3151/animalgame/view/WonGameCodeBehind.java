package edu.westga.cs3151.animalgame.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class WonGameCodeBehind {

    @FXML
    private TextField enterAnimalTextField;

    @FXML
    private TextField enterQuestionTextField;

    @FXML
    private ToggleGroup yesNo;

    @FXML
    private Button submitButton;
    
    WonGameCodeBehind(){
    	
    }

    @FXML
    void handleSubmitButton(ActionEvent event) {

    }

}
