package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AK_Combo_box extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        VBox layout = new VBox(10);
        layout.getChildren().addAll();
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }
}
