package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public void imprimir() {
        System.out.println("Producto: " + nombre);
        System.out.println("Productos actuales: " + productosActuales);
        System.out.println("Productos devueltos: " + productosDevueltos);
        System.out.println("Productos vendidos: " + productosVendidos);
    }

    public void vender(int cantidad) {
        productosActuales -= cantidad;
        productosVendidos += cantidad;
    }

    public void devolver(int cantidad) {
        productosActuales += cantidad;
        productosVendidos -= cantidad;
        productosDevueltos += cantidad;
    }
}
