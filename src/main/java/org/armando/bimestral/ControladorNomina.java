/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
public class ControladorNomina {
    
    @Autowired ServicioNomina servicio;
    
    //ponemos el metodo get
    @RequestMapping(value="/nomina",method = RequestMethod.GET, headers={"Accept=text/html"})
    
    public String obtenerNomina(){
        return servicio.servicioPagarNomina().pagarNomina();
    }
    
}
