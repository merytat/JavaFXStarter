module com.example.javafxstarter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.javafxstarter to javafx.fxml;
    exports com.example.javafxstarter;
}