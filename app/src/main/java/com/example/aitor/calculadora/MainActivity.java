package com.example.aitor.calculadora;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static Button buttonN1, buttonN2, buttonN3, buttonN4, buttonN5, buttonN6, buttonN7, buttonN8, buttonN9, buttonN0;
    static Button buttonSuma, buttonResta, buttonMultiplicacio, buttonDivisio, buttonResultat, buttonCE, buttonBack, buttonComma;
    static TextView viewResultat;

    static String resultatDeLaOperacio = "";
    static boolean firstNumberComma = false;
    static String resultatConcatenat2 = "";
    static boolean secondNumberComma=false;
    static boolean operating = false;
    static String operationType = "";
    static Double operadorAuxiliar;
    static boolean delete = false;

    Operators calculate = new Operators();


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
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonComma = (Button) findViewById(R.id.buttonComma);

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
        buttonBack.setOnClickListener(this);
        buttonComma.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonN1: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "1");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "1");
                }
            }
            break;
            case R.id.buttonN2: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "2");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "2");
                }
            }
            break;
            case R.id.buttonN3: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "3");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "3");
                }
            }
            break;
            case R.id.buttonN4: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "4");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "4");
                }
            }
            break;
            case R.id.buttonN5: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "5");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "5");
                }
            }
            break;
            case R.id.buttonN6: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "6");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "6");
                }
            }
            break;
            case R.id.buttonN7: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "7");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "7");
                }
            }
            break;
            case R.id.buttonN8: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "8");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "8");
                }
            }
            break;
            case R.id.buttonN9: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "9");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "9");
                }
            }
            break;
            case R.id.buttonN0: {
                if (operating) {
                    viewResultat.setText(resultatConcatenat2 += "0");
                } else {
                    viewResultat.setText(resultatDeLaOperacio += "0");
                }
            }
            break;
            case R.id.buttonSuma:
                calculate.suma();
                break;
            case R.id.buttonResta:
                calculate.resta();
                break;
            case R.id.buttonMultiplicacio:
                calculate.multiplicacio();
                break;
            case R.id.buttonDivisio:
                calculate.divisio();
                break;
            case R.id.buttonResultat:
                calculate.checkOperation();
                break;
            case R.id.buttonCE: {
                resultatDeLaOperacio = "";
                firstNumberComma=false;
                resultatConcatenat2 = "";
                secondNumberComma=false;
                operating = false;
                viewResultat.setText(resultatDeLaOperacio);
            }
            break;
            case R.id.buttonComma: {
                if (operating) {
                    if (secondNumberComma==false) {
                        if(resultatConcatenat2 != ""){
                            viewResultat.setText(resultatConcatenat2 += ".");
                        } else {
                            viewResultat.setText(resultatConcatenat2 += "0.");
                        }
                        secondNumberComma=true;
                    }
                } else {
                    if (firstNumberComma==false) {
                        if(resultatDeLaOperacio != ""){
                            viewResultat.setText(resultatDeLaOperacio += ".");
                        } else {
                            viewResultat.setText(resultatDeLaOperacio += "0.");
                        }
                        firstNumberComma=true;
                    }
                }
            }
            break;
            case R.id.buttonBack:
                calculate.back();
                break;
        }
    }

}


