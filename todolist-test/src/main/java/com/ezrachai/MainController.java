package com.ezrachai;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
    private TableColumn<TodoItem, String> statusColumn;

    @FXML
    private TextField searchTextField;

    @FXML
    private DatePicker searchDueDate;

    @FXML
    private ComboBox<String> statusComboBox;

    public String[] status = { "All", "Not Started", "In Progress", "Completed" };

    @FXML
    private ComboBox<String> categoryComboBox;

    public static String[] categoryItems = { "", "Study", "Personal", "Family" };

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
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusComboBox.setValue("All");
        statusComboBox.getItems().addAll(status);
        categoryComboBox.setValue("");
        categoryComboBox.getItems().addAll(categoryItems);

        priorityColumn.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(String priority, boolean empty) {
                super.updateItem(priority, empty);
                if (priority == null || empty) {
                    setStyle("");
                } else {
                    setText(priority);
                    setAlignment(Pos.CENTER);
                    switch (priority.toLowerCase()) {
                        case "high":
                            setStyle("-fx-background-color: #ffcccc;");
                            setTextFill(Color.RED);
                            break;
                        case "medium":
                            setStyle("-fx-background-color: #fff2cc;");
                            setTextFill(Color.ORANGE);
                            break;
                        case "low":
                            setStyle("-fx-background-color: #ccffcc;");
                            setTextFill(Color.GREEN);
                            break;
                        default:
                            break;
                    }
                }
            }
        });

        statusColumn.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(String status, boolean empty) {
                super.updateItem(status, empty);
                if (status == null || empty) {
                    setStyle("");
                } else {
                    setText(status);
                    setAlignment(Pos.CENTER);
                    switch (status.toLowerCase()) {
                        case "not started":
                            setStyle("-fx-background-color: #ffcccc;");
                            setTextFill(Color.RED);
                            break;
                        case "in progress":
                            setStyle("-fx-background-color: #fff2cc;");
                            setTextFill(Color.ORANGE);
                            break;
                        case "completed":
                            setStyle("-fx-background-color: #ccffcc;");
                            setTextFill(Color.GREEN);
                            break;
                        default:
                            break;

                    }
                }
            }
        });
    }
}
