package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("Restaurante 1: crear lugar");
		System.out.println("nombre: "+ rest1.getNombre());
		System.out.println("direccion: "+ rest1.getDireccion());
		System.out.println("calificacion: "+ rest1.getCalificacion());
		
		System.out.println("Restaurante 1: Asignar datos");
		
		rest1.setNombre("Luciano");
		rest1.setDireccion("Rocafuerte y Mariana de la Torre");
		rest1.setCalificacion(10);
		
		System.out.println("nombre: "+ rest1.getNombre());
		System.out.println("direccion: "+ rest1.getDireccion());
		System.out.println("calificacion: "+ rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("Restaurante 2: crear lugar");
		System.out.println("nombre: "+ rest2.getNombre());
		System.out.println("direccion: "+ rest2.getDireccion());
		System.out.println("calificacion: "+ rest2.getCalificacion());
		
		System.out.println("Restaurante 2: Asignar datos");
		
		rest2.setNombre("La Casa de Fernando");
		rest2.setDireccion("Azcasubi y Vivar");
		rest2.setCalificacion(8.5f);
		
		System.out.println("nombre: "+ rest2.getNombre());
		System.out.println("direccion: "+ rest2.getDireccion());
		System.out.println("calificacion: "+ rest2.getCalificacion());

	}

}
