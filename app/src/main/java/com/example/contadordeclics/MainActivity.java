package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int numClics = 0;
    int numClics1 = 0;
    int numClics2 = 0;
    int numClics3 = 0;
    int sumatotal= 0;


    ActivityMainBinding binding;
    private void actualizarSumaTotal() {
        sumatotal = numClics + numClics1 + numClics2 + numClics3;
        // Actualiza el TextView sumaTotalTextView con la nueva suma
        binding.contador1.setText(String.valueOf(sumatotal));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        numClics = 0;
        numClics1 = 0;
        numClics2 = 0;
        numClics3 = 0;

        binding.boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClics++;
                binding.contador2.setText(""+numClics+"");
                actualizarSumaTotal();
            }
        });
        binding.boton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClics=0;
                binding.contador2.setText(""+numClics+"");
                actualizarSumaTotal();
            }
        });
        binding.boton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics1++;
                // mostrar el contador en el TextView
                binding.contador3.setText(""+numClics1+"");
                actualizarSumaTotal();
            }
        });
        binding.boton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClics1=0;
                binding.contador3.setText(""+numClics1+"");
                actualizarSumaTotal();
            }
        });
        binding.boton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics2++;
                // mostrar el contador en el TextView
                binding.contador4.setText(""+numClics2+"");
                actualizarSumaTotal();
            }
        });
        binding.boton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics2=0;
                // mostrar el contador en el TextView
                binding.contador4.setText(""+numClics2+"");
                actualizarSumaTotal();
            }
        });
        binding.boton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics3++;
                // mostrar el contador en el TextView
                binding.contador5.setText(""+numClics3+"");
                actualizarSumaTotal();
            }
        });
        binding.boton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics3=0;
                // mostrar el contador en el TextView
                binding.contador5.setText(""+numClics3+"");
                actualizarSumaTotal();
            }
        });
        binding.boton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics3=0;
                // mostrar el contador en el TextView
                binding.contador5.setText(""+numClics3+"");
                actualizarSumaTotal();
            }
        });
        binding.boton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // aumentar el contador
                numClics3=0;
                // mostrar el contador en el TextView
                binding.contador5.setText(""+numClics3+"");
                actualizarSumaTotal();
            }
        });
        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClics = 0;
                numClics1 = 0;
                numClics2 = 0;
                numClics3 = 0;
                sumatotal = 0;

                binding.contador2.setText(String.valueOf(numClics));
                binding.contador3.setText(String.valueOf(numClics1));
                binding.contador4.setText(String.valueOf(numClics2));
                binding.contador5.setText(String.valueOf(numClics3));
                binding.contador1.setText(String.valueOf(sumatotal));
            }
        });
    }
}