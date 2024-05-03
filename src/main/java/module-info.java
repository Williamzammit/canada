module u4a {
    requires javafx.controls;
    requires javafx.fxml;

    opens u4a to javafx.fxml;
    exports u4a;
}
