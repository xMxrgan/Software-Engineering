package JavaFXApp.src.com.controller;

import JavaFXApp.src.com.model.User;
import JavaFXApp.src.com.model.UserRepository;
import javafx.event.ActionEvent;
import JavaFXApp.src.com.view.ViewNavigator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import JavaFXApp.src.com.Main;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;


    private UserRepository userRepository;

    @FXML
    public void initialize() {
        userRepository = Main.getUserRepository();
        System.out.println(userRepository.toString());
    }


    @FXML
    private void navigateToDashboard(ActionEvent event) {
        String email = usernameField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showError("Username o Password non inseriti");
        }

        User user = userRepository.getEmail(email);

        if (user != null && email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            if(user.getAdmin())
                ViewNavigator.loadView("AmministratoreView.fxml");
            else
                ViewNavigator.loadView("PazienteAnomalieView.fxml");
        } else {
            showError("Login fallito");
        }
    }

    private void showError(String message) {
        statusLabel.setText(message);
        statusLabel.setVisible(true);
    }


}
