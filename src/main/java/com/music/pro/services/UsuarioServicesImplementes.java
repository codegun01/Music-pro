/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.dao.UsuarioDao;
import com.music.pro.domain.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gonza
 */

@Service
public class UsuarioServicesImplementes implements UsuarioServices{
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> listarUsuarios() {
        return (List<Usuarios>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public Usuarios guardadUsuarios(Usuarios usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Usuarios usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuarios> encontrarUsuario(Long id) {
        return usuarioDao.findById(id);
    }

    @Override
    @Transactional
    public void eliminarUsuario1(Long id) {
        Usuarios usuarios = entityManager.find(Usuarios.class, id);
        entityManager.remove(usuarios);
    }
    
}
