package pl.javastart.fxctrl.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainPainController {

    @FXML
    private Label firstLabel;

    @FXML
    private Button firstButton;

    @FXML
    private Label secondLabel;

    @FXML
    private Button secondButton;

    public void initialize() {
        firstLabel.setText("Etykieta 1");
        secondLabel.setText("Etykieta 2");
        firstButton.setText("Przycisk 1");
        secondButton.setText("Przycisk 2");
    }
}
