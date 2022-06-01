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

public class QueryEventHandler {

    @FXML
    private TextArea queryInput;

    @FXML
    private void redirect(ActionEvent event) throws IOException {
        DealershipFactory.getDealership().getQueries().addQuery(ObjectHolder.getInstance().getCustomer().getCustomerId(), queryInput.getText());

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("QuerySuccess.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Query Success");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
