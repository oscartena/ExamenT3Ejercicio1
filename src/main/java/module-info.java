module com.example.exament3ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exament3ejercicio1 to javafx.fxml;
    exports com.example.exament3ejercicio1;
}