package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Animales")

public class Animal {

        @Id
        @Column(name = "id_animal")
        private String id;

        @Column(name = "nombre")
        private String nombre;

        @Column(name="fecha_nacimiento")
        private String fechaNacimiento;

        @Column(name="fecha_adopcion")
        private String fechaAdopcion;

        @OneToOne(fetch = FetchType.EAGER) // Evitar errores
        @JoinColumn(name="id_imagen")
        private Imagen imagen;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="id_raza")
        private Raza raza;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="id_tipo")
        private Tipo tipo;


}
