package com.example.proyectoinventarioandroid.models;

import java.util.Date;

public class Ordenes {
    private String codorden;
    private Date fechaorden;
    private Productos nombreproducto;
    private Usuarios nombreusuario;

    public Ordenes(String nombreorden, Date fechaorden, Productos nombreproducto, Usuarios nombreusuario) {
        this.codorden = nombreorden;
        this.fechaorden = fechaorden;
        this.nombreproducto = nombreproducto;
        this.nombreusuario = nombreusuario;
    }

    public String getCodorden() {
        return codorden;
    }

    public void setCodorden(String codorden) {
        this.codorden = codorden;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }

    public Productos getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(Productos nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Usuarios getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(Usuarios nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String infoMarca(){
        return "*** Info Ordenes ***\n" +
                "\t Codigo: " + this.getCodorden() + "\n" +
                "\t Fecha: " + this.getFechaorden() + "\n" +
                "\t Producto: " + this.getNombreproducto() + "\n" +
                "\t Orden autorizada por: " + this.getNombreusuario() + "\n" +

                "*** Fin Info Ordenes ***";
    }
}
