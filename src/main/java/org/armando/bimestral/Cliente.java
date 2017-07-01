/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author T-
 */
@Entity
public class Cliente {
    
    @Id
    @Autowired
    
    private Long id;
    private String nombre;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public Cliente(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente() {
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
 
    
    
}
