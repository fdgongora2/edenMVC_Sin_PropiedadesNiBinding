module com.example.edenmvc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.edenmvc to javafx.fxml;
    exports com.example.edenmvc;
}