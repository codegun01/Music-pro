/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.dao.DetallesDao;
import com.music.pro.domain.Detalles;
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
public class DetallesServicesImp implements DetallesServices{
    
    @Autowired
    DetallesDao detalleDao;
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Detalles> listarDetalles() {
        return (List<Detalles>) detalleDao.findAll();
    }

    @Override
    @Transactional
    public Detalles guardarDetalles(Detalles detalle) {
        return detalleDao.save(detalle);
    }

    @Override
    @Transactional
    public void eliminarDetalles(Detalles detalle) {
        detalleDao.delete(detalle);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<Detalles> buscarDetalle(Long id) {
        return detalleDao.findById(id);
    }

    @Override
    @Transactional
    public void eliminarDetalle1(Long id) {
        Detalles detalle = entityManager.find(Detalles.class, id);
        entityManager.remove(detalle);
    }
    
}
