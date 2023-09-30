/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.controller;

import com.music.pro.domain.Usuarios;
import com.music.pro.services.UsuarioServices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */

@RestController
@RequestMapping("/api")
public class ControllerUsuario {
    
    @Autowired
    private UsuarioServices usuarioServices;
    
    @GetMapping("/usuario")
    public List<Usuarios> listarUsuario(){
        return usuarioServices.listarUsuarios();
    }
    
    @PostMapping("/usuario")
    public Usuarios guardarUsuario(@RequestBody Usuarios usuarios){
        return usuarioServices.guardadUsuarios(usuarios);
        
    }
    
    @PutMapping("/usuario")
    public Usuarios editarUsuario(@RequestBody Usuarios usuarios){
        Usuarios usuario1 = null;
        if(usuarios.getIdUsuario() == null){
            return new Usuarios();
        }
        
        Optional<Usuarios> usuariosSV = usuarioServices.encontrarUsuario(usuarios.getIdUsuario());
        
        if(usuariosSV.get().getIdUsuario() != null){
            usuario1 = usuarioServices.guardadUsuarios(usuarios);
        }
        
        return usuario1;
    }
    
    
    @DeleteMapping("/usuario/{id}")
    public void eliminarUsuario (@PathVariable Long id){
        usuarioServices.eliminarUsuario1(id);
    }
    
}
