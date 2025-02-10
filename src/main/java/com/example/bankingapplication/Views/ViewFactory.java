package com.example.bankingapplication.Views;

import com.example.bankingapplication.Controllers.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardview;
    private AnchorPane transactionview;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashboardview() {
        if (dashboardview == null) {
            try {
                dashboardview = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardview;
    }

    public AnchorPane getTransactionview() {
        if(transactionview == null) {

            try{
                transactionview = new FXMLLoader(getClass().getResource("/Fxml/Client/Transactions.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
        return transactionview;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindows(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("AmenBank Application");
        stage.show();
    }
    public void closeStage(Stage stage){
        stage.close();
    }
}
