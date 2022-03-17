package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AA_Creating_a_basic_window extends Application {
    Button button;
    public static void main(String args[]) {
        //Whenever we start our program launch will get called
        //It will basically setup our program as a javafx application
        //launch will call start()
        launch(args);

    }
    /*In javaFX the entire window is called the stage
     The content inside the stage is called the scene*/
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Title of the window");
        button=new Button("Click me");
//        button.setText("Click me");

//        Creating a layout
        StackPane layout = new StackPane();
//        Add button to the layout
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
