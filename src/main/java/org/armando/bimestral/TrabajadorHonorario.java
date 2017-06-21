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
public class TrabajadorHonorario extends Trabajador implements Nomina {
    private float isr;
    private float iva;
    @Override
    public String pagarNomina(){
        return "Nomina del trabajador por honorarios pagada";
    }

    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
}
