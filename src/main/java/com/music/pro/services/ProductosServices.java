/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.domain.Productos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonza
 */
public interface ProductosServices {
    
    public List<Productos> listarProductos();
    
    
    public Productos guardarProductos(Productos producto);
    
    
    public void eliminarProductos(Productos producto);
    
    public Optional<Productos> buscarProducto(Long id);
    
    public void eliminarProductos1(Long id);
    
    
}
