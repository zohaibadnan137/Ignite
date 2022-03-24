package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SplashScreenEventHandler {
    @FXML
    private void loadCustomerLoginScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Customer Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void loadEmployeeLoginScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EmployeeLogin.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Employee Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}