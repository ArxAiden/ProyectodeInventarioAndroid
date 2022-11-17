package com.example.proyectoinventarioandroid.models;

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
            "foreign key(codcategoria) references tb_categoria(codcategoria)" +

            ")";
    private final String crearUsuario="create table tb_usuario(" +
            "codusuario TEXT primary key not null," +
            "nombreusuario TEXT not null," +
            "correousuario TEXT not null," +
            "passusuario TEXT not null," +
            "rutusuario int not null" +
            ")";
    private final String crearOrden="create table tb_orden(" +
            "idorden TEXT primary key not null," +
            "nombreorden TEXT not null," +
            "fechaorden date not null," +
            "foreign key(idproducto) references tb_producto(idproducto)," +
            "foreign key(idusuario) references tb_usuario(idusuario)" +
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
    public void agregarCategorias(String codcategorias, String nombrecategoria, String descripcioncategoria){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd != null){
            bd.execSQL("INSERT INTO categoria VALUES('"+codcategorias+"','"+nombrecategoria+"','"+descripcioncategoria+"')");
        }
    }
    public void agregarMarcas(String codmarca, String nombremarca, String descripcionmarca){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd != null){
            bd.execSQL("INSERT INTO categoria VALUES('"+codmarca+"','"+nombremarca+"','"+descripcionmarca+"')");
        }
    }
    public void agregarProducto(String codProducto, String nombreproducto, String precioproducto, String descripcionproducto, String stockproducto, Categorias nombrecategoria, Marcas nombremarca){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd != null){
            bd.execSQL("INSERT INTO categoria VALUES('"+codProducto+"','"+nombreproducto+"','"+precioproducto+"','"+descripcionproducto+"','"+stockproducto+"','"+nombrecategoria+"','"+nombremarca);
        }
    }
    public void agregarUsuario(String nombreusuario, String correousuario, String passusuario, String rutusuario){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd != null){
            bd.execSQL("INSERT INTO categoria VALUES('"+nombreusuario+"','"+correousuario+"','"+passusuario+"','"+rutusuario);
        }
    }
    public void agregarOrden(String nombreusuario, String correousuario, String passusuario, String rutusuario){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd != null){
            bd.execSQL("INSERT INTO categoria VALUES('"+nombreusuario+"','"+correousuario+"','"+passusuario+"','"+rutusuario);
        }
    }

    ////REGISTRAR EN ARRAY LISTS

    public ArrayList<Categorias> reCategoria(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from categoria",null);
        ArrayList<Categorias> listCategoria=new ArrayList<>();
        if(cursor.moveToNext()){
            while(!cursor.isAfterLast()){
                String codcategoria=cursor.getString(0);
                String nombrecategoria=cursor.getString(1);
                String descripcioncategoria=cursor.getString(2);
                listCategoria.add(new Categorias(codcategoria,nombrecategoria,descripcioncategoria));
                cursor.moveToNext();
            }
        }
        cursor.close();
        return listCategoria;
    }
    public ArrayList<Marcas> reMarcas(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from marcas",null);
        ArrayList<Marcas> listMarca=new ArrayList<>();
        if(cursor.moveToNext()){
            while(!cursor.isAfterLast()){
                String codmarca=cursor.getString(0);
                String nombremarca=cursor.getString(1);
                String descripcionmarca=cursor.getString(2);
                listMarca.add(new Marcas(codmarca,nombremarca,descripcionmarca));
                cursor.moveToNext();
            }
        }
        cursor.close();
        return listMarca;
    }

    public ArrayList<Productos> reProducto(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from productos",null);
        ArrayList<Productos> listProducto=new ArrayList<>();
        if(cursor.moveToNext()){
            while(!cursor.isAfterLast()){
                String codproducto=cursor.getString(0);
                String nombreproducto=cursor.getString(1);
                String precioproducto=cursor.getString(2);
                String descripcionproducto=cursor.getString(3);
                String stockproducto=cursor.getString(4);
                String nombrecategoria=cursor.getString(5);
                String nombremarca=cursor.getString(6);
                listProducto.add(new Productos(codproducto,nombreproducto,precioproducto,descripcionproducto,stockproducto,nombrecategoria,nombremarca));
                cursor.moveToNext();
            }
        }
        cursor.close();
        return listProducto;
    }

    ////BUSCAR



    public Categorias buscarCategoria(String codCategoria){
        for(Categorias re: reCategoria()){
            if(re.getCodcategorias().equalsIgnoreCase(codCategoria)){
                return re;
            }
        }
        return null;
    }
    public Marcas buscarMarca(String codCategoria){
        for(Marcas re: reMarcas()){
            if(re.getCodmarca().equalsIgnoreCase(codCategoria)){
                return re;
            }
        }
        return null;
    }

    public Productos buscarProducto(String codProducto){
        for(Productos re: reProducto()){
            if(re.getCodProducto().equalsIgnoreCase(codProducto)){
                return re;
            }
        }
        return null;
    }






}
