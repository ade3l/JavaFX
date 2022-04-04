package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AM_Tree_view extends Application {
    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Tree View");

        TreeItem<String> root, branch1, branch2;

        root = new TreeItem<>();
        //When the program started make it expanded and not collapsed
        root.setExpanded(true);

        //building branch1
        branch1 = makeBranch("This is Branch 1", root);
        makeBranch("Child of b1", branch1);
        makeBranch("Second Child of b1", branch1);
        makeBranch("Third Child of b1", branch1);

        //building branch1
        branch2 = makeBranch("This is Branch 1", root);
        makeBranch("Child of b1", branch2);
        makeBranch("Children with the same root are called siblings", branch2);
        makeBranch("Third Child of b1", branch2);

        //Create the tree
        tree = new TreeView<>(root);
        //In our program root is just a container for other branches
//        If root was shown we would need to expand it to see branch1 and branch2
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue )->{
            if(newValue != null)
                System.out.println(newValue.getValue());
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}
