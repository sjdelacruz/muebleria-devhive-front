package com.muebleria_devhive.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mueble {
	
    private Integer id;
	
    private String nombre;

    private String direccion;
   
    private String antiguedad;
    
    private Integer habitaciones;
    
    private Boolean estufa;
    
    private Boolean banios;
    
    private Boolean estacionamiento;
    
    private Integer capacidad;
    
    private Date fechaalta;
    
    private Date fechamodificacion;
}
