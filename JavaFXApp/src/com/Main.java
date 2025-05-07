package JavaFXApp.src.com;


import JavaFXApp.src.com.model.UserRepository;
import JavaFXApp.src.com.view.ViewNavigator;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static UserRepository userRepository = new UserRepository();

    @Override
    public void start(Stage stage) throws IOException {

        ViewNavigator.setStage(stage);
        ViewNavigator.loadView("LoginView.fxml");
        System.out.println(userRepository.toString());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
