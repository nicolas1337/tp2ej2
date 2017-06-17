package com.eetsn4.nicolasarroyo.tp2ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.numero1);
        num2=(EditText)findViewById(R.id.numero2);
        resultado=(TextView)findViewById(R.id.txtResultado);
    }
    public void Sumar(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int suma= n1 + n2;
        resultado.setText(""+suma);
    }
    public void Restar(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int resta= n1 - n2;
        resultado.setText(""+resta);
    }
    public void Multiplicar(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int multiplicar= n1 * n2;
        resultado.setText(""+multiplicar);
    }
    public void Dividir(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        if (n2==0){
            Toast toast=Toast.makeText(this,"No es posible divir por 0",Toast.LENGTH_SHORT);
            toast.show();
        }else {
            int dividir = n1 / n2;
            resultado.setText("" + dividir);
        }
    }
}
