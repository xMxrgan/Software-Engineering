package JavaFXApp.src.com.controller;

import javafx.event.ActionEvent;
import JavaFXApp.src.com.view.ViewNavigator;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;


    @FXML
    private void navigateToManyView(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        System.out.println(username);
        // Validazione o logica di login qui
        if (username.equals("admin") && password.equals("1234")) {
            ViewNavigator.loadView("PazienteAnomalieView.fxml");
        } else {
            System.out.println("Login fallito");
        }
    }

}
