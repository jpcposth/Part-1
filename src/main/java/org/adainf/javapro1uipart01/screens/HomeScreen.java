package org.adainf.javapro1uipart01.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HomeScreen {

    private Scene homeScene;

    public HomeScreen() {
        GridPane container = new GridPane();
        homeScene = new Scene(container);
        GridPane Filmgrid = new GridPane();

        //Box
        HBox Title = new HBox();
        HBox Searchbar = new HBox();
        VBox Sidebar = new VBox();

        VBox Film1 = new VBox();
        VBox Film2 = new VBox();
        VBox Film3 = new VBox();
        VBox Film4 = new VBox();
        VBox Film5 = new VBox();
        VBox Film6 = new VBox();
        VBox Film7 = new VBox();
        VBox Film8 = new VBox();

        //Content
        Text Txt = new Text("INF CINEMA");

        TextField Search = new TextField();

        Hyperlink options[] = new Hyperlink[]{
            new Hyperlink ("New Releases"),
            new Hyperlink ("Trending"),
            new Hyperlink ("Coming Soon"),
            new Hyperlink ("Favourites"),
            new Hyperlink ("Watch Later")
        };

        //Films
        Text F1 = new Text("INF CINEMA");
        Text F2 = new Text("INF CINEMA");
        Text F3 = new Text("INF CINEMA");
        Text F4 = new Text("INF CINEMA");
        Text F5 = new Text("INF CINEMA");
        Text F6 = new Text("INF CINEMA");
        Text F7 = new Text("INF CINEMA");
        Text F8 = new Text("INF CINEMA");

        //Filmgrid
        Filmgrid.add(Film1, 0, 0);
        Filmgrid.add(Film2, 1, 0);
        Filmgrid.add(Film3, 2, 0);
        Filmgrid.add(Film4, 3, 0);
        Filmgrid.add(Film5, 4, 0);
        Filmgrid.add(Film6, 5, 0);
        Filmgrid.add(Film7, 0, 1);
        Filmgrid.add(Film8, 1, 1);

        //
        Film1.getChildren().add(F1);
        Film2.getChildren().add(F2);
        Film3.getChildren().add(F3);
        Film4.getChildren().add(F4);
        Film5.getChildren().add(F5);
        Film6.getChildren().add(F6);
        Film7.getChildren().add(F7);
        Film8.getChildren().add(F8);
        //

        //Grid
        container.add(Title, 0, 0);
        container.add(Searchbar, 1, 0);
        container.add(Sidebar, 0, 1);
        container.add(Filmgrid, 1, 1);

        //Set
        Title.setAlignment(Pos.CENTER);

        Search.setPromptText("Search for films...");
        Search.setPrefHeight(30);
        Search.setPrefWidth(1040);
        Search.setStyle("-fx-background-radius: 0;");

        Sidebar.setPrefHeight(605);
        Sidebar.setPrefWidth(150);

        //Filmgrid spaces
        for (int i = 0; i < 6; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints();
            columnConstraints.setPercentWidth(100.0 / 6);
            Filmgrid.getColumnConstraints().add(columnConstraints);
        }

        for (int i = 0; i < 3; i++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / 3);
            Filmgrid.getRowConstraints().add(rowConstraints);
        }

//        Film1.setPrefWidth(170);
//        Film2.setPrefWidth(170);
//        Film3.setPrefWidth(170);
//        Film4.setPrefWidth(170);
//        Film5.setPrefWidth(170);
//        Film6.setPrefWidth(170);
//        Film7.setPrefWidth(170);
//        Film8.setPrefWidth(170);

        //Borders
        Title.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        Search.setBorder(new Border(new BorderStroke(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, null, null, Insets.EMPTY)));
        Sidebar.setBorder(new Border(new BorderStroke(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, BorderStrokeStyle.NONE, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, null, null, Insets.EMPTY)));

        //Add
        Title.getChildren().addAll(Txt);
        Searchbar.getChildren().addAll(Search);
        Sidebar.getChildren().addAll(options);
//        Film.getChildren().addAll(testt);
//        container.getChildren().addAll(Title, Search, Side, Film);
    }

    public Scene getHomeScene() {
        return homeScene;
    }


}
