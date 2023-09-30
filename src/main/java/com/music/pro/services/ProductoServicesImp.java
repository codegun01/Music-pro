/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.dao.ProductosDao;
import com.music.pro.domain.Productos;
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
public class ProductoServicesImp implements ProductosServices{
    
    
    @Autowired
    ProductosDao productoDao;
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Productos> listarProductos() {
        return (List<Productos>) productoDao.findAll();
    }

    @Override
    @Transactional
    public Productos guardarProductos(Productos producto) {
       return  productoDao.save(producto);
    }

    @Override
    @Transactional
    public void eliminarProductos(Productos producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Productos> buscarProducto(Long id) {
        return productoDao.findById(id);
    }

    @Override
    @Transactional
    public void eliminarProductos1(Long id) {
        Productos producto = entityManager.find(Productos.class, id);
        entityManager.remove(producto);
    }
    
}
