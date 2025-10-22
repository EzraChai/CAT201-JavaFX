package com.ezrachai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label myLabel;

    @FXML
    ImageView imageView;

    Image imageOn = new Image(getClass().getResourceAsStream("on.png"));
    Image imageOff = new Image(getClass().getResourceAsStream("off.png"));

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            imageView.setImage(imageOn);
            myLabel.setText("On");
        } else {
            imageView.setImage(imageOff);
            myLabel.setText("Off");
        }
    }
}
