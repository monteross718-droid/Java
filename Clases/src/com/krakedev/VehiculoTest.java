package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
			  

		        Vehiculo v = new Vehiculo();

		        System.out.println("=== Vehículo 1: valores iniciales ===");
		        System.out.println("Año: " + v.getAnio());
		        System.out.println("Marca: " + v.getMarca());
		        System.out.println("Modelo: " + v.getModelo());
		        System.out.println("Valor: " + v.getValor());

		        v.setAnio("2012");
		        v.setMarca("Chevrolet");
		        v.setModelo("Nuevo");
		        v.setValor(12000);

		        System.out.println("=== Vehículo 1: valores asignados ===");
		        System.out.println("Año: " + v.getAnio());
		        System.out.println("Marca: " + v.getMarca());
		        System.out.println("Modelo: " + v.getModelo());
		        System.out.println("Valor: " + v.getValor());

		        Vehiculo v2 = new Vehiculo();

		        System.out.println("=== Vehículo 2: valores iniciales ===");
		        System.out.println("Año: " + v2.getAnio());
		        System.out.println("Marca: " + v2.getMarca());
		        System.out.println("Modelo: " + v2.getModelo());
		        System.out.println("Valor: " + v2.getValor());

		        v2.setAnio("2026");
		        v2.setMarca("Chevrolet");
		        v2.setModelo("El más rápido");
		        v2.setValor(25000);

		        System.out.println("=== Vehículo 2: valores asignados ===");
		        System.out.println("Año: " + v2.getAnio());
		        System.out.println("Marca: " + v2.getMarca());
		        System.out.println("Modelo: " + v2.getModelo());
		        System.out.println("Valor: " + v2.getValor());
		        

		    	
	 			System.out.println("=== Vehículo 3: valores asignados ===");
	
				Vehiculo v3 = new Vehiculo("Toyota");
				
			
			    System.out.println("Año: " + v3.getAnio());
			    System.out.println("Marca: " + v3.getMarca());
			    System.out.println("Modelo: " + v3.getModelo());
			    
			    
			    System.out.println("=== Vehículo 4: valores asignados ===");
				
				Vehiculo v4 = new Vehiculo("Toyota", "El mas chevere","2011");
				
			
			   
			    System.out.println("Marca: " + v4.getMarca());
			    System.out.println("Modelo: " + v4.getModelo());
			    System.out.println("Año: " + v4.getAnio());
			}
			    
		}
