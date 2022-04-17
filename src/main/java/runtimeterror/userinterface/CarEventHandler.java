package runtimeterror.userinterface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import runtimeterror.businesslogic.Car;

import java.util.Objects;

public class CarEventHandler {

    @FXML
    private ImageView car_image;

    @FXML
    private Label car_name;

    @FXML
    private Label car_price;

    public void setData(Car car) {
        car_name.setText(car.getManufacturerAndModel());
        car_price.setText("Rs. " + car.getPrice());

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(car.getImageSource())));
        car_image.setImage(image);

    }
}
