package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  	Item item1 = new Item();
	        item1.setNombre("Cuadernos");
	        item1.setProductosActuales(20);

	        System.out.println("=== ITEM 1: INICIAL ===");
	        item1.imprimir();
	        item1.vender(5);
	        item1.devolver(2);
	        System.out.println("=== ITEM 1: FINAL ===");
	        item1.imprimir();

	        Item item2 = new Item();
	        item2.setNombre("Lapiceros");
	        item2.setProductosActuales(20);

	        System.out.println("=== ITEM 2: INICIAL ===");
	        item2.imprimir();
	        item2.vender(8);
	        item2.devolver(3);
	        System.out.println("=== ITEM 2: FINAL ===");
	        item2.imprimir();
	}

}
