package com.MyPortfolio.AgosN.Security.Controller;


public class Mensaje {
    private String Mensaje;

    
    //CONSTRUCTORES
    public Mensaje() {
    }

    //GETTERS Y SETTERS
    
    public Mensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
}
