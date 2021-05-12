package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_salario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){

        txt_salario = findViewById(R.id.txt_salario);
        double salario = Double.parseDouble(txt_salario.getText().toString());

        double salario1 = salario + ((salario*5)/100);
        double salario2 = salario1 - ((salario1*7)/100);

        Toast.makeText(MainActivity.this, "O salário a receber é de : " + salario2 + "Kzs", Toast.LENGTH_SHORT).show();
    }
}