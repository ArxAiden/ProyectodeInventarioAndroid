package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectoinventarioandroid.models.EstructuraCrear;
import com.example.proyectoinventarioandroid.models.Categorias;

import java.util.ArrayList;
import java.util.List;

public class CategoriasForm extends AppCompatActivity {

    public static ArrayList<CategoriasForm> listaCategoria=new ArrayList<>();
    public ArrayList<String> listaNombresCategoria;
    public ListView lViewFCat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoriasform);


    }
    public void cargarListView(){
        final EstructuraCrear db = new EstructuraCrear(getApplicationContext());
        listaNombresCategoria=new ArrayList<>();
        listaCategoria=db.reCategoria();
        lViewFCat = findViewById(R.id.lViewFCat);
        for(CategoriasForm r:listaCategoria){
            listaNombresCategoria.add(r.getCodcategorias()+" -- "+r.getNombrecategoria());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaNombresCategoria);
        lViewFCat.setAdapter(adapter);
    }


}