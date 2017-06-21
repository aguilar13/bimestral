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
public class Trabajador {
    private Long id;
    private String nombre;
    private Integer HorasLaboradas;

    public Trabajador() {
    }

    public Trabajador(Long id, String nombre, Integer HorasLaboradas) {
        this.id = id;
        this.nombre = nombre;
        this.HorasLaboradas = HorasLaboradas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorasLaboradas() {
        return HorasLaboradas;
    }

    public void setHorasLaboradas(Integer HorasLaboradas) {
        this.HorasLaboradas = HorasLaboradas;
    }
}
