package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AC_Anonymous_Inner_Classes_and_Lambda_Expressions extends Application {
    Button button;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("This is the title of the window");
        stage.setTitle("Title of the window");
        button=new Button("Click me");

//        Set click to the button
//        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
