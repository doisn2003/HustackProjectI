module com.example.hustackprojecti {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.hustackprojecti to javafx.fxml;
    exports com.example.hustackprojecti;
}