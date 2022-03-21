package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AH_Extract_Validate_input extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        TextField nameIp = new TextField();
        Button button = new Button("Click me");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameIp,button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }
}
