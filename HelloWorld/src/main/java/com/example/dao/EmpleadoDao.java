package com.example.dao;

import org.springframework.stereotype.Repository;

import com.example.entidades.Empleado;

@Repository
public class EmpleadoDao {

	public Empleado getEmpleado(Long nroDocumento) {
		
		return new Empleado("el nombre", nroDocumento);
	}

	public Empleado findBy(Long nroDocumento) {
		
		return nroDocumento==123 ? this.getEmpleado(123L) : null;
	}
}
