package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;


public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void crearCategoria(View v){
        Intent iCategoria=new Intent(MainActivity.this,Categoria_nuevo.class);
        startActivity(iCategoria);
    }

    public void crearMarca(View v){
        Intent iMarca=new Intent(MainActivity.this,Marca_nuevo.class);
        startActivity(iMarca);
    }

    public void crearOrden(View v){
        Intent iOrden=new Intent(MainActivity.this,Marca_nuevo.class);
        startActivity(iOrden);
    }

    public void crearProducto(View v){
        Intent iProducto=new Intent(MainActivity.this,Marca_nuevo.class);
        startActivity(iProducto);
    }


}
