package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// Declarar las tres variables de tipo Plato
        Plato platoA;
        Plato platoB;
        Plato platoC;

        // Crear los tres objetos
        platoA = new Plato();
        platoB = new Plato();
        platoC = new Plato();

        // Mostrar valores por defecto
        System.out.println("=== ANTES DE ASIGNAR ===");

        System.out.println("Plato A");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: " + platoA.getPrecio());
        System.out.println("Disponible: " + platoA.isDisponible());

        System.out.println("\nPlato B");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: " + platoB.getPrecio());
        System.out.println("Disponible: " + platoB.isDisponible());

        System.out.println("\nPlato C");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: " + platoC.getPrecio());
        System.out.println("Disponible: " + platoC.isDisponible());

        // Asignar datos a cada plato
        platoA.setNombre("Ensalada");
        platoA.setTipo("Entrada");
        platoA.setPrecio(3.50f);
        platoA.setDisponible(true);

        platoB.setNombre("Pollo a la plancha");
        platoB.setTipo("Plato fuerte");
        platoB.setPrecio(8.50f);
        platoB.setDisponible(true);

        platoC.setNombre("Pastel de chocolate");
        platoC.setTipo("Postre");
        platoC.setPrecio(4.25f);
        platoC.setDisponible(false);

        // Mostrar los valores asignados
        System.out.println("\n=== DESPUÉS DE ASIGNAR ===");

        System.out.println("Plato A");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: " + platoA.getPrecio());
        System.out.println("Disponible: " + platoA.isDisponible());

        System.out.println("\nPlato B");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: " + platoB.getPrecio());
        System.out.println("Disponible: " + platoB.isDisponible());

        System.out.println("\nPlato C");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: " + platoC.getPrecio());
        System.out.println("Disponible: " + platoC.isDisponible());
	}

}
