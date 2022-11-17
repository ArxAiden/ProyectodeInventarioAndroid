package com.example.proyectoinventarioandroid.models;

public class Categorias {
    private String codcategorias;
    private String nombrecategoria;
    private String descripcioncategoria;

    public Categorias(String codcategorias, String nombrecategoria, String descripcioncategoria) {
        this.codcategorias = codcategorias;
        this.nombrecategoria = nombrecategoria;
        this.descripcioncategoria = descripcioncategoria;
    }

    public String getCodcategorias() {
        return codcategorias;
    }

    public void setCodcategorias(String codcategorias) {
        this.codcategorias = codcategorias;
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
                "\t Codigo: " + this.getCodcategorias() + "\n" +
                "\t Nombre: " + this.getNombrecategoria() + "\n" +
                "\t Descripcion: " + this.getDescripcioncategoria() + "\n" +
                "*** Fin Info Categorias ***";
    }
}
