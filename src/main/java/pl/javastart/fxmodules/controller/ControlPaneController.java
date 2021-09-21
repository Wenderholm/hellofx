package pl.javastart.fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlPaneController {

    @FXML
    private Button upperCaseLetter;

    @FXML
    private Button lowerCaseLetter;

    public Button getUpperCaseLetter() {
        return upperCaseLetter;
    }

    public Button getLowerCaseLetter() {
        return lowerCaseLetter;
    }
    public void initialize() {
        System.out.println("ContentPaneController created");
    }
}
