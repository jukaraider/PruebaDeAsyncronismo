package com.example.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmpleadoDao;
import com.example.entidades.Empleado;
import com.example.services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public Empleado getEmpleado(Long nroDocumento) {
		return empleadoDao.getEmpleado(nroDocumento);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		Empleado elEmpleado = empleadoDao.findBy(empleado.getNroDocumento());
		
		if (elEmpleado != null) {
			elEmpleado.setNombre("el nuevo nombre");
		}
			
		return elEmpleado;
	}
	
	
}
