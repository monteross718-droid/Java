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
		    }
		}
