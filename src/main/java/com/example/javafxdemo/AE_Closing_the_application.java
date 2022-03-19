package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AE_Closing_the_application extends Application {
    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Main window");
        window.setOnCloseRequest(e-> {
            e.consume();
            closeProgram();
        });
        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        System.out.println("Called");
        Boolean answer= AD3_Confirm_Box.display("Title", "Are you sure you want to quit");
        if(answer)
            window.close();
    }
}
