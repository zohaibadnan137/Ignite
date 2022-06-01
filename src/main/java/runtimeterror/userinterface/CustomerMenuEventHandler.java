package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import runtimeterror.businesslogic.ObjectHolder;

import java.io.IOException;
import java.util.Objects;

public class CustomerMenuEventHandler {

    @FXML
    private Label customer_name;

    public void initialize() {
        customer_name.setText(ObjectHolder.getInstance().getCustomer().getCustomerFirstName() + "!");
    }

    @FXML
    private void submitQuery(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Query.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Submit a Query");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void fileComplaint(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Complaint.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("File a Complaint");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void browseCatalogue(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Catalogue.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Catalogue");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void manageBookings(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ManageBookings.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Manage Bookings");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        ObjectHolder.getInstance().reset();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CustomerLogin.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Customer Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
