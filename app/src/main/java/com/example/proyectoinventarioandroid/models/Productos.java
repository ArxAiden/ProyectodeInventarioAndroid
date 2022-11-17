package com.example.proyectoinventarioandroid.models;

public class Productos {
    private String Nombreproducto;
    private String PrecioProducto;
    private String DescripcionProducto;
    private String StockProducto;
    private Categorias nombrecategoria;
    private Marcas nombremarca;

    public Productos(String nombreproducto, String precioProducto, String descripcionProducto, String stockProducto, Categorias nombrecategoria, Marcas nombremarca) {
        Nombreproducto = nombreproducto;
        PrecioProducto = precioProducto;
        DescripcionProducto = descripcionProducto;
        StockProducto = stockProducto;
        this.nombrecategoria = nombrecategoria;
        this.nombremarca = nombremarca;
    }

    public String getNombreproducto() {
        return Nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        Nombreproducto = nombreproducto;
    }

    public String getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        PrecioProducto = precioProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        DescripcionProducto = descripcionProducto;
    }

    public String getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(String stockProducto) {
        StockProducto = stockProducto;
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
        return "*** Info Usuarios ***\n" +
                "\t Nombre: " + this.getNombreproducto() + "\n" +
                "\t Correo: " + this.getPrecioProducto() + "\n" +
                "\t Pass: " + this.getDescripcionProducto() + "\n" +
                "\t RUT: " + this.getStockProducto() + "\n" +
                "\t Categoria: " + this.getNombrecategoria() + "\n" +
                "\t Marca: " + this.getNombremarca() + "\n" +
                "*** Fin Info Usuarios ***";
    }
}
