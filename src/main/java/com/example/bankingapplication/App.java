package com.example.bankingapplication;

import com.example.bankingapplication.Models.model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        model.getInstance().getViewFactory().showLoginWindow();
    }
}

