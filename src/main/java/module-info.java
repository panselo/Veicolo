module com.example.veicolo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.veicolo to javafx.fxml;
    exports com.example.veicolo;
}