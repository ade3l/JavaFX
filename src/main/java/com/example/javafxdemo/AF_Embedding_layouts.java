package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AF_Embedding_layouts extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window= stage;
        window.setTitle("Title of window");

        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 400, 500);
        window.setScene(scene);
        window.show();

    }
}
