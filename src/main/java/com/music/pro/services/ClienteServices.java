/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.domain.Clientes;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonza
 */
public interface ClienteServices {
    
    public List<Clientes> listarClientes();
    
    public Clientes guardarClientes(Clientes cliente);
    
    public void eliminarClientes(Clientes cliente);
    
    public Optional<Clientes> bucarClientes(Long id);
    
    public void eliminarClientes1(Long id);
}
