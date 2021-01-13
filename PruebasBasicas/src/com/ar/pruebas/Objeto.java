package com.ar.pruebas;

import java.io.FileNotFoundException;

public class Objeto {

	public void tirarException() throws FileNotFoundException {
		
		System.out.println("En Objeto.tirarException() ...");
		throw new FileNotFoundException("No se encontro el archivo");
	}
}