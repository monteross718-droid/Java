package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {
	
	public static void main(String[] args) {

        // Cuenta 1: constructor con ID
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        // Cuenta 2: constructor completo
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        // Cuenta 3: constructor con ID
        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        // Mostrar valores iniciales
        System.out.println("-------- Valores Iniciales ---------");

        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
        Cuenta cuenta4 = new Cuenta("03477");
        Cuenta cuenta5 = new Cuenta("03478", "C", 1200);
        Cuenta cuenta6 = new Cuenta("03479", "A", 500);

        System.out.println("=== CUENTAS ADICIONALES ===");

        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
	
}
