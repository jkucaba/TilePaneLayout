package com.jakubku.tilepane.tilepanelayout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TilePane root = new TilePane(5,5);
        Button b12 = new Button("One\nTwo");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");
        Button b6 = new Button("Six");

        TilePane.setAlignment(b3, Pos.BOTTOM_RIGHT);
        root.getChildren().addAll(b12, b3, b4, b5, b6);
        root.setPrefColumns(3);
        Scene scene = new Scene(root);
        stage.setTitle("StackPane Layout Example");
        stage.setScene(scene);
        stage.show();
    }
    public TilePane createTilePane(Pos tileAlignment) {
        Button[] buttons = new Button[]{
                new Button("Tiles"),
                new Button("are"),
                new Button("Aligned"),
                new Button("at"),
                new Button(tileAlignment.toString())
        };
        TilePane tilePane = new TilePane(5,5, buttons);
        tilePane.setTileAlignment(tileAlignment);
        tilePane.setPrefColumns(3);
        return tilePane;
    }
    public static void main(String[] args) {
        launch();
    }
}
