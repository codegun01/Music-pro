/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.music.pro.dao;

import com.music.pro.domain.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gonza
 */
public interface UsuarioDao extends CrudRepository<Usuarios, Long>{
    
}
