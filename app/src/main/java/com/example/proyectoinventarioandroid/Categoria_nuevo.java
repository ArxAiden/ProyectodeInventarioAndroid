package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import com.example.proyectoinventarioandroid.models.*;


public class Categoria_nuevo extends AppCompatActivity {

    private EstructuraCrear crearBD;
    private ListView lViewCategoria;
    private ArrayList<String> listaInfoCategorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_nuevo);
        crearBD=new EstructuraCrear(this,"bd_categoria",null,1);
        cargarListViewCategorías();

    }
    public void registrarCategorias(View v){
        EditText eCodCat=(EditText) findViewById(R.id.txtcodcat);
        EditText eNombreCat=(EditText) findViewById(R.id.txtnombrecat);
        EditText eCatDesc=(EditText) findViewById(R.id.txtcatdescripcion);
        String codcategoria=eCodCat.getText().toString();
        String nombrecategoria=eNombreCat.getText().toString();
        String descripcioncategoria=eCatDesc.getText().toString();
        Toast.makeText(this, crearBD.registrarCategorias(new Categorias(codcategoria,nombrecategoria,descripcioncategoria)), Toast.LENGTH_SHORT).show();
        cargarListViewCategorías();
    }
    public void cargarListViewCategorías(){
        lViewCategoria=(ListView) findViewById(R.id.listviewcategorias);
        listaInfoCategorias=new ArrayList<>();
        ArrayList<Categorias> listaCategorias=crearBD.listarCategoriasDB();
        if(!listaCategorias.isEmpty()){
            for(Categorias recorrer : listaCategorias){
                listaInfoCategorias.add(recorrer.getCodcategorias()+" , "+recorrer.getNombrecategoria()+ " , " +recorrer.getDescripcioncategoria());
            }
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaInfoCategorias);
        lViewCategoria.setAdapter(adapter);
    }


    public void volverMenu(View v){
        Intent iMenu=new Intent(Categoria_nuevo.this,MainActivity.class);
        startActivity(iMenu);
    }
}