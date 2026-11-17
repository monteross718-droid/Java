package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
	
	public static void main(String[] args) {


	Producto p1 = new Producto(101, "Computadora");
	
	System.out.println("Código: " + p1.getCodigo());
	System.out.println("Nombre: " + p1.getNombre());
	
	}
}