package com.example.entidades;

public class Empleado {
	private String nombre;
	private Long nroDocumento;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, Long nroDocumento) {
		this.nombre = nombre;
		this.nroDocumento = nroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(Long nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
}
