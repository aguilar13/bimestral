/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@Entity
@RestController
public class ControladorTarjeta {
    @Autowired RepositorioTarjeta repos;
    
    @RequestMapping(value="/tarjetas/{tipo}/{saldo}/{fecha_corte}",
            method=RequestMethod.POST,headers ={"accept=application/json"})
            
    public Tarjeta guardar(@PathVariable String tipo,@PathVariable Float saldo,@PathVariable Date fecha_corte){  
        return repos.save(new Tarjeta(tipo,saldo,fecha_corte));
}
    @RequestMapping(value="/tarjeta/{id}/{tipo}/{saldo}/{fecha_corte}/{cliente}",
            method=RequestMethod.PUT,headers ={"accept=application/json"})
            
    public Tarjeta guardar(@PathVariable Long id,@PathVariable String tipo,@PathVariable Float saldo,@PathVariable Date fechacorte,Long cliente){  
        return repos.save(new Tarjeta(id,tipo,saldo,fechacorte,cliente));
    }
    
     @RequestMapping(value="/tarjetas/{id}",
            method=RequestMethod.DELETE,headers ={"accept=application/json"})
            
    public Estatus guardar(@PathVariable Long id){
        repos.delete(new Tarjeta (id));
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        return estatus;
        
        
    }
     @RequestMapping(value="/tarjetas/{id}",
            method=RequestMethod.GET,
            headers ={"accept=application/json"})
            public Tarjeta buscarPorid(@PathVariable Long id){
                return repos.findOne(id);
            }
             @RequestMapping(value="/tarjetas",
            method=RequestMethod.GET,
            headers ={"accept=application/json"})
            public ArrayList<Tarjeta> buscarTodos(){
                return(ArrayList<Tarjeta>)repos.findAll();
}
}

    

