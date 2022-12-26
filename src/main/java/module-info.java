module com.example.gcite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gcite to javafx.fxml;
    exports com.example.gcite;
}