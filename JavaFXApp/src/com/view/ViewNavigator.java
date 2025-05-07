package JavaFXApp.src.com.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewNavigator {

    private static String userRole;
    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static void setUserRole(String role) {
        userRole = role;
    }


    @FXML
    public static void loadView(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(ViewNavigator.class.getResource("../../resource/fxml/" + fxmlFile));
            Parent root = loader.load();

            Scene scene = new Scene(root, 800, 600);

            mainStage.setTitle("Telemedicina");
            mainStage.setScene(scene);
            mainStage.show();


        } catch (IOException e) {
            System.err.println("❌ Errore durante il caricamento della vista: " + fxmlFile);
        }
    }


    public void navigateToLogin(ActionEvent actionEvent) {
        loadView("LoginView.fxml");
    }

}
