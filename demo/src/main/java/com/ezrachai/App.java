package com.ezrachai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("learn.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        // Group root = new Group();
        // Scene scene = new Scene(root, 600, 600, Color.PURPLE);
        // Image icon = new Image("file:Usm.png");
        // stage.getIcons().add(icon);
        // stage.setTitle("Stage Demo Program");
        // stage.setScene(scene);
        // Text text = new Text("Hello World!");
        // text.setX(50);
        // text.setY(50);
        // text.setFont(Font.font("Roboto", 50));
        // text.setFill(Color.GREEN);

        // Line line = new Line();
        // line.setStartX(200);
        // line.setStartY(200);
        // line.setEndX(500);
        // line.setEndY(500);
        // line.setStroke(Color.RED);

        // Rectangle rec = new Rectangle();
        // rec.setX(100);
        // rec.setY(200);
        // rec.setWidth(200);
        // rec.setHeight(200);
        // rec.setFill(Color.BLUE);

        // Image image = new Image("file:Usm.png");
        // ImageView imageView = new ImageView(image);
        // imageView.setX(200);
        // imageView.setY(200);

        // root.getChildren().add(text);
        // root.getChildren().add(line);
        // root.getChildren().add(rec);
        // root.getChildren().add(imageView);
        // stage.setWidth(1920);
        // stage.setX(0);
        // stage.setY(0);
        // stage.setHeight(1080);
        // stage.setResizable(false);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("q to quit");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        // stage.show();
    }

}