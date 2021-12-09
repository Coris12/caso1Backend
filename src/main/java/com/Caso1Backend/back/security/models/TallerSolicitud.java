package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tallerSolicitud")
public class TallerSolicitud {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id_solicitud;
private Integer id_cliente;
private String placa;
private String repuestos;
private String descripcion;


public TallerSolicitud() {
	
}
public TallerSolicitud(Integer id_solicitud, Integer id_cliente, String placa, String repuestos, String descripcion) {
	super();
	this.id_solicitud = id_solicitud;
	this.id_cliente = id_cliente;
	this.placa = placa;
	this.repuestos = repuestos;
	this.descripcion = descripcion;
}
public Integer getId_solicitud() {
	return id_solicitud;
}
public void setId_solicitud(Integer id_solicitud) {
	this.id_solicitud = id_solicitud;
}
public Integer getId_cliente() {
	return id_cliente;
}
public void setId_Cliente(Integer id_cliente) {
	this.id_cliente = id_cliente;
}

public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getRepuestos() {
	return repuestos;
}
public void setRepuestos(String repuestos) {
	this.repuestos = repuestos;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



}
