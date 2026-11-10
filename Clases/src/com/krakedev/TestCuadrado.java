package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Cuadrado c1 = new Cuadrado();
	        c1.lado = 4;

	        double area1 = c1.calcularArea();
	        double perimetro1 = c1.calcularPerimetro();

	        System.out.println("CUADRADO 1");
	        System.out.println("Lado: " + c1.lado);
	        System.out.println("Area: " + area1);
	        System.out.println("Perimetro: " + perimetro1);

	        Cuadrado c2 = new Cuadrado();
	        c2.lado = 3;

	        double area2 = c2.calcularArea();
	        double perimetro2 = c2.calcularPerimetro();

	        System.out.println("CUADRADO 2");
	        System.out.println("Lado: " + c2.lado);
	        System.out.println("Area: " + area2);
	        System.out.println("Perimetro: " + perimetro2);

	        Cuadrado c3 = new Cuadrado();
	        c3.lado = 5.5;

	        double area3 = c3.calcularArea();
	        double perimetro3 = c3.calcularPerimetro();

	        System.out.println("CUADRADO 3");
	        System.out.println("Lado: " + c3.lado);
	        System.out.println("Area: " + area3);
	        System.out.println("Perimetro: " + perimetro3);
	    }

}
