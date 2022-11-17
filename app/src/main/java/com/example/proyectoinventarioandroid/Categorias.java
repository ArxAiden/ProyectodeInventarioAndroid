package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.proyectoinventarioandroid.models.EstructuraCrear;

import java.util.ArrayList;

public class Categorias extends AppCompatActivity {

    public static ArrayList<Categorias> listaCategoria=new ArrayList<>();
    public ArrayList<String> listaNombresCategoria;
    public ListView lViewFCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    public void cargarListView(){
        final EstructuraCrear db = new EstructuraCrear(getApplicationContext());
        listaNombresCategoria=new ArrayList<>();
        listaCategoria=db.reCategoria();
        lViewFCat = findViewById(R.id.lViewFCat);
        for(Categorias r:listaCategoria){
            listaNombresCategoria.add(r.getCodcategoria()+" -- "+r.getNombrecategoria());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaNombresCategoria);
        lViewFCat.setAdapter(adapter);

    }
}