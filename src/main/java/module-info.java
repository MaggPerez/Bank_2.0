module test.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens test.bank to javafx.fxml;
    exports test.bank;
}
