module runtimeterror.ignite {
    requires javafx.controls;
    requires javafx.fxml;


    opens runtimeterror.userinterface to javafx.fxml;
    exports runtimeterror.userinterface;
}