package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import runtimeterror.businesslogic.ObjectHolder;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class BookingSuccessEventHandler implements Initializable {

    @FXML
    private Label booking_id;

    @FXML
    private Label car_name;

    @FXML
    private Label color;

    @FXML
    private Label name;

    @FXML
    private Label phone_number;

    @FXML
    private Label variant_name;

    @FXML
    void redirect(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CustomerMenu.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Customer Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        booking_id.setText(Integer.toString(ObjectHolder.getInstance().getBooking().getBookingId()));
        car_name.setText(ObjectHolder.getInstance().getCar().getLongCarName());
        color.setText(ObjectHolder.getInstance().getColor());
        name.setText(ObjectHolder.getInstance().getCustomer().getCustomerFullName());
        phone_number.setText(ObjectHolder.getInstance().getCustomer().getPhoneNumber());
        variant_name.setText(ObjectHolder.getInstance().getVariant().getVariantName());
    }
}
