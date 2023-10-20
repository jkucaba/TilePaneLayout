module com.jakubku.tilepane.tilepanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.tilepane.tilepanelayout to javafx.fxml;
    exports com.jakubku.tilepane.tilepanelayout;
}