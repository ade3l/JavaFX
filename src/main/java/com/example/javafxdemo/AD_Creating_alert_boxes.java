package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AD_Creating_alert_boxes extends Application {
    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

//    Put this in a class if you want to make alert box objects;
    public static void display(String title, String message){
        Stage window = new Stage();
//        Set the modality so that while this window is open you cannot interact with the other one
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(message);
        Button button = new Button("Close the window");
        button.setOnAction(actionEvent -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        button=new Button("Click me");
        button.setOnAction(e -> display("Title of window","This is the alert window"));
        StackPane layout= new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }
}
