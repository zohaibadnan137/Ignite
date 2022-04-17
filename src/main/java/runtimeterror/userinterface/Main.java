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

        for (int count = 0; count < 10; count++) {
            dealership.getCatalogue().addCar("Honda", "Civic", 40, 1800, "honda_civic.png");
            dealership.getCatalogue().addCar("Toyota", "Corolla", 40, 1800, "toyota_corolla.png");
            dealership.getCatalogue().addCar("Mitsubishi", "Lancer", 40, 1800, "mitsubishi_lancer.png");
            dealership.getCatalogue().addCar("Mercedes", "C Class", 40, 1800, "mercedes_cclass.png");
            dealership.getCatalogue().addCar("Audi", "TT", 40, 1800, "audi_tt.png");
            dealership.getCatalogue().addCar("Porsche", "Cayman", 40, 1800, "porsche_caymanspider.png");
            dealership.getCatalogue().addCar("Mercdes", "GLK Class", 40, 1800, "mercedes_glk.png");
        }

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Catalogue.fxml")));
        primaryStage.setTitle("Ignite");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}