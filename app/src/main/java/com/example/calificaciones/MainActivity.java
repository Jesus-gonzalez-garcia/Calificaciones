package com.example.calificaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMenu1;
    private Button btnMenu2;
    private Button btnMenu3;
    private Button btnMenu4;
    private Button btnMenu5;
    private Button btnMenu6;
    private Button btnMenu7;
    private Button btnMenu8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu1 = findViewById(R.id.btn_menu1);
        btnMenu2 = findViewById(R.id.btn_menu2);
        btnMenu3 = findViewById(R.id.btn_menu3);
        btnMenu4 = findViewById(R.id.btn_menu4);
        btnMenu5 = findViewById(R.id.btn_menu5);
        btnMenu6 = findViewById(R.id.btn_menu6);
        btnMenu7 = findViewById(R.id.btn_menu7);
        btnMenu8 = findViewById(R.id.btn_menu8);

        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_geografia,"La geografía sirve para estudiar y comprender los fenómenos que ocurren en la superficie del planeta Tierra, como la migración o el clima, además de estudiar la localización de países o recursos naturales.");
            }
        });

        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_fiscac,"Se trata de la ciencia que estudia las propiedades de la naturaleza con el apoyo de la matemática. La física se encarga de analizar las características de la energía, el tiempo y la materia, así como también los vínculos que se establecen entre ellos.");

            }
        });

        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_matematicas,"La matemática es la ciencia deductiva que se dedica al estudio de las propiedades de los entes abstractos y de sus relaciones. Esto quiere decir que las matemáticas trabajan con números, símbolos, figuras geométricas, etc.");

            }
        });

        btnMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_espa,"El español es una lengua flexiva de tipo fusional, es decir, en las oraciones se usa preferentemente la flexión para indicar las relaciones entre sus elementos. Sin embargo, como la mayoría de las lenguas funcionales, también recurre al uso de preposiciones, palabras abstractas que sirven de nexo y son invariables.");


            }
        });

        btnMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_naturales,"Las ciencias naturales buscan entender el funcionamiento del universo y el mundo que nos rodea. Se pueden distinguir cinco ramas principales: Física, Química, Astronomía, Geología y Biología.");


            }
        });

        btnMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_deporte,"Educación física es una disciplina que se centra en diferentes movimientos corporales para perfeccionar, controlar y mantener la salud mental y física del ser humano. ... La educación física es una actividad obligatoria tanto en la primaria como en la secundaria.");

            }
        });

        btnMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_civica,"Se ocupa del ámbito del conocimiento moral que tiene como objetivo principal la COMPRENSIÓN DEL CARÁCTER ÉTICO del ser humano, tanto en su dimensión personal como en su proyección social, así como el aprendizaje de actitudes tolerantes y solidarias.");

            }
        });

        btnMenu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(R.drawable.ic_biologo,"La materia se define como todo aquello que ocupa un lugar en el espacio y tiene masa. ... Toda la materia está compuesta por partículas diminutas. Según sus características y su tamaño, estas partículas se denominan átomos, iones,moléculas etc");

            }
        });


    }
    private void sendData(int image,String data){

        Bundle bundle=new Bundle();
        bundle.putInt("img",image);
        bundle.putString("data",data);
        Intent goToSignin = new Intent(MainActivity.this, DetailsActivity.class);
        goToSignin.putExtras(bundle);
        startActivity(goToSignin);
    }
}
