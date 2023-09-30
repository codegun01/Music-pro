/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.domain.Usuarios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonza
 */
public interface UsuarioServices {
    
    public List<Usuarios> listarUsuarios();
    
    public Usuarios guardadUsuarios(Usuarios usuario);
    
    public void eliminarUsuario (Usuarios usuario);
    
    public Optional<Usuarios> encontrarUsuario(Long id);

    public void eliminarUsuario1(Long id);
    
    
}
