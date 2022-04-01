package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AL_List_View extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Button button = new Button("Click me");


        VBox layout = new VBox(10);
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 400,400);
        window.setScene(scene);
        window.show();
    }
}
