module org.example.studentportal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentportal to javafx.fxml;
    exports org.example.studentportal;
}