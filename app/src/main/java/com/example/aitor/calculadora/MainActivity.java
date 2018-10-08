package com.example.aitor.calculadora;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button buttonN1, buttonN2, buttonN3, buttonN4, buttonN5, buttonN6, buttonN7, buttonN8, buttonN9, buttonN0;
    Button buttonSuma, buttonResta, buttonMultiplicacio, buttonDivisio, buttonResultat, buttonCE;
    TextView viewResultat;

    public String resultatConcatenat="";
    public String resultatConcatenat2="";
    boolean operating = false;
    public String operationType = "";
    String resultatDeLaOperacio="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        buttonN1.setOnClickListener(this);
        buttonN2.setOnClickListener(this);
        buttonN3.setOnClickListener(this);
        buttonN4.setOnClickListener(this);
        buttonN5.setOnClickListener(this);
        buttonN6.setOnClickListener(this);
        buttonN7.setOnClickListener(this);
        buttonN8.setOnClickListener(this);
        buttonN9.setOnClickListener(this);
        buttonN0.setOnClickListener(this);
        buttonSuma.setOnClickListener(this);
        buttonResta.setOnClickListener(this);
        buttonDivisio.setOnClickListener(this);
        buttonMultiplicacio.setOnClickListener(this);
        buttonMultiplicacio.setOnClickListener(this);
        buttonResultat.setOnClickListener(this);
        buttonCE.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch( v.getId()){
            case R.id.buttonN1: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "1");
                } else {
                    viewResultat.setText(resultatConcatenat += "1");
                }
            }
            break;
            case R.id.buttonN2: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "2");
                } else {
                    viewResultat.setText(resultatConcatenat += "2");
                }
            }
            break;
            case R.id.buttonN3: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "3");
                } else {
                    viewResultat.setText(resultatConcatenat += "3");
                }
            }
            break;
            case R.id.buttonN4: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "4");
                } else {
                    viewResultat.setText(resultatConcatenat += "4");
                }
            }
            break;
            case R.id.buttonN5: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "5");
                } else {
                    viewResultat.setText(resultatConcatenat += "5");
                }
            }
            break;
            case R.id.buttonN6: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "6");
                } else {
                    viewResultat.setText(resultatConcatenat += "6");
                }
            }
            break;
            case R.id.buttonN7: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "7");
                } else {
                    viewResultat.setText(resultatConcatenat += "7");
                }
            }
            break;
            case R.id.buttonN8: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "8");
                } else {
                    viewResultat.setText(resultatConcatenat += "8");
                }
            }
            break;
            case R.id.buttonN9: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "9");
                } else {
                    viewResultat.setText(resultatConcatenat += "9");
                }
            }
            break;
            case R.id.buttonN0: {
                if(operating){
                    viewResultat.setText(resultatConcatenat2 += "0");
                } else {
                    viewResultat.setText(resultatConcatenat += "0");
                }
            }
            break;
            case R.id.buttonSuma: suma();
                break;
            case R.id.buttonResta: resta();
                break;
            case R.id.buttonMultiplicacio: multiplicacio();
                break;
            case R.id.buttonDivisio: divisio();
                break;
            case R.id.buttonResultat: viewResultat.setText(resultat());
                break;
            case R.id.buttonCE: {
                resultatDeLaOperacio = "";
                viewResultat.setText(resultatDeLaOperacio);
            }
            break;


        }
    }

    void suma() {
        operating=true;
        operationType="suma";
        viewResultat.setText("");
    }
    void resta() {
        operating=true;
        operationType="resta";
        viewResultat.setText("");
    }
    void multiplicacio() {
        operating=true;
        operationType="multiplicacio";
        viewResultat.setText("");
    }
    void divisio() {
        operating=true;
        operationType="divisio";
        viewResultat.setText("");
    }
    String resultat() {

        if(operating){
            switch(operationType){
                case "suma": resultatDeLaOperacio = String.valueOf(Integer.parseInt(resultatConcatenat) + Integer.parseInt(resultatConcatenat2));
                    break;
                case "resta": resultatDeLaOperacio = String.valueOf(Integer.parseInt(resultatConcatenat) - Integer.parseInt(resultatConcatenat2));
                    break;
                case "multiplicacio": resultatDeLaOperacio = String.valueOf(Integer.parseInt(resultatConcatenat) * Integer.parseInt(resultatConcatenat2));
                    break;
                case "divisio": resultatDeLaOperacio = String.valueOf(Integer.parseInt(resultatConcatenat) % Integer.parseInt(resultatConcatenat2));
                    break;
            }
            operating=false;
            return resultatDeLaOperacio;
        } else {
            return resultatConcatenat;
        }
    }

}
