package com.examenordinarioaplicacionesweb.demo.modelos;

import lombok.Data;

import java.util.Date;

@Data
public class modeloAnimal {

    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaAdopcion;

}
