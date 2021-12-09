/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.service;


import com.Caso1Backend.back.security.enums.RolNombre;
import com.Caso1Backend.back.security.models.Rol;
import com.Caso1Backend.back.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
