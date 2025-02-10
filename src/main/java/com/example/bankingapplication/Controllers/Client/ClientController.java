package com.example.bankingapplication.Controllers.Client;

import com.example.bankingapplication.Models.model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane Client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener(((observableValue, oldval, newVal) -> {
            switch (newVal){
                case "Transactions" -> Client_parent.setCenter(model.getInstance().getViewFactory().getTransactionview());
                default ->  Client_parent.setCenter(model.getInstance().getViewFactory().getDashboardview());
            }
        } ));
    }
}
