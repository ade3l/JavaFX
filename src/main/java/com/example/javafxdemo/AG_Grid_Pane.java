package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AG_Grid_Pane extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Grid Pane in java FX");

        GridPane gridPane = new GridPane();
//        Add a 10px padding to the grid layout from the border of the window
        gridPane.setPadding(new Insets(10,10,10,10));
//        Now to add a space between each cells in the grid and make sure they're not all bunched up together
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Username: ");
//        To add an element to a specific row and column
//        element, column, row format
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameIP = new TextField("Default text");
        GridPane.setConstraints(nameIP, 1, 0);

        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0,1);

        TextField passIP = new TextField("");
        passIP.setPromptText("Default hint");
        GridPane.setConstraints(passIP, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1,2);

        gridPane.getChildren().addAll(nameLabel, nameIP, passLabel, passIP, loginButton);
        Scene scene = new Scene(gridPane, 300, 300);
        window.setScene(scene);
        window.show();
    }
}
