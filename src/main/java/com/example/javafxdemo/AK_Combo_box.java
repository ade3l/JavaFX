package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AK_Combo_box extends Application {
    Stage window;
    ComboBox<String> comboBox;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good will hunting",
                "St. Vincent",
                "Blackhat"
        );
        comboBox.setPromptText("Select favourite movie");
        comboBox.setOnAction(e -> System.out.println("User selected: "+comboBox.getValue()));
        //This will override the prompttext
        comboBox.setEditable(true);
        Button button = new Button("Click me");
        button.setOnAction(e-> printMovie());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(comboBox, button);

        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    private void printMovie() {
        System.out.println(comboBox.getValue());
    }
}
