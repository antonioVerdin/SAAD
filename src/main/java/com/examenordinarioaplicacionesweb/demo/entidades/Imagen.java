package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="Imagenes")

public class Imagen {

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
