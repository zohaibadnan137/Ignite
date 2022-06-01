package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Car;
import runtimeterror.businesslogic.ObjectHolder;
import runtimeterror.businesslogic.Variant;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class CarSpecificationEventHandler implements Initializable {

    @FXML
    private ImageView car_image;

    @FXML
    private Label car_name;

    @FXML
    private Label fuel_tank_capacity;

    @FXML
    private Label variant_one_engine_capacity;

    @FXML
    private Label variant_one_horsepower;

    @FXML
    private Label variant_one_name;

    @FXML
    private Label variant_one_price;

    @FXML
    private Label variant_one_transmission;

    @FXML
    private Label variant_one_zero_to_sixty;

    @FXML
    private Label variant_two_zero_to_sixty;

    @FXML
    private Label variant_two_engine_capacity;

    @FXML
    private Label variant_two_horsepower;

    @FXML
    private Label variant_two_name;

    @FXML
    private Label variant_two_price;

    @FXML
    private Label variant_two_transmission;

    @FXML
    private Label weight;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Car car = ObjectHolder.getInstance().getCar();
        ArrayList<Variant> variants = car.getVariants();
        Variant v1 = variants.get(0);
        Variant v2 = variants.get(1);

        car_name.setText(car.getLongCarName());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(car.getImageSource())));
        car_image.setImage(image);
        fuel_tank_capacity.setText(Integer.toString(car.getFuelTankCapacity()));
        weight.setText(Integer.toString(car.getWeight()));

        variant_one_name.setText(v1.getVariantName());
        variant_one_engine_capacity.setText(Integer.toString(v1.getEngineCapacity()));
        variant_one_transmission.setText(v1.getTransmission());
        variant_one_horsepower.setText(Integer.toString(v1.getHorsepower()));
        variant_one_zero_to_sixty.setText("0-60 in " + Double.toString(v1.getZeroToSixty()) + " s");
        variant_one_price.setText("Rs. " + Integer.toString(v1.getPrice()));

        variant_two_name.setText(v2.getVariantName());
        variant_two_engine_capacity.setText(Integer.toString(v2.getEngineCapacity()));
        variant_two_transmission.setText(v2.getTransmission());
        variant_two_horsepower.setText(Integer.toString(v2.getHorsepower()));
        variant_two_zero_to_sixty.setText("0-60 in " + Double.toString(v2.getZeroToSixty()) + " s");
        variant_two_price.setText("Rs. " + Integer.toString(v2.getPrice()));
    }

    @FXML
    public void loadMainMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CustomerMenu.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Customer Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    public void bookCar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Booking.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Booking");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
