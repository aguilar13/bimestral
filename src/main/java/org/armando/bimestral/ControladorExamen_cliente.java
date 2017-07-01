/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import java.util.ArrayList;
import static javafx.scene.input.KeyCode.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
public class ControladorExamen_cliente {
    @Autowired RepositorioCliente rep;
}

@RequestMapping(value="/cliente/{nombre}/",
            method=RequestMethod.POST,headers ={"accept=application/json"})

    public Cliente guardar(@PathVariable String nombre){
        return rep.save(new Cliente(nombre);
}
    @RequestMapping(value="/cliente/{id}/{nombre}/",
            method=RequestMethod.PUT,headers ={"accept=application/json"})
            
    public Cliente guardar(@PathVariable Long id,@PathVariable Integer nombre){
        return repo.save(new Cliente(id,nombre);
    }
    
     @RequestMapping(value="/cliente/{id}",
            method=RequestMethod.DELETE,headers ={"accept=application/json"})
            
    public Estatus guardar(@PathVariable Long id){
        repo.delete(new Cliente(id));
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        return estatus;
        
        
    }
     
}

