package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="Animales")

public class Animal {

        @Id
        @Column(name = "id_animal")
        private String idAnimal;
        @Column(name = "nombre")
        private String nombre;
        @Column(name="fecha_nacimiento")
        private String fechaNacimiento;
        @Column(name="fecha_adopcion")
        private String fechaAdopcion;
/*
        @OneToOne
        @JoinColumn(name="id_animal")
        private TipoUsuario idtipousuario;
        @Column(name="administrador")
        private boolean administrador;
*/

}
