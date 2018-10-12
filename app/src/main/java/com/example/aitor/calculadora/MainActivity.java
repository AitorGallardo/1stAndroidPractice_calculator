package com.example.aitor.calculadora;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonN1, buttonN2, buttonN3, buttonN4, buttonN5, buttonN6, buttonN7, buttonN8, buttonN9, buttonN0;
    Button buttonSuma, buttonResta, buttonMultiplicacio, buttonDivisio, buttonResultat, buttonCE, buttonBack, buttonComma;
    TextView viewResultat;

    String firstInput_FinalResult = "";
    boolean firstInputComma = false;
    String secondInput = "";
    boolean secondInputComma=false;
    boolean isOperating = false; // it handles whenever a operation button is pressed and decides when secondInput has to be introduced
    String operationType = "";
    Double operadorAuxiliar;


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
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "1"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "1"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN2: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "2"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "2"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN3: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "3"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "3"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN4: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "4"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "4"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN5: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "5"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "5"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN6: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "6"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "6"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN7: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "7"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "7"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN8: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "8"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "8"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN9: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "9"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "9"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonN0: {
                if (isOperating) {
                    switch(checkInputSize(secondInput)) {
						case true: viewResultat.setText(secondInput += "0"); 
							break;
						case false: viewResultat.setText(secondInput);
							break;	
					}

                } else {
				    switch(checkInputSize(firstInput_FinalResult)) {
				    	case true: viewResultat.setText(firstInput_FinalResult += "0"); 
				    		break;
				    	case false: viewResultat.setText(firstInput_FinalResult);
				    		break;	
				    }
                }
            }
            break;
            case R.id.buttonSuma:
                suma();
                break;
            case R.id.buttonResta:
                resta();
                break;
            case R.id.buttonMultiplicacio:
                multiplicacio();
                break;
            case R.id.buttonDivisio:
                divisio();
                break;
            case R.id.buttonResultat:
                checkOperation();
                break;
            case R.id.buttonCE: {
                firstInput_FinalResult = "";
                firstInputComma=false;
                secondInput = "";
                secondInputComma=false;
                isOperating = false;
                viewResultat.setText(firstInput_FinalResult);
            }
            break;
            case R.id.buttonComma: {
                if (isOperating) {
                    if (secondInputComma==false) {
                        if(secondInput != ""){
                            viewResultat.setText(secondInput += ".");
                        } else {
                            viewResultat.setText(secondInput += "0.");
                        }
                        secondInputComma=true;
                    }
                } else {
                    if (firstInputComma==false) {
                        if(firstInput_FinalResult != ""){
                            viewResultat.setText(firstInput_FinalResult += ".");
                        } else {
                            viewResultat.setText(firstInput_FinalResult += "0.");
                        }
                        firstInputComma=true;
                    }
                }
            }
            break;
            case R.id.buttonBack:
                back();
                break;
        }
    }

    // BUTTON 0

                case R.id.buttonN0: {
                if (isOperating) {
                    viewResultat.setText(secondInput += "0");
                } else {
                	if(checkInputSize(firstInput_FinalResult)){
                		viewResultat.setText(firstInput_FinalResult += "0");
                	} else { viewResultat.setText(firstInput_FinalResult); } 
                }
            }



    swith(checkInputSize(secondInput)) {
    	case true: viewResultat.setText(secondInput += "9"); 
    		break;
    	case false: viewResultat.setText(secondInput);
    		break;	
    }


    boolean checkInputSize(String InputSize) {

    	if (InputSize.length() > 30) {
    		return false;
    	} else {
    		return true;
    	}
    }

    void back() {

        if (secondInput.length() > 0) {

            secondInput = secondInput.substring(0, secondInput.length() - 1);
            viewResultat.setText(secondInput);
        } else {
            if (isOperating==false&&firstInput_FinalResult.length() > 0) {
                firstInput_FinalResult = firstInput_FinalResult.substring(0, firstInput_FinalResult.length() - 1);
                viewResultat.setText(firstInput_FinalResult);
            }
        }

    }

    // operations

    void checkOperation () {

        if (operationType != "" && firstInput_FinalResult != "" && secondInput != "") {
            operationHandler();
            viewResultat.setText(firstInput_FinalResult);
        }
    }

    void suma () {

        checkOperation();

        if (firstInput_FinalResult != "") {
            isOperating = true;
            operationType = "suma";
        }
    }
    void resta () {

        checkOperation();

        if (firstInput_FinalResult != "") {
            isOperating = true;
            operationType = "resta";
        }
    }

    void multiplicacio () {

        checkOperation();

        if (firstInput_FinalResult != "") {
            isOperating = true;
            operationType = "multiplicacio";
        }
    }

    void divisio () {

        checkOperation();

        if (firstInput_FinalResult != "") {
            isOperating = true;
            operationType = "divisio";
        }
    }

    void operationHandler () {

        switch (operationType) {
            case "suma": {
                operadorAuxiliar = Double.parseDouble(firstInput_FinalResult) + Double.parseDouble(secondInput);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar);
                } else {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                secondInput = "";
                secondInputComma = false;
            }
            break;
            case "resta": {
                operadorAuxiliar = Double.parseDouble(firstInput_FinalResult) - Double.parseDouble(secondInput);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar);
                } else {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                secondInput = "";
                secondInputComma = false;
            }
            break;
            case "multiplicacio": {
                operadorAuxiliar = Double.parseDouble(firstInput_FinalResult) * Double.parseDouble(secondInput);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar);
                } else {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                secondInput = "";
                secondInputComma = false;
            }
            break;
            case "divisio": {
                operadorAuxiliar = Double.parseDouble(firstInput_FinalResult) / Double.parseDouble(secondInput);
                if ((operadorAuxiliar - Math.floor(operadorAuxiliar) != 0)||(operadorAuxiliar.intValue()>2147483600)) {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar);
                } else {
                    firstInput_FinalResult = String.valueOf(operadorAuxiliar.intValue());
                }
                operationType = "";
                secondInput = "";
                secondInputComma = false;
            }
            break;
        }
    }


}


