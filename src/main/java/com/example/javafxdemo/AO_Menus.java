package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AO_Menus extends Application {
    Stage window;
    BorderPane layout;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        window = stage;
        window.setTitle("Menu demo");
        //File menu
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("New project..."));
        fileMenu.getItems().addAll(new MenuItem("New Module..."), new MenuItem("Import Project..."));

        //Main menu
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }
}
