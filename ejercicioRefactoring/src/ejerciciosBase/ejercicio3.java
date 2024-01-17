package ejerciciosBase;

import java.util.Scanner;

/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos
	menores a uno leído por teclado que no sean divisibles entre otro también leído de
	igual forma
 * */

public class ejercicio3 {
	public static void main(String[] args) {
	int n, entre;
	Scanner sc = new Scanner(System.in);		System.out.println("Introduce un número:");
	n = sc.nextInt();
	System.out.println("Introduce el divisor:");		entre = sc.nextInt();
		for (int i = 1; i <= n; i++) 
			if (i % entre != 0) {
				System.out.println(i);
		}
	}
}