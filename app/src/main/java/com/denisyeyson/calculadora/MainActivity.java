package com.denisyeyson.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView operacion,resultado;
    Button borrar,borrarTodo,porcentaje,division,multiplicacion,resta,suma,igual,info,punto,num0,num1,num2,num3,num4,num5,num6,num7,num8,num9;

    String acumOperacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operacion = findViewById(R.id.txtOperacion);
        resultado = findViewById(R.id.txtResultado);
        borrarTodo = findViewById(R.id.btnClearAll);
        borrar = findViewById(R.id.btnClear);

        num0 = findViewById(R.id.btnNum0);
        num1 = findViewById(R.id.btnNum1);
        num2 = findViewById(R.id.btnNum2);
        num3 = findViewById(R.id.btnNum3);
        num4 = findViewById(R.id.btnNum4);
        num5 = findViewById(R.id.btnNum5);
        num6 = findViewById(R.id.btnNum6);
        num7 = findViewById(R.id.btnNum7);
        num8 = findViewById(R.id.btnNum8);
        num9 = findViewById(R.id.btnNum9);

        porcentaje = findViewById(R.id.btnPorcentaje);
        division = findViewById(R.id.btnDividir);
        multiplicacion = findViewById(R.id.btnMultiplicar);
        resta = findViewById(R.id.btnResta);
        suma = findViewById(R.id.btnSuma);
        igual = findViewById(R.id.btnIgual);

        info = findViewById(R.id.btnInfo);
        punto = findViewById(R.id.btnPunto);

        borrarTodo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion="";
                operacion.setText(acumOperacion);
                resultado.setText(acumOperacion);
            }
        });
        borrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion = operacion.getText().toString();
                int size = acumOperacion.length()-1;
                if(size > -1){
                    acumOperacion = acumOperacion.substring(0,size);
                    operacion.setText(acumOperacion);
                }
            }
        });

        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Developer: Espinoza Ponciano Denis Y.\nCurso: Programacion Movil\nVersion: 1.0", Toast.LENGTH_SHORT).show();
            }
        });
        num0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"9");
            }
        });
        punto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+".");
            }
        });
        //Acciones a botones de operaciones
        porcentaje.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+" % ");
            }
        });

        division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"÷");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"x");
            }
        });
        resta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"-");
            }
        });
        suma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion=operacion.getText().toString();
                operacion.setText(acumOperacion+"+");
            }
        });

        igual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                acumOperacion = operacion.getText().toString();
                StringBuilder hh = new StringBuilder();
                for (char ch:acumOperacion.toCharArray()) {
                    String caracter = ch+"";
                    boolean isNumeric = caracter.matches("[.]?\\d*(\\.\\d+)?");
                    if(isNumeric){
                        hh.append(caracter);
                    }else{
                        hh.append(";"+caracter+";");
                    }
                }
                String[] opr = hh.toString().split(";");
                /*for (String f:hh.toString().split(";")) {
                    System.out.println(f);
                }*/
                double n1 = Double.parseDouble(opr[0]);
                double n2 = Double.parseDouble(opr[2]);
                double res=0;
                switch (opr[1]){
                    case "÷":res=n1/n2;break;
                    case "x":res=n1*n2;break;
                    case "+":res=n1+n2;break;
                    case "-":res=n1-n2;break;
                }
                if(res%1==0){
                    resultado.setText(((int)res)+"");
                }else{
                    resultado.setText(res+"");
                }
            }
        });

    }
    public double operacionSuma(int n1,int n2){
        return n1+n2;
    }
    public double operacionResta(int n1,int n2){
        return n1-n2;
    }
    public double operacionMultiplicacion(int n1,int n2){
        return n1*n2;
    }
    public double operacionDivision(int n1,int n2){
        return n1/n2;
    }
}