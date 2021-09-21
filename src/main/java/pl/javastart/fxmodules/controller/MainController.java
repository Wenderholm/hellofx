package pl.javastart.fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Locale;

public class MainController {
    @FXML
    private ControlPaneController controlPaneController;
    @FXML
    private ContentPaneController contentPaneController;

    public void initialize() {
//        System.out.println(contentPaneController);
//        System.out.println(controlPaneController);
        Button lowerCaseLetter = controlPaneController.getLowerCaseLetter();
        Button upperCaseLetter = controlPaneController.getUpperCaseLetter();
        TextArea mainTextArea = contentPaneController.getMainTextArea();

        lowerCaseLetter.setOnAction(x -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
        upperCaseLetter.setOnAction(x -> mainTextArea.setText(mainTextArea.getText().toUpperCase()));
    }
}
