package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AD_Creating_alert_boxes extends Application {
    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        button=new Button("Click me");
        StackPane layout= new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }
}
