module project.alp {
    requires javafx.controls;
    requires javafx.fxml;

    opens project.alp to javafx.fxml;
    exports project.alp;
}
