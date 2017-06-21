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
public class TrabajadorPlanta extends Trabajador implements Nomina{
    private float sueldoBase;
    
    @Override
    public String pagarNomina() {
        
        return "Se pago la nomina de trabajador de planta";
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    }
    

