package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AI_Check_box extends Application {
    Stage window;
    Scene scene;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Subway");
        CheckBox box1 = new CheckBox("Chicken");
        CheckBox box2 = new CheckBox("Tuna");
        //To have a box checked
        box2.setSelected(true);

        button = new Button("Order now!");
        button.setOnAction(e -> handleOptions(box1,box2));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(box1,box2,button);
        scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "Users order:";
        if(box1.isSelected())
            message+="\nChicken";
        if(box2.isSelected())
            message+="\nTune";
        System.out.println(message);
    }
}
