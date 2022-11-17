package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Categoria_nuevo extends AppCompatActivity {

    public static ArrayList<CategoriasForm> listaCategoria=new ArrayList<>();
    public ArrayList<String> listaNombresCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_nuevo);
    }
}