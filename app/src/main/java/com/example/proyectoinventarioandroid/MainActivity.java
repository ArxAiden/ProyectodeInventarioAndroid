package com.example.proyectoinventarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoinventarioandroid.models.EstructuraCrear;

public class MainActivity extends AppCompatActivity {
    private EstructuraCrear crearDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
