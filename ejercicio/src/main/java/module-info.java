module es.etg.dax {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens es.etg.dax.ende.view to javafx.fxml;
    opens es.etg.dax.ende.model to javafx.base;

    exports es.etg.dax.ende.view;
}