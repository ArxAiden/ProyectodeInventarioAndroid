package com.example.proyectoinventarioandroid.models;

public class Productos {
    private String codProducto;
    private String nombreproducto;
    private String precioproducto;
    private String descripcionproducto;
    private String stockproducto;
    private Categorias nombrecategoria;
    private Marcas nombremarca;

    public Productos(String codProducto, String nombreproducto, String precioproducto, String descripcionproducto, String stockproducto, Categorias nombrecategoria, Marcas nombremarca) {
        this.codProducto = codProducto;
        this.nombreproducto = nombreproducto;
        this.precioproducto = precioproducto;
        this.descripcionproducto = descripcionproducto;
        this.stockproducto = stockproducto;
        this.nombrecategoria = nombrecategoria;
        this.nombremarca = nombremarca;
    }

    public Productos(String codproducto, String nombreproducto, String precioproducto, String descripcionproducto, String stockproducto, String nombrecategoria, String nombremarca) {
    }
// Intentar ARreglar esto

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(String precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public String getStockproducto() {
        return stockproducto;
    }

    public void setStockproducto(String stockproducto) {
        this.stockproducto = stockproducto;
    }

    public Categorias getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(Categorias nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public Marcas getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(Marcas nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String infoProducto(){
        return "*** Info Producto ***\n" +
                "\t Codigo: " + this.getCodProducto() + "\n" +
                "\t Nombre: " + this.getNombreproducto() + "\n" +
                "\t Precio: " + this.getPrecioproducto() + "\n" +
                "\t Descripcion: " + this.getDescripcionproducto() + "\n" +
                "\t Stock: " + this.getStockproducto() + "\n" +
                "\t Categoria: " + this.getNombrecategoria() + "\n" +
                "\t Marca: " + this.getNombremarca() + "\n" +
                "*** Fin Info Producto ***";
    }
}
