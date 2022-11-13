package com.example.proyectoinventarioandroid.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class EstructuraCrear extends SQLiteOpenHelper {
    private final String crearProducto="create table tb_producto(" +
            "idproducto int primary key not null," +
            "idusuario TEXT not null," +
            "stockproducto int not null" +

            ")";
    private final String crearUsuario="create table tb_usuario(" +
            "idusuario TEXT primary key not null," +
            "nombreusuario TEXT not null," +
            "correousuario TEXT not null," +
            "rutusuario int not null" +
            ")";
    private final String crearOrden="create table tb_orden(" +
            "idorden TEXT primary key not null," +
            "idproducto TEXT not null," +
            "idusuario TEXT not null," +
            "nombreorden TEXT not null," +
            "fechaorden date not null" +

            ")";
    private final String crearCategoria="create table tb_Categoria(" +
            "idcategoria TEXT primary key not null," +
            "nombrecategoria TEXT not null," +
            ")";
    private final String crearMarca="create table tb_Marca(" +
            "idmarca TEXT primary key not null," +
            "nombremarca TEXT not null," +
            ")";
    public EstructuraCrear(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(crearProducto);
        sqLiteDatabase.execSQL(crearUsuario);
        sqLiteDatabase.execSQL(crearOrden);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists tb_producto");
        sqLiteDatabase.execSQL("drop table if exists tb_usuario");
        sqLiteDatabase.execSQL("drop table if exists tb_orden");
        sqLiteDatabase.execSQL(crearProducto);
        sqLiteDatabase.execSQL(crearUsuario);
        sqLiteDatabase.execSQL(crearOrden);
    }
}
