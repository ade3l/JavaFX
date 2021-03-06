package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AD1_Creating_alert_boxes extends Application {
    Stage window;
    Button alerBoxButton;
    Button confirmBoxButton;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;

        alerBoxButton=new Button("Click me to show alert box");
        alerBoxButton.setOnAction(e -> AD2_Alert_Box.display("Title of window","This is the alert window"));

        confirmBoxButton = new Button("Click me to show confirmation boxes");
        confirmBoxButton.setOnAction(actionEvent -> {
            boolean result = AD3_Confirm_Box.display("Title of the window", "This is a confirmation window");
            System.out.println(result);
        });


        VBox layout= new VBox(10);
        layout.getChildren().addAll(alerBoxButton,confirmBoxButton);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }
}
