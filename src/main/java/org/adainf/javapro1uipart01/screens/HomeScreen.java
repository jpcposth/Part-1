package org.adainf.javapro1uipart01.screens;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class HomeScreen {

    private Scene homeScene;

    public HomeScreen() {
        Pane container = new Pane();
        homeScene = new Scene(container);
    }

    public Scene getHomeScene() {
        return homeScene;
    }
}
