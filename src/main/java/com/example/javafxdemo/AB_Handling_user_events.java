package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AB_Handling_user_events extends Application implements EventHandler<ActionEvent> {
    Button button;
    public static void main(String args[]) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Title of the window");
        button=new Button("Click me");

//        Set click to the button
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

//    Whenever the user clicks something it is called an event
    @Override
    public void handle(ActionEvent actionEvent) {
       /* This is a generic fn and gets called whenever we click a button
        So we need to identify which object caused this event to occur*/
        if(actionEvent.getSource()==button){
            System.out.println("You have clicked the button");
        }
    }
}
