module pl.allegroupdate.dropsh {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pl.allegroupdate.dropsh to javafx.fxml;
    exports pl.allegroupdate.dropsh;
}