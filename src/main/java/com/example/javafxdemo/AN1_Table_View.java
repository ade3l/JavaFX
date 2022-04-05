package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AN1_Table_View extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Table View");



        VBox layout = new VBox();
        layout.getChildren().addAll();
        Scene scene = new Scene(layout,400, 400);
        window.setScene(scene);
        window.show();
    }
}
