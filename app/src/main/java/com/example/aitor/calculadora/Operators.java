package com.example.aitor.calculadora;

import static com.example.aitor.calculadora.MainActivity.*;

public class Operators {


    void back() {

        if (resultatConcatenat2.length() > 0) {

            resultatConcatenat2 = resultatConcatenat2.substring(0, resultatConcatenat2.length() - 1);
            viewResultat.setText(resultatConcatenat2);
        } else {
            if (operating==false&&resultatDeLaOperacio.length() > 0) {
                // Log.d("K=LOngitud",String.valueOf(resultatDeLaOperacio.length()) );
                resultatDeLaOperacio = resultatDeLaOperacio.substring(0, resultatDeLaOperacio.length() - 1);
                viewResultat.setText(resultatDeLaOperacio);
            }
        }

    }

    void checkOperation () {

        if (operationType != "" && resultatDeLaOperacio != "" && resultatConcatenat2 != "") {
            operador();
            viewResultat.setText(resultatDeLaOperacio);
        }
    }

    void suma () {

        checkOperation();

        if (resultatDeLaOperacio != "") {
            operating = true;
            operationType = "suma";
        }
    }
    void resta () {

        checkOperation();

        if (resultatDeLaOperacio != "") {
            operating = true;
            operationType = "resta";
        }
    }

    void multiplicacio () {

        checkOperation();

        if (resultatDeLaOperacio != "") {
            operating = true;
            operationType = "multiplicacio";
        }
    }

    void divisio () {

        checkOperation();

        if (resultatDeLaOperacio != "") {
            operating = true;
            operationType = "divisio";
        }
    }
    void operador () {

        switch (operationType) {
            case "suma": {
                operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) + Double.parseDouble(resultatConcatenat2);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                } else {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                resultatConcatenat2 = "";
                secondNumberComma = false;
            }
            break;
            case "resta": {
                operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) - Double.parseDouble(resultatConcatenat2);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                } else {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                resultatConcatenat2 = "";
                secondNumberComma = false;
            }
            break;
            case "multiplicacio": {
                operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) * Double.parseDouble(resultatConcatenat2);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                } else {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                resultatConcatenat2 = "";
                secondNumberComma = false;
            }
            break;
            case "divisio": {
                operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) / Double.parseDouble(resultatConcatenat2);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                } else {
                    resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                resultatConcatenat2 = "";
                secondNumberComma = false;
            }
            break;
        }
    }
}
