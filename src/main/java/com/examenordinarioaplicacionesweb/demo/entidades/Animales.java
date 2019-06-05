package com.examenordinarioaplicacionesweb.demo.entidades;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="materiales")

public class Animales {




//
        @Id
        @Column(name="idAnimales")
        private int idAnimales;

        @Column(name="nombre",nullable = false)
        private String nombre;

        @Column(name="fechanacimiento",nullable = false)
        private String fechanacimiento;

        @Column(name="cantidad",nullable = false)
        private int cantidad;
        @Column(name="modelo",nullable = false)
        private String modelo;
        @OneToOne
        @JoinColumn(name="id_tipoMaterial",nullable = false)
        private TipoMaterial tipoMaterial;
        @Column(name="ram")
        private int ram;
        @Column(name="procesador")
        private String procesador;
        @Column(name="capacidad")
        private int capacidad;
        @Column(name="SOperativo")
        private String sOperativo;
        @Column(name="tipo_Uso",nullable = false)
        private int tipoUso;
        @Column(name="estado_material",nullable = false)
        private int estadoMaterial;

        @ManyToMany(mappedBy = "materiales")
        private Set<Solicitante> solicitante;
}
