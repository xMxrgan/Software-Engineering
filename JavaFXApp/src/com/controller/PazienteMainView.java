package JavaFXApp.src.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PazienteMainView {

    public Button loginButton;


    @FXML
    private void loadView(String fxml) {
        System.out.println("Login button clicked!");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../resource/fxml/LoginView.fxml"));
            Parent root = loader.load();


            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("❌ Errore durante il caricamento della vista: " + fxml);
        }
    }

    public void showMainVeiw(ActionEvent actionEvent) {

    }
}
