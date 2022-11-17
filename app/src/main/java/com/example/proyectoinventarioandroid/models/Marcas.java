package com.example.proyectoinventarioandroid.models;

public class Marcas {
    private String codmarca;
    private String nombremarca;
    private String descripcionmarca;

    public Marcas(String codmarca, String nombremarca, String descripcionmarca) {
        this.codmarca = codmarca;
        this.nombremarca = nombremarca;
        this.descripcionmarca = descripcionmarca;
    }

    public String getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(String codmarca) {
        this.codmarca = codmarca;
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
                "\t Codigo: " + this.getNombremarca() + "\n" +
                "\t Nombre: " + this.getNombremarca() + "\n" +
                "\t Descripcion: " + this.getDescripcionmarca() + "\n" +
                "*** Fin Info Marcas ***";
    }
}
