package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);

        System.out.println("\nPlato B");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);

        System.out.println("\nPlato C");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);

        // Asignar datos a cada plato
        platoA.nombre = "Ensalada";
        platoA.tipo = "Entrada";
        platoA.precio = 3.50f;
        platoA.disponible = true;

        platoB.nombre = "Pollo a la plancha";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 8.50f;
        platoB.disponible = true;

        platoC.nombre = "Pastel de chocolate";
        platoC.tipo = "Postre";
        platoC.precio = 4.25f;
        platoC.disponible = false;

        // Mostrar los valores asignados
        System.out.println("\n=== DESPUÉS DE ASIGNAR ===");

        System.out.println("Plato A");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);

        System.out.println("\nPlato B");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);

        System.out.println("\nPlato C");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);
	}

}
