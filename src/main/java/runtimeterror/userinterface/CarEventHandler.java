package runtimeterror.userinterface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Car;

import java.io.IOException;
import java.util.Objects;

public class CarEventHandler {

    @FXML
    private ImageView car_image;

    @FXML
    private Label car_name;

    @FXML
    private Label car_price;

    @FXML
    private Label car_year;

    public void setData(Car car) {
        car_name.setText(car.getLongCarName());
        car_price.setText("Rs. " + car.getStartingPrice());
        car_year.setText(car.getYear());

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(car.getImageSource())));
        car_image.setImage(image);

    }

    @FXML
    public void loadCarSpecification(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CarSpecification.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Customer Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
