package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AJ_Drop_down_menu extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Fruits drop down menu");
        Button button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        //getItems returns an observable list object to which we can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Banana");
        choiceBox.getItems().addAll("Orange", "Pear", "Mango");
//        Setting default value so that it is not empty when user first opens it
        choiceBox.setValue("Apples");

        //Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            System.out.println(newValue);
        });
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

//    private void getChoice(ChoiceBox<String> choiceBox) {
//        String food = choiceBox.getValue();
//        System.out.println("User selected: "+ food);
//    }
}
