package runtimeterror.userinterface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import runtimeterror.businesslogic.ObjectHolder;

public class CustomerMenuEventHandler {

    @FXML
    private Label customer_name;

    public void initialize() {
        customer_name.setText(ObjectHolder.getInstance().getCustomer().getCustomerName() + "!");
    }
}
