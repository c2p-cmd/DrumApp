package org.practice.drum.drums;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrumsMain extends Application implements Runnable {
    private static String[] args;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(DrumsMain.class.getResource("drum-app.fxml"));

        stage.setResizable(false);
        stage.setTitle("DrumApp");
        stage.setScene(
                new Scene(loader.load())
        );
        stage.show();
    }

    public static void main(String[] args) {
        DrumsMain.args = args;
        new Thread(new DrumsMain()).start();
    }

    @Override
    public void run() {
        Application.launch(args);
    }
}
