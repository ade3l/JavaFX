package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AO_Menus extends Application {
    Stage window;
    BorderPane layout;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        window = stage;
        window.setTitle("Menu demo");

        layout = new BorderPane();

        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }
}
