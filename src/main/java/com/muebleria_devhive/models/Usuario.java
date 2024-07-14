package com.muebleria_devhive.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario{

    private Integer idusuario;
    
    private String usuario;
    
    private String contrasenia;
    
    private Persona persona;
}
