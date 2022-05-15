package runtimeterror.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import runtimeterror.businesslogic.DealershipFactory;
import runtimeterror.businesslogic.ObjectHolder;

import java.io.IOException;
import java.util.Objects;

public class ComplaintEventHandler {

    @FXML
    private TextArea complaintInput;

    @FXML
    private void redirect(ActionEvent event) throws IOException {
        DealershipFactory.getDealership().getComplaints().addComplaint(ObjectHolder.getInstance().getCustomer().getCustomerId(), complaintInput.getText());

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ComplaintSuccess.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Complaint Success");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
