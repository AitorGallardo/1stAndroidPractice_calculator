package com.example.aitor.calculadora;


import static com.example.aitor.calculadora.MainActivity.*;

public class Operations {


		// MainActivity layoutElements;
				
		// Operations(MainActivity theLayoutElements;) {

		// 	this.layoutElements = theLayoutElements;
		// }

    void checkOperation(){

    	if(operationType!=null&&resultatDeLaOperacio!=null&&resultatConcatenat2!=null){
    		operador();
    	}
    }

    void suma() {

    	checkOperation();

        if(resultatDeLaOperacio!=null){
            operating = true;
            operationType = "suma";
            if(resultatConcatenat2!=null){
            	operador();
            	resultatConcatenat2=null;
            }
        }
    }
    void resta() {

    	checkOperation();

        if(resultatDeLaOperacio!=null){
            operating = true;
            operationType = "resta";
            if(resultatConcatenat2!=null){
            	operador();
            	resultatConcatenat2=null;
            }
        }
    }

    void multiplicacio() {

    	checkOperation();

        if(resultatDeLaOperacio!=null){
            operating = true;
            operationType = "multiplicacio";
            if(resultatConcatenat2!=null){
            	operador();
            	resultatConcatenat2=null;
            }
        }
    }

    void divisio() {

    	checkOperation();

        if(resultatDeLaOperacio!=null){
            operating = true;
            operationType = "divisio";
            if(resultatConcatenat2!=null){
            	operador();
            	resultatConcatenat2=null;
            }
        }
    }

/*    String resultat() {

        if (operating) {
            switch (operationType) {
                case "suma": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) + Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "resta": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) - Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "multiplicacio": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) * Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "divisio": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) / Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
            }
            operating = false;
            resultatConcatenat2 = "";
            return resultatDeLaOperacio;
        } else {
            return resultatConcatenat;
        }
    }*/

    void operador() {

        if (operating) {
            switch (operationType) {
                case "suma": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) + Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "resta": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) - Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "multiplicacio": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) * Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
                case "divisio": {
                    operadorAuxiliar = Double.parseDouble(resultatDeLaOperacio) / Double.parseDouble(resultatConcatenat2);
                    if (operadorAuxiliar - Math.floor(operadorAuxiliar) != 0) {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar);
                    } else {
                        resultatDeLaOperacio = String.valueOf(operadorAuxiliar.intValue());
                    }
                    operationType = null;
                }
                break;
            }
        }

    }







}