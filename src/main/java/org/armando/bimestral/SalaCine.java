/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

/**
 *
 * @author T-
 */
public class SalaCine {
    private Integer id_sala;
    private String titulopelicula;
    private String clasificacion;
    private Integer num_asientos;

    public SalaCine(Integer id_sala, String titulopelicula, String clasificacion, Integer num_asientos) {
        this.id_sala = id_sala;
        this.titulopelicula = titulopelicula;
        this.clasificacion = clasificacion;
        this.num_asientos = num_asientos;
    }

    public SalaCine() {
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public void setId_sala(Integer id_sala) {
        this.id_sala = id_sala;
    }

    public String getTitulopelicula() {
        return titulopelicula;
    }

    public void setTitulopelicula(String titulopelicula) {
        this.titulopelicula = titulopelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(Integer num_asientos) {
        this.num_asientos = num_asientos;
    }
    
}
