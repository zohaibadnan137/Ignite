package runtimeterror.userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Dealership;
import runtimeterror.businesslogic.DealershipFactory;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Dealership dealership = DealershipFactory.getDealership("Ignite");
        dealership.start();
        dealership.addCustomer("Hozaib", 12345, "zo", "zo123");

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