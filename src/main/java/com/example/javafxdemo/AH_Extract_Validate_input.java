package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AH_Extract_Validate_input extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        TextField ageIp = new TextField();
        Button button = new Button("Validate");
        button.setOnAction(e -> {
            if(isInt(ageIp,ageIp.getText()))
                System.out.println(ageIp.getText());
        });
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(ageIp,button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField nameIp, String text) {
        try{
            System.out.println("User is "+ Integer.parseInt(text));
            return true;
        }catch (NumberFormatException e){
            System.out.println("Error: "+text+" is not a number");
            return false;
        }
    }
}
