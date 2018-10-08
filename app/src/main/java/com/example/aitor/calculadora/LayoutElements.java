package com.example.aitor.calculadora;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
public class LayoutElements extends AppCompatActivity {

    Button buttonN1, buttonN2, buttonN3, buttonN4, buttonN5, buttonN6, buttonN7, buttonN8, buttonN9, buttonN0;
    Button buttonSuma, buttonResta, buttonMultiplicacio, buttonDivisio, buttonResultat, buttonCE;
    TextView viewResultat;

    static String resultatConcatenat="";
    static String resultatConcatenat2="";
    static boolean operating = false;
    static String operationType = "";
    static String resultatDeLaOperacio="";

    Operations calculation = new Operations(this);
    EventListener listener = new EventListener(this,calculation);
    Bundle savedInstanceState = new Bundle();

    LayoutElements() {
    }

    protected void onCreate() {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonN1 = (Button) findViewById(R.id.buttonN1);
        buttonN2 = (Button) findViewById(R.id.buttonN2);
        buttonN3 = (Button) findViewById(R.id.buttonN3);
        buttonN4 = (Button) findViewById(R.id.buttonN4);
        buttonN5 = (Button) findViewById(R.id.buttonN5);
        buttonN6 = (Button) findViewById(R.id.buttonN6);
        buttonN7 = (Button) findViewById(R.id.buttonN7);
        buttonN8 = (Button) findViewById(R.id.buttonN8);
        buttonN9 = (Button) findViewById(R.id.buttonN9);
        buttonN0 = (Button) findViewById(R.id.buttonN0);
        buttonSuma = (Button) findViewById(R.id.buttonSuma);
        buttonResta = (Button) findViewById(R.id.buttonResta);
        buttonDivisio = (Button) findViewById(R.id.buttonDivisio);
        buttonMultiplicacio = (Button) findViewById(R.id.buttonMultiplicacio);
        buttonResultat = (Button) findViewById(R.id.buttonResultat);
        buttonCE = (Button) findViewById(R.id.buttonCE);

        viewResultat = (TextView) findViewById(R.id.resultat);

        buttonN1.setOnClickListener(listener);
        buttonN2.setOnClickListener(listener);
        buttonN3.setOnClickListener(listener);
        buttonN4.setOnClickListener(listener);
        buttonN5.setOnClickListener(listener);
        buttonN6.setOnClickListener(listener);
        buttonN7.setOnClickListener(listener);
        buttonN8.setOnClickListener(listener);
        buttonN9.setOnClickListener(listener);
        buttonN0.setOnClickListener(listener);
        buttonSuma.setOnClickListener(listener);
        buttonResta.setOnClickListener(listener);
        buttonDivisio.setOnClickListener(listener);
        buttonMultiplicacio.setOnClickListener(listener);
        buttonMultiplicacio.setOnClickListener(listener);
        buttonResultat.setOnClickListener(listener);
        buttonCE.setOnClickListener(listener);


    }
}
