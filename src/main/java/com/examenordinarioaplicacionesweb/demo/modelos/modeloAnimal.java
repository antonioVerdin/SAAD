package com.examenordinarioaplicacionesweb.demo.modelos;

import lombok.Data;


@Data
public class modeloAnimal {

    private int id;
    private String nombre;
    private String fechaNacimiento;
    private String fechaAdopcion;
    private String url;
    private String raza;
    private String tipo;

}
