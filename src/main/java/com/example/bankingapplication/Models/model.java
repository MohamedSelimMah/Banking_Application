package com.example.bankingapplication.Models;

import com.example.bankingapplication.Views.ViewFactory;

public class model {
    private final ViewFactory viewFactory;
    private static model instance;

    private  model(){
        this.viewFactory = new ViewFactory();
    }
    public static model getInstance(){
        if(instance == null){
            instance = new model();
        }
        return instance;
    }
    public ViewFactory getViewFactory(){
        return viewFactory;
    }
}
