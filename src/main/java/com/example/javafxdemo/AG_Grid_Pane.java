package com.example.javafxdemo;

import javafx.application.Application;
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

        window.show();
    }
}
