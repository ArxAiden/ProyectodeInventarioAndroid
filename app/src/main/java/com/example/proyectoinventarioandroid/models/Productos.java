package com.example.proyectoinventarioandroid.models;

public class Productos {
    private String Nombreproducto;
    private String PrecioProducto;
    private String DescripcionProducto;
    private String StockProducto;

    public Productos(String nombreproducto, String precioProducto, String descripcionProducto, String stockProducto) {
        Nombreproducto = nombreproducto;
        PrecioProducto = precioProducto;
        DescripcionProducto = descripcionProducto;
        StockProducto = stockProducto;
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


}
