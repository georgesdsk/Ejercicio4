package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonNext;
    Button buttonPrevious;
    ImageView imagen;
    int contadorImagen;
    Integer[] imagenes= {R.drawable.foto1, R.drawable.foto2, R.drawable.foto4};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = findViewById(R.id.imagen);

    }


    public void siguienteImagen(View view) {

        if (contadorImagen<2){
            contadorImagen++;
        }else{
            contadorImagen = 0;
        }
        imagen.setImageResource(imagenes[contadorImagen]);


    }

    public void anteriorImagen(View view) {


        if (contadorImagen>0){
            contadorImagen--;
        }else{
            contadorImagen = 2;
        }
        imagen.setImageResource(imagenes[contadorImagen]);


    }
}