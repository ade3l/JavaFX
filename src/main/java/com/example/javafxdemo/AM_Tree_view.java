package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AM_Tree_view extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Tree View");

        StackPane layout = new StackPane();
        Scene scene = new Scene(layout,400, 400);
        window.setScene(scene);
        window.show();
    }
}
