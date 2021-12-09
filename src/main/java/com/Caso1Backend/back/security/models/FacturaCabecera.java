package com.Caso1Backend.back.security.models;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class FacturaCabecera {

    private int id_factura;
    private String tipo;
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public FacturaCabecera() {
    }

    public FacturaCabecera(String tipo, Date fecha, Cliente cliente) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
}
