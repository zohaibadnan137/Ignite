package runtimeterror.userinterface;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Booking;
import runtimeterror.businesslogic.DealershipFactory;
import runtimeterror.businesslogic.ObjectHolder;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ManageBookingsEventHandler implements Initializable {
    @FXML
    private TableColumn<Booking, String> booking_id;

    @FXML
    private TableColumn<Booking, String> color;

    @FXML
    private TableColumn<Booking, String> date;

    @FXML
    private TableColumn<Booking, String> manufacturer;

    @FXML
    private TableColumn<Booking, String> model;

    @FXML
    private TableView<Booking> table;

    @FXML
    private TableColumn<Booking, String> year;

    @FXML
    void loadMainMenu(MouseEvent event) throws IOException {
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
        booking_id.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getBookingId())));
        color.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBookingColor()));
        date.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBookingDateTime().getDate()));
        manufacturer.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBookingCar().getManufacturer()));
        model.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBookingCar().getModel()));
        year.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBookingCar().getYear()));

        ObservableList<Booking> bookings = FXCollections.observableArrayList(DealershipFactory.getDealership().getBookings().getBookingsForCustomer(ObjectHolder.getInstance().getCustomer()));
        table.setItems(bookings);
    }
}
