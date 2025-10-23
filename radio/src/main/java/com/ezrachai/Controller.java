package com.ezrachai;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Label myLabelDate;
    @FXML
    private Label myLabelFood;

    @FXML
    private Pane myPane;

    @FXML
    private RadioButton myRadio1;
    @FXML
    private RadioButton myRadio2;
    @FXML
    private RadioButton myRadio3;

    @FXML
    private DatePicker myDatePicker;

    @FXML
    private ColorPicker myColorPicker;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] food = { "Pizza", "Sushi", "Ramen" };

    public void getFood(ActionEvent event) {
        if (myRadio1.isSelected()) {
            myLabel.setText(myRadio1.getText());
        } else if (myRadio2.isSelected()) {
            myLabel.setText(myRadio2.getText());
        } else if (myRadio3.isSelected()) {
            myLabel.setText(myRadio3.getText());
        }
    }

    public void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd MMM YYYY"));
        myLabelDate.setText(myFormattedDate.toString());
    }

    public void changeBackgroundColor(ActionEvent event) {
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::selectFood);
    }

    public void selectFood(ActionEvent event) {
        String myFood = myChoiceBox.getValue();
        myLabelFood.setText(myFood);
    }

}
