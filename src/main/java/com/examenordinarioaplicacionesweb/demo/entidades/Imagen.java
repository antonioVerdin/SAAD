package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Imagenes")

public class Imagen {

    @Id
    @Column(name = "id_imagen")
    private int id;
    @Column(name="url_de_imagen")
    private String url;



/*
        @OneToOne
        @JoinColumn(name="id_animal")
        private TipoUsuario idtipousuario;
        @Column(name="administrador")
        private boolean administrador;
*/

}
