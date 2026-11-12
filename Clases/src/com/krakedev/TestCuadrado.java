package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		 Cuadrado c1 = new Cuadrado();

        System.out.println("=== c1: ANTES DE ASIGNAR ===");
        System.out.println("Lado: " + c1.getLado());
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());
        System.out.println("=== c1: DESPUÉS DE ASIGNAR ===");
	        c1.setLado(4);

	        double area1 = c1.calcularArea();
	        double perimetro1 = c1.calcularPerimetro();

	        System.out.println("CUADRADO 1");
	        System.out.println("Lado: " + c1.getLado());
	        System.out.println("Area: " + area1);
	        System.out.println("Perimetro: " + perimetro1);

	        Cuadrado c2 = new Cuadrado();

        System.out.println("=== c2: ANTES DE ASIGNAR ===");
        System.out.println("Lado: " + c2.getLado());
        System.out.println("Área: " + c2.calcularArea());
        System.out.println("Perímetro: " + c2.calcularPerimetro());
        System.out.println("=== c2: DESPUÉS DE ASIGNAR ===");
	        c2.setLado(3);

	        double area2 = c2.calcularArea();
	        double perimetro2 = c2.calcularPerimetro();

	        System.out.println("CUADRADO 2");
	        System.out.println("Lado: " + c2.getLado());
	        System.out.println("Area: " + area2);
	        System.out.println("Perimetro: " + perimetro2);

	        Cuadrado c3 = new Cuadrado();

        System.out.println("=== c3: ANTES DE ASIGNAR ===");
        System.out.println("Lado: " + c3.getLado());
        System.out.println("Área: " + c3.calcularArea());
        System.out.println("Perímetro: " + c3.calcularPerimetro());
        System.out.println("=== c3: DESPUÉS DE ASIGNAR ===");
	        c3.setLado(5.5);

	        double area3 = c3.calcularArea();
	        double perimetro3 = c3.calcularPerimetro();

	        System.out.println("CUADRADO 3");
	        System.out.println("Lado: " + c3.getLado());
	        System.out.println("Area: " + area3);
	        System.out.println("Perimetro: " + perimetro3);
	    }

}
