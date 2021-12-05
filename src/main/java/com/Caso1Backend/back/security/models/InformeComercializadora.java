/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author corin
 */
@Entity
public class InformeComercializadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_informe;
    private String contenido;
   
    
}
