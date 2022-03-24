package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import runtimeterror.businesslogic.Customer;
import runtimeterror.businesslogic.DealershipFactory;

public class CustomerLoginEventHandler {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private void login(ActionEvent event) {
        Customer current_customer = DealershipFactory.getDealership().authenticateCustomer(username.getText(), password.getText());

        if (current_customer != null) {
            // Load next scene
        } else {
            
        }

    }
}
