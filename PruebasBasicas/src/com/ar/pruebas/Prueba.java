package com.ar.pruebas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("Comenzando...");

		System.out.println(String.format("%1$6s", "1").replace(' ', '0'));
		System.out.println(String.format("%06d", 22));
		
		TimeZone tz = TimeZone.getTimeZone("GMT-3:00");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss'-0300'");
		df.setTimeZone(tz);
		System.out.println(df.format(new Date()));

		
		try {
			System.out.println("Dentro del try...");
			Objeto objeto = new Objeto();
			objeto.tirarException();
			System.out.println("Sigue el try...");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}