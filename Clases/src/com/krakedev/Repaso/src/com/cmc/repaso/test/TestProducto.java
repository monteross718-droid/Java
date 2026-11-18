package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Producto producto1 = new Producto("Cuaderno", 10);

	producto1.setPrecio(-20);
	System.out.println("Producto: " + producto1.getNombre());
	System.out.println("Precio corregido: " + producto1.getPrecio());
	System.out.println("Precio con 10% de descuento: " + producto1.calcularPrecioPromo(10));

	Producto producto2 = new Producto("Mochila", 40);
	producto2.setPrecio(40);
	System.out.println("Producto: " + producto2.getNombre());
	System.out.println("Precio: " + producto2.getPrecio());
	System.out.println("Precio con 15% de descuento: " + producto2.calcularPrecioPromo(15));
	}

}
