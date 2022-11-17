package com.example.proyectoinventarioandroid.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class EstructuraCrear extends SQLiteOpenHelper {
    private final String crearProducto="create table tb_producto(" +
            "idproducto int primary key not null," +
            "idusuario TEXT not null," +
            "idmarca TEXT not null," +
            "idcategoria TEXT not null," +
            "stockproducto int not null," +
            "foreign key(idmarca) references tb_marca(idmarca)," +
            "foreign key(idcategoria) references tb_categoria(idcategoria)" +

            ")";
    private final String crearUsuario="create table tb_usuario(" +
            "idusuario TEXT primary key not null," +
            "nombreusuario TEXT not null," +
            "correousuario TEXT not null," +
            "passusuario TEXT not null," +
            "rutusuario int not null" +
            ")";
    private final String crearOrden="create table tb_orden(" +
            "idorden TEXT primary key not null," +
            "idproducto TEXT not null," +
            "idusuario TEXT not null," +
            "nombreorden TEXT not null," +
            "fechaorden date not null," +
            "foreign key(idproducto) references tb_producto(idproducto)," +
            "foreign key(idusuario) references tb_usuario(idusuario)" +
            ")";
    private final String crearCategoria="create table tb_categoria(" +
            "idcategoria TEXT primary key not null," +
            "nombrecategoria TEXT not null," +
            "descripcioncategoria TEXT not null" +
            ")";
    private final String crearMarca="create table tb_marca(" +
            "idmarca TEXT primary key not null," +
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


}
