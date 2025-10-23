package com.ezrachai;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PopupController implements Initializable {
    @FXML
    private TextField todo;

    @FXML
    private TextArea description;

    @FXML
    private ComboBox<String> priority;

    private String[] priorityItems = { "Urgent", "High", "Normal", "Low" };

    @FXML
    private ComboBox<String> category;

    private String[] categoryItems = { "Study", "Personal", "Personal", "Family" };

    @FXML
    private DatePicker dueDate;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        priority.getItems().addAll(priorityItems);
        category.getItems().addAll(categoryItems);
    }

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void addTodo() {
        TodoItem newTodoItem = new TodoItem(0, todo.getText().trim(), description.getText().trim(), category.getValue(),
                priority.getValue(), dueDate.getValue());
        mainController.addTodo(newTodoItem);
        Stage stage = (Stage) todo.getScene().getWindow();
        stage.close();
    }

}
