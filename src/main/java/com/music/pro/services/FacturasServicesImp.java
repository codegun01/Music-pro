/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.dao.FacturasDao;
import com.music.pro.domain.Facturas;
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
public class FacturasServicesImp implements FacturasServices{
    
    
    @Autowired
    FacturasDao facturasDao;
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Facturas> listarFacturas() {
        return (List<Facturas>) facturasDao.findAll();
    }

    @Override
    @Transactional
    public Facturas guardarFacturas(Facturas factura) {
        return facturasDao.save(factura);
    }

    @Override
    @Transactional
    public void eliminarFacturas(Facturas factura) {
        facturasDao.delete(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Facturas> buscarFacturas(Long id) {
        return facturasDao.findById(id);
    }

    @Override
    @Transactional
    public void eliminarFacturas1(Long id) {
        Facturas factura = entityManager.find(Facturas.class, id);
        entityManager.remove(factura);
    }
    
}
