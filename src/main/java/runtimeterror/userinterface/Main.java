package runtimeterror.userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Car;
import runtimeterror.businesslogic.Dealership;
import runtimeterror.businesslogic.DealershipFactory;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Dealership dealership = DealershipFactory.getDealership("Ignite");
        dealership.getCustomers().addCustomer("Hozaib", 12345, "zo", "zo123");

        for (int count = 0; count < 2; count++) {
            Car car = dealership.getCatalogue().addCar("Honda", "Civic", 47, 1300, "honda_civic.png");
            car.addVariant("VTI Oriel", 1800, "Manual", 150, 5.1, 3500000);
            car.addVariant("VTI Oriel CVT", 1800, "Automatic", 160, 4.9, 3800000);

            dealership.getCatalogue().addCar("Toyota", "Corolla", 50, 1160, "toyota_corolla.png");
            dealership.getCatalogue().addCar("Mitsubishi", "Lancer", 50, 1010, "mitsubishi_lancer.png");


            dealership.getCatalogue().addCar("Mercedes", "C Class", 40, 1800, "mercedes_cclass.png");
            dealership.getCatalogue().addCar("Audi", "TT", 40, 1800, "audi_tt.png");
            dealership.getCatalogue().addCar("Porsche", "Cayman", 40, 1800, "porsche_caymanspider.png");
            dealership.getCatalogue().addCar("Mercedes", "GLK Class", 40, 1800, "mercedes_glk.png");
        }

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