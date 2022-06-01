package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import runtimeterror.businesslogic.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class BookingEventHandler implements Initializable {
    @FXML
    private ChoiceBox<String> color_choice_box;

    @FXML
    private ChoiceBox<String> variant_choice_box;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Car car = ObjectHolder.getInstance().getCar();
        ArrayList<Variant> variants = car.getVariants();
        for (Variant variant : variants)
            variant_choice_box.getItems().add(variant.getVariantName());
        variant_choice_box.setValue(variants.get(0).getVariantName());

        ArrayList<String> colors = car.getColors();
        for (String color : colors)
            color_choice_box.getItems().add(color);
        color_choice_box.setValue(colors.get(0));
    }

    @FXML
    void bookCar(ActionEvent event) throws IOException {
        String selected_variant = variant_choice_box.getValue();
        Variant variant = ObjectHolder.getInstance().getCar().getVariant(selected_variant);
        ObjectHolder.getInstance().setVariant(variant);

        ObjectHolder.getInstance().setColor(color_choice_box.getValue());

        Booking booking = DealershipFactory.getDealership().getBookings().addBooking(ObjectHolder.getInstance().getCustomer(), ObjectHolder.getInstance().getCar(), ObjectHolder.getInstance().getVariant(), ObjectHolder.getInstance().getColor());
        ObjectHolder.getInstance().setBooking(booking);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("BookingSuccess.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Booking Success");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
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
}
