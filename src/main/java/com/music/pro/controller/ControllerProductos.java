
package com.music.pro.controller;


import com.music.pro.domain.Productos;
import com.music.pro.services.ProductosServices;
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
public class ControllerProductos {
    
    
    @Autowired
    private ProductosServices productoServices;
    
    @GetMapping("/productos")
    public List<Productos> listarProducto(){
        return productoServices.listarProductos();
    }
    
    
    @PostMapping("/productos")
    public Productos agregarProductos(@RequestBody Productos productos){
        return productoServices.guardarProductos(productos);
    }
    
    
    @DeleteMapping("/productos/{id}")
    public void eliminarProductos(@PathVariable Long id){
        productoServices.eliminarProductos1(id);
    }
    
}
