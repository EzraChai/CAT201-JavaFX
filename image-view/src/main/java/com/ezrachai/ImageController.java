package com.ezrachai;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {

    @FXML
    ImageView imageView;
    Button myButton;

    Image myImage1 = new Image(getClass().getResourceAsStream("truck.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("truck2.png"));

    public void displayImage() {
        if (imageView.getImage() == myImage1) {
            imageView.setImage(myImage2);
        } else {
            imageView.setImage(myImage1);
        }
    }
}
