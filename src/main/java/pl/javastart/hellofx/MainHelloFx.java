package pl.javastart.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainHelloFx extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Button button = new Button("kliknij na mnie ");
//        AnchorPane mainPane = new AnchorPane();
//        mainPane.getChildren().add(button);
//        Scene scene = new Scene(mainPane);
//        stage.setScene(scene);
//        stage.show();

//        TO CO WYŻEJ ALE PRZEY POMOCY SCENE BUILDER
        AnchorPane mainPane = FXMLLoader.load(getClass().getResource("/helloView.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
    }
}
