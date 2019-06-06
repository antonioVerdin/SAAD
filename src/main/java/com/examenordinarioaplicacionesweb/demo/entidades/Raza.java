package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="Razas")

public class Raza {


    @Id
    @Column(name = "id_raza")
    private int id;
    @Column(name="raza")
    private String raza;

/*
        @OneToOne
        @JoinColumn(name="id_animal")
        private TipoUsuario idtipousuario;
        @Column(name="administrador")
        private boolean administrador;
*/

}
