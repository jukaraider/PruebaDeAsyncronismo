package com.example.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entidades.Empleado;
import com.example.entidades.Greeting;
import com.example.services.EmpleadoService;

@RestController
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadoService;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/empleado/{nroDoc}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Empleado getEmpleado(@PathVariable("nroDoc") Long nroDoc) {
		return empleadoService.getEmpleado(nroDoc);
	}

	@RequestMapping(value = "/empleado/{nroDoc}", method = RequestMethod.POST)
	public ResponseEntity<?> update(@PathVariable("nroDoc") Long nroDoc) {

		Empleado empleadoModificado = empleadoService.updateEmpleado(new Empleado("Empleado " + nroDoc.toString(), nroDoc));

		if (empleadoModificado == null) {
			return new ResponseEntity("Empleado no encontrado", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Empleado>(empleadoModificado, HttpStatus.OK);
	}
}