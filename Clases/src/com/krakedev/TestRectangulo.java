package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Rectangulo r1 = new Rectangulo();
	        r1.altura = 5;
	        r1.base = 4;

	        int area1 = r1.calcularArea();
	        double perimetro1 = r1.calcularPerimetro();

	        System.out.println("RECTANGULO 1");
	        System.out.println("Base: " + r1.base);
	        System.out.println("Altura: " + r1.altura);
	        System.out.println("Area: " + area1);
	        System.out.println("Perimetro: " + perimetro1);

	        Rectangulo r2 = new Rectangulo();
	        r2.altura = 8;
	        r2.base = 2;

	        int area2 = r2.calcularArea();
	        double perimetro2 = r2.calcularPerimetro();

	        System.out.println("RECTANGULO 2");
	        System.out.println("Base: " + r2.base);
	        System.out.println("Altura: " + r2.altura);
	        System.out.println("Area: " + area2);
	        System.out.println("Perimetro: " + perimetro2);
	    }
	}