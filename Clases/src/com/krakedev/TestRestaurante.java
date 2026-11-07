package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("Restaurante 1: crear lugar");
		System.out.println("nombre: "+ rest1.nombre);
		System.out.println("direccion: "+ rest1.direccion);
		System.out.println("calificacion: "+ rest1.calificacion);
		
		System.out.println("Restaurante 1: Asignar datos");
		
		rest1.nombre = "Luciano";
		rest1.direccion = "Rocafuerte y Mariana de la Torre";
		rest1.calificacion = 10;
		
		System.out.println("nombre: "+ rest1.nombre);
		System.out.println("direccion: "+ rest1.direccion);
		System.out.println("calificacion: "+ rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("Restaurante 2: crear lugar");
		System.out.println("nombre: "+ rest2.nombre);
		System.out.println("direccion: "+ rest2.direccion);
		System.out.println("calificacion: "+ rest2.calificacion);
		
		System.out.println("Restaurante 2: Asignar datos");
		
		rest2.nombre = "La Casa de Fernando";
		rest2.direccion = "Azcasubi y Vivar";
		rest2.calificacion = 8.5f;
		
		System.out.println("nombre: "+ rest2.nombre);
		System.out.println("direccion: "+ rest2.direccion);
		System.out.println("calificacion: "+ rest2.calificacion);

	}

}
