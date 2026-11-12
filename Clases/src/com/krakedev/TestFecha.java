package com.krakedev;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        System.out.println("=== ANTES DE ASIGNAR ===");
        System.out.println("Día: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());

        f1.setDia(1);
        f1.setMes(4);
        f1.setAnio(2026);

        System.out.println("=== DESPUÉS DE ASIGNAR ===");
        System.out.println("Día: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());
    }
}
