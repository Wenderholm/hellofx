package pl.javastart.fxproperties.controller;

import javafx.beans.binding.StringBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumeController {

    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    public void initialize() {
        StringBinding volumeSliderBinding = volumeSlider.valueProperty().asString();
        volumeLevelLabel.textProperty().bind(volumeSliderBinding);

//        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                double volume=(Double) newValue;
//                if(volume > 75){
//                    System.out.println("za głośno !!!");
//                }else if (volume < 10){
//                    System.out.println("Nic nie slychać");
//                }
//            }
//        });

        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double volume=(Double) newValue;
            if(volume > 75){
                System.out.println("za głośno !!!");
            }else if (volume < 10){
                System.out.println("Nic nie slychać");
            }
        });
    }
}
