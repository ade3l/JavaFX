package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        MenuItem newFile = new MenuItem("New");
        newFile.setOnAction(e -> System.out.println("New File clicked"));
        fileMenu.getItems().add(newFile);

        fileMenu.getItems().addAll(new MenuItem("Open..."), new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().addAll(new MenuItem("Settings..."), new SeparatorMenuItem(), new MenuItem("Exit..."));

        //Edit Menu
//        If we add an underscore just before the name, it will add a shortcut
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().addAll(new MenuItem("Cut"), new MenuItem("Copy"));

        //Create a greyed out menu button
        MenuItem paste =  new MenuItem("Paste");
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected()){
                System.out.println("Program will now display line numbers");
            }
            else {
                System.out.println("Line numbers disabled");
            }
        });

        CheckMenuItem autoSave = new CheckMenuItem("Enable auto-save");
//        Checked by default
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        //Main menu
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }
}
