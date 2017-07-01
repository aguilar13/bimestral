/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author T-
 */
@Entity
public class Tarjeta {
    
     @Id
 
    @GeneratedValue
    private Long id;
     
     private String tipo;
     private Float saldo;
     private Date fechacorte;
     private Long cliente;

    Tarjeta(String tipo, Float saldo, Date fecha_corte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", tipo=" + tipo + ", saldo=" + saldo + ", fechacorte=" + fechacorte + ", cliente=" + cliente + '}';
    }

    public Tarjeta(Long id, String tipo, Float saldo, Date fechacorte, Long cliente) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechacorte = fechacorte;
        this.cliente = cliente;
    }

    public Tarjeta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Date getFechacorte() {
        return fechacorte;
    }

    public void setFechacorte(Date fechacorte) {
        this.fechacorte = fechacorte;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }
     
    
    
}
