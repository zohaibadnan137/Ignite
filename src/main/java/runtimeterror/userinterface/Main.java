package runtimeterror.userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import runtimeterror.utilities.TestDataLoader;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        TestDataLoader test_data_loader = new TestDataLoader();
        test_data_loader.loadData();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SplashScreen.fxml")));
        primaryStage.setTitle("Ignite");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}