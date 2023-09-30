/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.domain.Detalles;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonza
 */
public interface DetallesServices {
    
    public List<Detalles> listarDetalles();
    
    public Detalles guardarDetalles(Detalles detalle);
    
    
    public void eliminarDetalles(Detalles detalle);
    
    public Optional<Detalles> buscarDetalle(Long id);
    
    public void eliminarDetalle1(Long id);
    
}
