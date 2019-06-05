package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="Razas")

public class Raza {

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
