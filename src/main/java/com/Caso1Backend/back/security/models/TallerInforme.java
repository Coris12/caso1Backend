package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tallerInforme")
public class TallerInforme {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id_InformeTaller;
private Integer id_cliente;
private String placa;
private String Descripcion;

public TallerInforme() {

}
public TallerInforme(Integer id_InformeTaller, Integer id_cliente, String placa,
		String descripcion) {
	super();
	this.id_InformeTaller = id_InformeTaller;
	this.id_cliente = id_cliente;
	this.placa = placa;
	Descripcion = descripcion;
}
public Integer getId_InformeTaller() {
	return id_InformeTaller;
}
public void setId_InformeTaller(Integer id_InformeTaller) {
	this.id_InformeTaller = id_InformeTaller;
}

public Integer getId_cliente() {
	return id_cliente;
}
public void setId_cliente(Integer id_cliente) {
	this.id_cliente = id_cliente;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}


}
