module com.example.deleteonexitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deleteonexitdemo to javafx.fxml;
    exports com.example.deleteonexitdemo;
}