package com.example.aitor.calculadora;

import android.view.View;


public class EventListener implements View.OnClickListener {

    LayoutElements elementos;
    Operations calculate;


    EventListener(LayoutElements theElementos, Operations operation){
        this.elementos = theElementos;
        this.calculate = operation;
    }



    @Override
    public void onClick(View v) {
        switch( v.getId()){
            case R.id.buttonN1: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "1");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "1");
                }
            }
            break;
            case R.id.buttonN2: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "2");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "2");
                }
            }
            break;
            case R.id.buttonN3: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "3");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "3");
                }
            }
            break;
            case R.id.buttonN4: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "4");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "4");
                }
            }
            break;
            case R.id.buttonN5: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "5");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "5");
                }
            }
            break;
            case R.id.buttonN6: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "6");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "6");
                }
            }
            break;
            case R.id.buttonN7: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "7");
                } else {
                    elementos. viewResultat.setText(elementos.resultatConcatenat += "7");
                }
            }
            break;
            case R.id.buttonN8: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "8");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "8");
                }
            }
            break;
            case R.id.buttonN9: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "9");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "9");
                }
            }
            break;
            case R.id.buttonN0: {
                if(elementos.operating){
                    elementos.viewResultat.setText(elementos.resultatConcatenat2 += "0");
                } else {
                    elementos.viewResultat.setText(elementos.resultatConcatenat += "0");
                }
            }
            break;
            case R.id.buttonSuma: calculate.suma();
                break;
            case R.id.buttonResta: calculate.resta();
                break;
            case R.id.buttonMultiplicacio: calculate.multiplicacio();
                break;
            case R.id.buttonDivisio: calculate.divisio();
                break;
            case R.id.buttonResultat: elementos.viewResultat.setText(calculate.resultat());
                break;
            case R.id.buttonCE: {
                elementos.resultatDeLaOperacio = "";
                elementos.viewResultat.setText(elementos.resultatDeLaOperacio);
            }
            break;


        }
    }
}
