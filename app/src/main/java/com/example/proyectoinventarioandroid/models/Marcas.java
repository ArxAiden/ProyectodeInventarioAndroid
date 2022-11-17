package com.example.proyectoinventarioandroid.models;

public class Marcas {
    private String nombremarca;
    private String descripcionmarca;

    public Marcas(String nombremarca, String descripcionmarca) {
        this.nombremarca = nombremarca;
        this.descripcionmarca = descripcionmarca;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getDescripcionmarca() {
        return descripcionmarca;
    }

    public void setDescripcionmarca(String descripcionmarca) {
        this.descripcionmarca = descripcionmarca;
    }

    public String infoMarca(){
        return "*** Info Marcas ***\n" +
                "\t Nombre: " + this.getNombremarca() + "\n" +
                "\t Descripcion: " + this.getDescripcionmarca() + "\n" +
                "*** Fin Info Marcas ***";
    }
}
