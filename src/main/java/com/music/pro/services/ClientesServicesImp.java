/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.music.pro.services;

import com.music.pro.dao.ClientesDao;
import com.music.pro.domain.Clientes;
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
public class ClientesServicesImp implements ClienteServices {
    
    @Autowired
    ClientesDao clienteDao;
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Clientes> listarClientes() {
        return (List<Clientes>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public Clientes guardarClientes(Clientes cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminarClientes(Clientes cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Clientes> bucarClientes(Long id) {
        return clienteDao.findById(id);
    }

    @Override
    @Transactional
    public void eliminarClientes1(Long id) {
        Clientes cliente = entityManager.find(Clientes.class, id);
        entityManager.remove(cliente);
    }
    
}
