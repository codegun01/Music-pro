
package com.music.pro.controller;

import com.music.pro.domain.Clientes;
import com.music.pro.services.ClienteServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */

@RestController
@RequestMapping("/api")
public class ControllerClientes {
    
    @Autowired
    private ClienteServices clienteServices;
    
    @GetMapping("/clientes")
    public List<Clientes> listarClientes(){
        return clienteServices.listarClientes();
    }
    
    
    @PostMapping("/clientes")
    public Clientes agregarCientes(@RequestBody Clientes clientes){
        return clienteServices.guardarClientes(clientes);
    }
    
    
    @DeleteMapping("/clientes/{id}")
    public void elimnarCliente(@PathVariable Long id){
        
        clienteServices.eliminarClientes1(id);
        
    }
    
}
