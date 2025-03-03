package com.example.bankingapplication.Controllers.Client;

import com.example.bankingapplication.Models.model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController  implements Initializable {
    public Button dashboard_btn;
    public Button transactions_btn;
    public Button profile_btn;
    public Button account_btn;
    public Button logout_btn;
    public Button report_btn;
    public Button accounts_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event -> onDashboard());
        transactions_btn.setOnAction(event -> onTransactions());
        accounts_btn.setOnAction(event -> onAccounts());
    }

    private void onDashboard() {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onTransactions() {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }
    private void onAccounts() {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }
}
