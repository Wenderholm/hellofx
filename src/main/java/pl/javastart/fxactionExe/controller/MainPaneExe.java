package pl.javastart.fxactionExe.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneExe {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    @FXML
    private Button clearButton;

    public void initialize() {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> outputTextArea
                .setText(new StringBuilder(inputTextArea.getText()).reverse()
                        .toString()));

        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> inputTextArea
                .setText(new StringBuilder(outputTextArea.getText()).reverse()
                        .toString()));

        clearButton.setOnAction(event ->{
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }

}