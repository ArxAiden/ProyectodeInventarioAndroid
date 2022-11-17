package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Categoria_nuevo extends AppCompatActivity {

    public static ArrayList<Categorias> listaCategoria=new ArrayList<>();
    public ArrayList<String> listaNombresCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_nuevo);
    }
}