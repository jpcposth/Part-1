package org.adainf.javapro1uipart01.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class HomeScreen {

    private Scene homeScene;

    public HomeScreen() {
        GridPane container = new GridPane();
        homeScene = new Scene(container);
        FlowPane CategoryPane = new FlowPane();
        GridPane Filmgrid = new GridPane();

        //Var
        int width = 125;

        //Box
        HBox Title = new HBox();
        HBox Searchbar = new HBox();
        VBox Sidebar = new VBox(15);
        HBox Category = new HBox();

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

        Label Search = new Label("Search for films...");

        Label S1 = new Label("New Releases");
        Label S2 = new Label("Trending");
        Label S3 = new Label("Coming Soon");
        Label S4 = new Label("Favourites");
        Label S5 = new Label("Watch Later");

        Text Cat = new Text("Christmas Films");

        //Rectangle
        Rectangle[] R = new Rectangle[8];
        for (int i = 0; i < 8; i++) {
            R[i] = new Rectangle(width, 175);
            R[i].setFill(Color.LIGHTGREY);
        }

        //Films
        Label T1 = new Label("The Night Before Christmas");
        Label T2 = new Label("How The Grinch Stole Christmas");
        Label T3 = new Label("National Lampoon's Christmas Vacation");
        Label T4 = new Label("A Christmas Story");
        Label T5 = new Label("A Christmas Carol");
        Label T6 = new Label("Office Christmas Party");
        Label T7 = new Label("Last Christmas");
        Label T8 = new Label("The Christmas Chronicles");

        //Year
        Label Y1 = new Label("1993");
        Label Y2 = new Label("2000");
        Label Y3 = new Label("1989");
        Label Y4 = new Label("1983");
        Label Y5 = new Label("2009");
        Label Y6 = new Label("2016");
        Label Y7 = new Label("2019");
        Label Y8 = new Label("2018");

        //Filmgrid
        Filmgrid.add(Film1, 0, 0);
        Filmgrid.add(Film2, 1, 0);
        Filmgrid.add(Film3, 2, 0);
        Filmgrid.add(Film4, 3, 0);
        Filmgrid.add(Film5, 4, 0);
        Filmgrid.add(Film6, 5, 0);
        Filmgrid.add(Film7, 0, 1);
        Filmgrid.add(Film8, 1, 1);

        //Films
        Category.getChildren().add(Cat);
        Film1.getChildren().addAll(R[0], T1, Y1);
        Film2.getChildren().addAll(R[1], T2, Y2);
        Film3.getChildren().addAll(R[2], T3, Y3);
        Film4.getChildren().addAll(R[3], T4, Y4);
        Film5.getChildren().addAll(R[4], T5, Y5);
        Film6.getChildren().addAll(R[5], T6, Y6);
        Film7.getChildren().addAll(R[6], T7, Y7);
        Film8.getChildren().addAll(R[7], T8, Y8);

        //Grid
        container.add(Title, 0, 0);
        container.add(Searchbar, 1, 0);
        container.add(Sidebar, 0, 1);
        container.add(CategoryPane, 1, 1);
        container.add(Filmgrid, 1, 1);

        //Set Height/Width
        Title.setMinHeight(30);
        Title.setPrefWidth(150);

        Search.setMinHeight(30);
        Search.setPrefWidth(1040);

        Sidebar.setPrefHeight(605);
        Sidebar.setPrefWidth(150);

        Filmgrid.setPrefWidth(1040);

        T1.setPrefWidth(width);
        T2.setPrefWidth(width);
        T3.setPrefWidth(width);
        T4.setPrefWidth(width);
        T5.setPrefWidth(width);
        T6.setPrefWidth(width);
        T7.setPrefWidth(width);
        T8.setPrefWidth(width);

        //Position
        Title.setAlignment(Pos.CENTER);
        Searchbar.setAlignment(Pos.CENTER_LEFT);

        //Set Wrap
        T1.setWrapText(true);
        T2.setWrapText(true);
        T3.setWrapText(true);
        T4.setWrapText(true);
        T5.setWrapText(true);
        T6.setWrapText(true);
        T7.setWrapText(true);
        T8.setWrapText(true);

        //Set font
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 10);
        T1.setFont(font);
        T2.setFont(font);
        T3.setFont(font);
        T4.setFont(font);
        T5.setFont(font);
        T6.setFont(font);
        T7.setFont(font);
        T8.setFont(font);

        Font font1 = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
        Cat.setFont(font1);

        //Padding
        Sidebar.setPadding(new Insets(30, 0, 0, 10));
        CategoryPane.setPadding(new Insets(30, 10, 10, 25));
        Filmgrid.setPadding(new Insets(80, 10, 10, 25));
        Searchbar.setPadding(new Insets(0, 0, 0, 25));

        T1.setPadding(new Insets(10, 0, 0, 0));
        T2.setPadding(new Insets(10, 0, 0, 0));
        T3.setPadding(new Insets(10, 0, 0, 0));
        T4.setPadding(new Insets(10, 0, 0, 0));
        T5.setPadding(new Insets(10, 0, 0, 0));
        T6.setPadding(new Insets(10, 0, 0, 0));
        T7.setPadding(new Insets(10, 0, 0, 0));
        T8.setPadding(new Insets(10, 0, 0, 0));

        //Filmgrid spaces
        for (int i = 0; i < 6; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints();
            columnConstraints.setPercentWidth(100.0 / 6);
            Filmgrid.getColumnConstraints().add(columnConstraints);
        }

        for (int i = 0; i < 2; i++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / 2);
            Filmgrid.getRowConstraints().add(rowConstraints);
        }

        //Borders
        Title.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        Searchbar.setBorder(new Border(new BorderStroke(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, null, null, Insets.EMPTY)));
        Sidebar.setBorder(new Border(new BorderStroke(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, BorderStrokeStyle.NONE, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, null, null, Insets.EMPTY)));

        //Add
        Title.getChildren().addAll(Txt);
        Searchbar.getChildren().addAll(Search);
        Sidebar.getChildren().addAll(S1, S2, S3, S4, S5);
        CategoryPane.getChildren().add(Category);
    }

    public Scene getHomeScene() {
        return homeScene;
    }



}
