package pl.javastart.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainHelloFx extends Application {
    public MainHelloFx(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main");
        launch();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");
        stage.setTitle("hello fx");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }
}
