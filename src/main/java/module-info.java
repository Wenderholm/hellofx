module hellofx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.hellofx to javafx.graphics;
    exports pl.javastart.fxctrl.main to javafx.graphics;
    exports pl.javastart.fxaction.main to javafx.graphics;
    exports pl.javastart.fxactionExe.main to javafx.graphics;

    opens pl.javastart.fxctrl.controller to javafx.fxml;
    opens pl.javastart.fxaction.controller to javafx.fxml;
    opens pl.javastart.fxactionExe.controller to javafx.fxml;
}