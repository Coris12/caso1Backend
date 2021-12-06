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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author corin
 */
//crear del vehiculo 
@Entity
public class SolicitudGarantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_garantia;
    private int tiempo;
    private int motivo;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
   
    public int getId_garantia() {
        return id_garantia;
    }

    public void setId_garantia(int id_garantia) {
        this.id_garantia = id_garantia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getMotivo() {
        return motivo;
    }

    public void setMotivo(int motivo) {
        this.motivo = motivo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
