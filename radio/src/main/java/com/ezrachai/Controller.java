package com.ezrachai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private Label myLabelDate;

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
}
