package com.example.proyectoinventarioandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class Categoria_nuevo extends AppCompatActivity {

    //private EstructuraCrear crearBD;
    //private ListView lViewCategoria;
    //private ArrayList<String> listaInfoCategorias;

    Button btnaddcat;
    EditText codCat, nombreCat, descCat;
    private FirebaseFirestore mfirestore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_nuevo);
        mfirestore = FirebaseFirestore.getInstance();

        this.setTitle("Crear Categoria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        codCat = findViewById(R.id.codcat);
        nombreCat = findViewById(R.id.nombrecat);
        descCat = findViewById(R.id.desccat);
        btnaddcat = findViewById(R.id.btnaddcat);

        btnaddcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codcat = codCat.getText().toString().trim();
                String nomcat = nombreCat.getText().toString().trim();
                String catdesc = descCat.getText().toString().trim();

                if(codcat.isEmpty() && nomcat.isEmpty() && catdesc.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Ingresar los datos", Toast.LENGTH_SHORT).show();
                }else{
                    postCat(codcat, nomcat, catdesc);
                }
            }
        });
    }

    private void postCat(String codcat, String nomcat, String catdesc) {
        Map<String, Object> map = new HashMap<>();
        map.put("codcat", codcat);
        map.put("nombrecat", nomcat);
        map.put("desccat", catdesc);

        mfirestore.collection("categorias").add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getApplicationContext(), "Creado exitosamente", Toast.LENGTH_SHORT).show();
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Error al ingresar", Toast.LENGTH_SHORT).show();
            }
        });
    }

}