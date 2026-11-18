package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Estudiante estudiante1 = new Estudiante("Ana");
	     estudiante1.calificar(7.5);

	     Estudiante estudiante2 = new Estudiante("Luis");
	     estudiante2.calificar(8);

	     System.out.println("Estudiante: " + estudiante1.getNombre());
	     System.out.println("Nota: " + estudiante1.getNota());
	     System.out.println("Resultado: " + estudiante1.getResultado());

	     System.out.println("Estudiante: " + estudiante2.getNombre());
	     System.out.println("Nota: " + estudiante2.getNota());
	     System.out.println("Resultado: " + estudiante2.getResultado());
	}

}
