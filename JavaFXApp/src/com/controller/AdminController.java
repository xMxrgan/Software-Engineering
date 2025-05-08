package JavaFXApp.src.com.controller;

import JavaFXApp.src.com.Main;
import JavaFXApp.src.com.model.User;
import JavaFXApp.src.com.model.UserRepository;
import JavaFXApp.src.com.view.ViewNavigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AdminController {

    @FXML private VBox formContainer;
    @FXML private TextField nomeField;
    @FXML private TextField cognomeField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    private UserRepository userRepository;

    @FXML
    public void initialize() {
        userRepository = Main.getUserRepository();
        System.out.println(userRepository.toString());
    }

    public void addPaziente(ActionEvent actionEvent) {
        formContainer.setVisible(true);
    }

    public void addDiabetologo(ActionEvent actionEvent) {
        formContainer.setVisible(true);
    }

    public void navigateToLogin(ActionEvent actionEvent) {
        ViewNavigator.loadView("LoginView.fxml");
    }

    public void handleSave(ActionEvent actionEvent) {
        String nome = nomeField.getText();
        String cognome = cognomeField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        if (nome.isEmpty() || cognome.isEmpty() || email.isEmpty() || password.isEmpty()) {
            showError("Non tutti i campi sono stati inseriti");
        }

        User user = userRepository.getEmail(email);
        if(user == null){
            ;
        }
        else {
            showError("Utente già registrato");
        }
    }

    private void showError(String message) {
        statusLabel.setText(message);
        statusLabel.setVisible(true);
    }

}
