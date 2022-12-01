package com.example.proyectoinventarioandroid.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EstructuraCrear extends SQLiteOpenHelper {
    private final String crearProducto="create table tb_producto(" +
            "codproducto int primary key not null," +
            "nombreproducto TEXT not null," +
            "precioproducto TEXT not null," +
            "descripcionproducto TEXT not null," +
            "stockproducto int not null," +
            "foreign key(codmarca) references tb_marca(codmarca)," +
            "foreign key(codcategorias) references tb_categoria(codcategorias)" +
            ")";
    private final String crearUsuario="create table tb_usuario(" +
            "rutusuario TEXT primary key not null," +
            "nombreusuario TEXT not null," +
            "correousuario TEXT not null," +
            "passusuario TEXT not null" +
            ")";
    private final String crearOrden="create table tb_orden(" +
            "idorden TEXT primary key not null," +
            "fechaorden date not null," +
            "foreign key(codproducto) references tb_producto(codproducto)," +
            "foreign key(rut) references tb_usuario(rut)" +
            ")";
    private final String crearCategoria="create table tb_categoria(" +
            "codcategorias TEXT primary key not null," +
            "nombrecategoria TEXT not null," +
            "descripcioncategoria TEXT not null" +
            ")";
    private final String crearMarca="create table tb_marca(" +
            "codmarca TEXT primary key not null," +
            "nombremarca TEXT not null," +
            "descripcionmarca TEXT not null" +
            ")";

    public EstructuraCrear(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(crearProducto);
        sqLiteDatabase.execSQL(crearUsuario);
        sqLiteDatabase.execSQL(crearOrden);
        sqLiteDatabase.execSQL(crearCategoria);
        sqLiteDatabase.execSQL(crearMarca);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists tb_producto");
        sqLiteDatabase.execSQL("drop table if exists tb_usuario");
        sqLiteDatabase.execSQL("drop table if exists tb_orden");
        sqLiteDatabase.execSQL("drop table if exists tb_categoria");
        sqLiteDatabase.execSQL("drop table if exists tb_marca");
        sqLiteDatabase.execSQL(crearProducto);
        sqLiteDatabase.execSQL(crearUsuario);
        sqLiteDatabase.execSQL(crearOrden);
        sqLiteDatabase.execSQL(crearCategoria);
        sqLiteDatabase.execSQL(crearMarca);
    }

    //Estructura Categorias
    public Categorias buscarCategoria(Categorias cat){
        SQLiteDatabase db=this.getReadableDatabase(); //Lectura
        Categorias busqueda=null;
        Cursor cursor=db.rawQuery("select * from tb_categoria where codcategorias='"+cat.getCodcategorias()+"'",null);
        if(cursor.moveToNext()){
            while(cursor.isAfterLast()==false){
                String codcategorias=cursor.getString(0);
                String nombrecategoria=cursor.getString(1);
                String descripcioncategoria=cursor.getString(2);
                busqueda=new Categorias(codcategorias,nombrecategoria,descripcioncategoria);
                cursor.moveToNext();
            }
        }
        return busqueda;
    }
    public ArrayList<Categorias> listarCategoriasDB(){
        SQLiteDatabase db=this.getReadableDatabase(); //Lectura
        ArrayList<Categorias> listaCategorias=new ArrayList<>();
        Cursor cursor=db.rawQuery("select * from tb_categoria",null);
        if(cursor.moveToNext()){
            while(cursor.isAfterLast()==false){
                String codcategorias=cursor.getString(0);
                String nombrecategoria=cursor.getString(1);
                String descripcioncategoria=cursor.getString(2);
                listaCategorias.add(new Categorias(codcategorias,nombrecategoria,descripcioncategoria));
                cursor.moveToNext();
            }
        }
        return listaCategorias;
    }
    public String registrarCategorias(Categorias cat){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues valores=new ContentValues();
        valores.put("nombrecategoria",cat.getNombrecategoria());
        if(buscarCategoria(cat)==null){
            //insert
            valores.put("codcategorias",cat.getCodcategorias());
            db.insert("tb_categoria",null,valores);
            return "Registro Insertado Correctamente!";
        }else{
            //update
            db.update("tb_categoria",valores,"codcategorias='"+cat.getCodcategorias()+"'",null);
            return "Registro Actualizado Correctamente!";
        }
    }







}
