module kz.atu.lab {
    requires javafx.controls;
    requires javafx.fxml;

    opens kz.atu.lab to javafx.fxml;
    exports kz.atu.lab;
}
