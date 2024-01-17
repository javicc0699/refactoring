package ejerciciosRefactorizados;

import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
		
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca numero de filas: ");
		numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			for (int j = numero - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
