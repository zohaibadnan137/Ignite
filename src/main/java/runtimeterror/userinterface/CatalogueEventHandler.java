package runtimeterror.userinterface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import runtimeterror.businesslogic.Car;
import runtimeterror.businesslogic.DealershipFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class CatalogueEventHandler implements Initializable {

    @FXML
    private GridPane gridpane;

    @FXML
    private ScrollPane scrollpane;

    private final List<Car> cars = new ArrayList<>();

    public CatalogueEventHandler() {
    }

    private List<Car> getData() {
        return DealershipFactory.getDealership().getCatalogue().getCars();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cars.addAll(getData());

        int column = 0, row = 1;

        for (Car car : cars) {
            FXMLLoader fxml_loader = new FXMLLoader();
            fxml_loader.setLocation(getClass().getResource("Car.fxml"));

            AnchorPane anchorpane = null;

            try {
                anchorpane = fxml_loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            CarEventHandler car_controller = fxml_loader.getController();
            car_controller.setData(car);

            if (column == 3) {
                column = 0;
                row++;
            }

            gridpane.add(anchorpane, column++, row);

            // Set width
            gridpane.setMinWidth(Region.USE_COMPUTED_SIZE);
            gridpane.setPrefWidth(Region.USE_COMPUTED_SIZE);
            gridpane.setMaxWidth(Region.USE_PREF_SIZE);

            // Set height
            gridpane.setMinHeight(Region.USE_COMPUTED_SIZE);
            gridpane.setPrefHeight(Region.USE_COMPUTED_SIZE);
            gridpane.setMaxHeight(Region.USE_PREF_SIZE);

            GridPane.setMargin(anchorpane, new Insets(10));
        }
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
