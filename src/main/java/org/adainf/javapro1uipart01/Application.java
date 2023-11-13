package org.adainf.javapro1uipart01;

import javafx.stage.Stage;
import org.adainf.javapro1uipart01.screens.HomeScreen;

public class Application extends javafx.application.Application {

    private static Stage mainStage;
    public static int[] applicationSize = {1200, 650};
    @Override
    public void start(Stage stage) {
        mainStage = stage;
        mainStage.setWidth(applicationSize[0]);
        mainStage.setHeight(applicationSize[1]);
        mainStage.setResizable(false);
        mainStage.setTitle("Ad Cinema");

        mainStage.setScene(new HomeScreen().getHomeScene());
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
