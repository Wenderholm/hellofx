package pl.javastart.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPaneActionController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize(){
//        lowerCaseButton.setOnAction(actionEvent -> {
//            System.out.println("wcisnięto przycisk");
//            System.out.println(actionEvent.getEventType());
//            String originalText = mainTextArea.getText();
//            String lowerText = originalText.toLowerCase();
//            mainTextArea.setText(lowerText);
//        });

//        powyższe mozna zapisac inaczej za pomocą addEventFilter:
//        lowerCaseButton.addEventFilter(ActionEvent.ACTION, actionEvent -> {
//            System.out.println("wcisnięto przycisk");
//            System.out.println(actionEvent.getEventType());
//            String originalText = mainTextArea.getText();
//            String lowerText = originalText.toLowerCase();
//            mainTextArea.setText(lowerText);
//        });
//        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> System.out.println("wcisnięto klawisz: " + keyEvent.getCharacter()));

//        powyższy zapis możemy przenieść do osobnej metody poza initialize trzeba pamiętać o dodaniu do pliku
//        mainPaneAction do buttona onAction="#toLowerCaseAction"
    }
    public void toLowerCaseAction(ActionEvent event){
        System.out.println("wcisnięto przycisk");
        System.out.println(event.getEventType());
        String originalText = mainTextArea.getText();
        String lowerText = originalText.toLowerCase();
        mainTextArea.setText(lowerText);
    }
}
