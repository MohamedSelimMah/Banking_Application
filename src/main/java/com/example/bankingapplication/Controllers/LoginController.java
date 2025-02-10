package com.example.bankingapplication.Controllers;

import com.example.bankingapplication.Models.model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Label password_lbl;
    public ChoiceBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fild;
    public TextField password_fild;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) login_btn.getScene().getWindow();
        model.getInstance().getViewFactory().closeStage(stage);
        model.getInstance().getViewFactory().showClientWindows();
    }
}