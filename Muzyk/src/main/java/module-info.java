module com.example.muzyk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.muzyk to javafx.fxml;
    exports com.example.muzyk;
}