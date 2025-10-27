package com.ezrachai;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {

    @FXML
    private TableView<TodoItem> todoListTableView;
    @FXML
    private TableColumn<TodoItem, String> todoColumn;
    @FXML
    private TableColumn<TodoItem, String> descColumn;
    @FXML
    private TableColumn<TodoItem, String> categoryColumn;
    @FXML
    private TableColumn<TodoItem, String> priorityColumn;
    @FXML
    private TableColumn<TodoItem, LocalDate> dueDateColumn;

    @FXML
    private TextField searchTextField;

    @FXML
    private DatePicker searchDueDate;

    @FXML
    private ComboBox<String> statusComboBox;

    public String[] status = { "All", "Pending", "Completed" };

    @FXML
    private ComboBox<String> categoryComboBox;

    public static String[] categoryItems = { "None", "Study", "Personal", "Family" };

    public void openPopUp() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("assignment1.fxml"));
        Parent root = loader.load();

        PopupController popupController = loader.getController();
        popupController.setMainController(this);

        Stage popupStage = new Stage();
        popupStage.setTitle("Add Todo Item");
        popupStage.setScene(new Scene(root));
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.showAndWait();
    }

    public void searchTodo() {
        System.out.println(searchTextField.getText());
    }

    public void addTodo(TodoItem todoItem) {
        todoListTableView.getItems().add(todoItem);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        todoColumn.setCellValueFactory(new PropertyValueFactory<>("todo"));
        descColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        priorityColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        statusComboBox.getItems().addAll(status);
        categoryComboBox.getItems().addAll(categoryItems);
    }
}
