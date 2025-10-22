package com.ezrachai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;

public class Controller {
    @FXML
    private Button myButton;

    @FXML
    private TextField myTextField;

    @FXML
    private Label myLabel;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());

            if (age >= 18) {
                myLabel.setText("You are now sign up.");
            } else {
                myLabel.setText("You must be 18 years old or older.");
            }
        } catch (NumberFormatException e) {
            myLabel.setText("Enter only number.");
        }

    }
}
