package com.example.javafxdemo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AL_List_View extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Button button = new Button("Click me");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Iron man", "Titanic", "Contact", "Jodie Foster", "Surrogates");
        /*By default you can only select only one item
        You can change the selection model to change this*/
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e-> getSelections(listView));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(listView,button);
        Scene scene = new Scene(layout, 400,400);
        window.setScene(scene);
        window.show();
    }

    private void getSelections(ListView listView) {
        String message = "";
        ObservableList<String> selections;
        selections= listView.getSelectionModel().getSelectedItems();
        for(String s: selections){
            message += s+", ";
        }
        System.out.println(message);
    }


}
