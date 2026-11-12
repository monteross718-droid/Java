package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		  Rectangulo r1 = new Rectangulo();

        System.out.println("=== r1: ANTES DE ASIGNAR ===");
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        System.out.println("=== r1: DESPUÉS DE ASIGNAR ===");
	        r1.setAltura(5);
	        r1.setBase(4);

	        int area1 = r1.calcularArea();
	        double perimetro1 = r1.calcularPerimetro();

	        System.out.println("RECTANGULO 1");
	        System.out.println("Base: " + r1.getBase());
	        System.out.println("Altura: " + r1.getAltura());
	        System.out.println("Area: " + area1);
	        System.out.println("Perimetro: " + perimetro1);

	        Rectangulo r2 = new Rectangulo();

        System.out.println("=== r2: ANTES DE ASIGNAR ===");
        System.out.println("Base: " + r2.getBase());
        System.out.println("Altura: " + r2.getAltura());
        System.out.println("Área: " + r2.calcularArea());
        System.out.println("Perímetro: " + r2.calcularPerimetro());
        System.out.println("=== r2: DESPUÉS DE ASIGNAR ===");
	        r2.setAltura(8);
	        r2.setBase(2);

	        int area2 = r2.calcularArea();
	        double perimetro2 = r2.calcularPerimetro();

	        System.out.println("RECTANGULO 2");
	        System.out.println("Base: " + r2.getBase());
	        System.out.println("Altura: " + r2.getAltura());
	        System.out.println("Area: " + area2);
	        System.out.println("Perimetro: " + perimetro2);
	    }
	}