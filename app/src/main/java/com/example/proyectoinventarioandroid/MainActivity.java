package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectoinventarioandroid.models.EstructuraCrear;
import com.example.proyectoinventarioandroid.models.Usuarios;

public class MainActivity extends AppCompatActivity {
    private EstructuraCrear crearDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void crearCategoria(View v){
        Intent iCategoria=new Intent(MainActivity.this,Categoria_nuevo.class);
        startActivity(iCategoria);
    }


}
