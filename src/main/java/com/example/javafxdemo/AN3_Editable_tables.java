package com.example.javafxdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AN3_Editable_tables extends Application {
    Stage window;
    TableView table;
    TextField nameInput, priceInput, quantityInput;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Table View");

        //Name column
        //Column name can be anything we want
        TableColumn<AN2_Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
//        name of value in  Property value factory must be the same as in object
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<AN2_Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(200);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<AN2_Product, Double> quantityColumn = new TableColumn<>("quantity");
        quantityColumn.setMinWidth(200);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        Button addButton = new Button("Add");
        Button delButton = new Button("Delete");

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        //Add spacing between elements inside the hBox
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, delButton);

        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table,hBox);
        Scene scene = new Scene(layout,600, 400);
        window.setScene(scene);
        window.show();
    }
    //Function to get all products
    public ObservableList<AN2_Product> getProducts(){
        ObservableList<AN2_Product> products = FXCollections.observableArrayList();
        products.add(new AN2_Product("Laptop",860,15));
        products.add(new AN2_Product("Phone",2400,30));
        products.add(new AN2_Product("Ball",20,7));
        products.add(new AN2_Product("Corn",3,10));
        products.add(new AN2_Product("Charger",120,5));
        return products;
    }
}
