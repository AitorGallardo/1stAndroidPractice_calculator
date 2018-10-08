package com.example.aitor.calculadora;

import android.text.Layout;

public class Operations {

    LayoutElements elementos;

    Operations (LayoutElements losElementos) {
        this.elementos = losElementos;
    }

    void suma() {
        elementos.operating=true;
        elementos.operationType="suma";
        elementos.viewResultat.setText("");
    }
    void resta() {
        elementos.operating=true;
        elementos.operationType="resta";
        elementos.viewResultat.setText("");
    }
    void multiplicacio() {
        elementos.operating=true;
        elementos.operationType="multiplicacio";
        elementos.viewResultat.setText("");
    }
    void divisio() {
        elementos.operating=true;
        elementos.operationType="divisio";
        elementos.viewResultat.setText("");
    }
    String resultat() {

        if(elementos.operating){
            switch(elementos.operationType){
                case "suma": elementos.resultatDeLaOperacio = String.valueOf(Integer.parseInt(elementos.resultatConcatenat) + Integer.parseInt(elementos.resultatConcatenat2));
                    break;
                case "resta": elementos.resultatDeLaOperacio = String.valueOf(Integer.parseInt(elementos.resultatConcatenat) - Integer.parseInt(elementos.resultatConcatenat2));
                    break;
                case "multiplicacio": elementos.resultatDeLaOperacio = String.valueOf(Integer.parseInt(elementos.resultatConcatenat) * Integer.parseInt(elementos.resultatConcatenat2));
                    break;
                case "divisio": elementos.resultatDeLaOperacio = String.valueOf(Integer.parseInt(elementos.resultatConcatenat) % Integer.parseInt(elementos.resultatConcatenat2));
                    break;
            }
            elementos.operating=false;
            return elementos.resultatDeLaOperacio;
        } else {
            return elementos.resultatConcatenat;
        }
    }
}
