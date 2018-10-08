package com.example.aitor.calculadora;

import android.util.EventLog;
import android.view.View;

public class Main {

    LayoutElements elements = new LayoutElements();
    Operations calulate = elements.calculation;
    EventListener listen = elements.listener;
    View view;


    public static void main(String[] args) {
        Main application = new Main();
        application.start();
    }
    public void start(){

        elements.onCreate();
        listen.onClick(view);
    }
}
