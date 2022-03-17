package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AC_Switching_Scenes extends Application {
    Stage window;
    Scene scene1;
    Scene scene2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Switching scenes with JAVA FX");
        Label label1 = new Label("Welcome to the first scene");

        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(actionEvent -> window.setScene(scene2));

//        layout 1 - everything is laid out in a vertical manner with children spaced out by 20 pixels

        VBox layout1= new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200,200);

        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(actionEvent -> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().add( button2);
        scene2= new Scene(layout2, 300, 300);

//        By default on the first run set scene 1
        window.setScene(scene1);

        window.show();
    }
}
