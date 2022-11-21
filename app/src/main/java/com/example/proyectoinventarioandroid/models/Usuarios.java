package com.example.proyectoinventarioandroid.models;

public class Usuarios {
    private String rutusuario;
    private String nombreusuario;
    private String correousuario;
    private String passusuario;


    public Usuarios(String nombreusuario, String correousuario, String passusuario, String rutusuario) {
        this.nombreusuario = nombreusuario;
        this.correousuario = correousuario;
        this.passusuario = passusuario;
        this.rutusuario = rutusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getPassusuario() {
        return passusuario;
    }

    public void setPassusuario(String passusuario) {
        this.passusuario = passusuario;
    }

    public String getRutusuario() {
        return rutusuario;
    }

    public void setRutusuario(String rutusuario) {
        this.rutusuario = rutusuario;
    }

    public String infoUsuarios(){
        return "*** Info Usuarios ***\n" +
                "\t Nombre: " + this.getNombreusuario() + "\n" +
                "\t Correo: " + this.getCorreousuario() + "\n" +
                "\t Pass: " + this.getPassusuario() + "\n" +
                "\t RUT: " + this.getRutusuario() + "\n" +
                "*** Fin Info Usuarios ***";
    }
}
