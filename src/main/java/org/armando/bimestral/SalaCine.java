/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author T-
 */
@Entity
@Table(name="salacine")
public class SalaCine {
    @Id
    @Column(name="id_sala")
    private Long id;

    @Override
    public String toString() {
        return "SalaCine{" + "id=" + id + ", titulo=" + titulo + ", clasificacion=" + clasificacion + ", asientos=" + asientos + '}';
    }

    public SalaCine() {
    }

    public SalaCine(String titulo, String clasificacion, Integer asientos) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.asientos = asientos;
    }
    @Column (name="titulo_pelicula")
    private String titulo;
    @Column(name="clasificacion")
    private String clasificacion;
    @Column (name="mum_asientos")
    private Integer asientos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }

}