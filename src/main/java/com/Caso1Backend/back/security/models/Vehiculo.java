package com.Caso1Backend.back.security.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author corin
 */
//crear
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private double precio;
    private String descripcion_vehiculo;
    private int numero_chasis;
    private int numero_motor;
    private Date anio_fabricacion;
    private String ramv;
    private String stock;
    private int garantia;

    public Vehiculo(String placa, String modelo, String marca, String color, double precio, String descripcion_vehiculo, int numero_chasis, int numero_motor, Date anio_fabricacion, String ramv, String stock, int garantia) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.descripcion_vehiculo = descripcion_vehiculo;
        this.numero_chasis = numero_chasis;
        this.numero_motor = numero_motor;
        this.anio_fabricacion = anio_fabricacion;
        this.ramv = ramv;
        this.stock = stock;
        this.garantia = garantia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion_vehiculo() {
        return descripcion_vehiculo;
    }

    public void setDescripcion_vehiculo(String descripcion_vehiculo) {
        this.descripcion_vehiculo = descripcion_vehiculo;
    }

    public int getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(int numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public int getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(int numero_motor) {
        this.numero_motor = numero_motor;
    }

    public Date getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(Date anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getRamv() {
        return ramv;
    }

    public void setRamv(String ramv) {
        this.ramv = ramv;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
      
}
