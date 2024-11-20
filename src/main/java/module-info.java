module com.example.bankingapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires de.jensd.fx.glyphs.fontawesome;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.bankingapplication to javafx.fxml;
    exports com.example.bankingapplication;
    exports com.example.bankingapplication.Controllers;
    exports com.example.bankingapplication.Controllers.Admin;
    exports com.example.bankingapplication.Controllers.Client;
    exports com.example.bankingapplication.Models;
    exports com.example.bankingapplication.Views;
}