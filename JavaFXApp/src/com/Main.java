package JavaFXApp.src.com;

import JavaFXApp.src.com.controller.ViewNavigator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {

        ViewNavigator.setStage(stage);
        ViewNavigator.loadView("LoginView.fxml");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
