package com.Caso1Backend.back.security.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
///zxl,cz
public class FacturaCuerpo {

    private int id_cuerpo;
    private double subtotal;
    private int iva;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_factura")
    private FacturaCabecera facturaCabecera;

    @ManyToOne
    @JoinColumn(name = "placa")
    private Vehiculo vehiculo;

    public FacturaCuerpo() {
    }

    public FacturaCuerpo(double subtotal, int iva, Double total, FacturaCabecera facturaCabecera, Vehiculo vehiculo) {
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.facturaCabecera = facturaCabecera;
        this.vehiculo = vehiculo;
    }

    public int getId_cuerpo() {
        return id_cuerpo;
    }

    public void setId_cuerpo(int id_cuerpo) {
        this.id_cuerpo = id_cuerpo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public FacturaCabecera getFacturaCabecera() {
        return facturaCabecera;
    }

    public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
        this.facturaCabecera = facturaCabecera;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    




}
