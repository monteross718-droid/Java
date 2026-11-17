package com.krakedev;

public class Mensajeria {
	
	private String nombre;
	private String apodo;

	public void saludar() {
		
		System.out.println("Hola como estan");
	}
	
	public void saludarPersona(String nombre, String apodo) {
		
		System.out.println("Hola: "+ nombre +"Tu apodo es:" + apodo);
	}
	
	public Mensajeria(String nombre, String apodo) {
				
		this.nombre = nombre;
		this.apodo = apodo; 
		
	}
}
