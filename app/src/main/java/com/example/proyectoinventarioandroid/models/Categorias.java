package com.example.proyectoinventarioandroid.models;

public class Categorias {
    private String nombrecategoria;
    private String descripcioncategoria;

    public Categorias(String nombrecategoria, String descripcioncategoria) {
        this.nombrecategoria = nombrecategoria;
        this.descripcioncategoria = descripcioncategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public String getDescripcioncategoria() {
        return descripcioncategoria;
    }

    public void setDescripcioncategoria(String descripcioncategoria) {
        this.descripcioncategoria = descripcioncategoria;
    }

    public String infoCategorias(){
        return "*** Info Categorias ***\n" +
                "\t Nombre: " + this.getNombrecategoria() + "\n" +
                "\t Descripcion: " + this.getDescripcioncategoria() + "\n" +
                "*** Fin Info Categorias ***";
    }
}
