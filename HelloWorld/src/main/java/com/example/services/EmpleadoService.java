package com.example.services;

import com.example.entidades.Empleado;

public interface EmpleadoService {

	public Empleado getEmpleado(Long nroDocumento);
	
	public Empleado updateEmpleado(Empleado empleado);
}
