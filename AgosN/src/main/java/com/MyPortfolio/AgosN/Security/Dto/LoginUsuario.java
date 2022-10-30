package com.MyPortfolio.AgosN.Security.Dto;

import javax.validation.constraints.NotNull;


public class LoginUsuario {
    @NotNull
    private String nombreUsuario;
    @NotNull
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
