package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import runtimeterror.businesslogic.DealershipFactory;
import runtimeterror.businesslogic.Employee;

import java.util.Objects;

public class EmployeeLoginEventHandler {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label invalidCredentials;

    @FXML
    private void start(MouseEvent event) {
        invalidCredentials.setText("");
    }

    @FXML
    private void login(ActionEvent event) {
        Employee current_employee = DealershipFactory.getDealership().getEmployees().authenticateEmployee(username.getText(), password.getText());

        if (current_employee != null) {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainInterface.fxml")));
                Stage primaryStage = new Stage();
                primaryStage.setTitle("Employee Login");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            username.setText("");
            password.setText("");
            invalidCredentials.setText("Invalid credentials. Please try again.");
        }

    }
}
