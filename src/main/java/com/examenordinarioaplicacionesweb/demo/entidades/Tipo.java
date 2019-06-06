package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="Tipos")

public class Tipo {

    @Id
    @Column(name = "id_Tipo")
    private String id;
    @Column(name="tipo_animal")
    private String tipo;
    /* @OneToOne
        @JoinColumn(name="id_animal")
        private TipoUsuario idtipousuario;
        @Column(name="administrador")
        private boolean administrador;*/
}
