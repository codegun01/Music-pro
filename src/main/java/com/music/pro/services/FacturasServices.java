/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.domain.Facturas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonza
 */
public interface FacturasServices{
    
    
    public List<Facturas> listarFacturas();
    
    public Facturas guardarFacturas(Facturas factura);
    
    public void eliminarFacturas(Facturas factura);
    
    public Optional<Facturas> buscarFacturas(Long id);
    
    public void eliminarFacturas1(Long id);
    
}
