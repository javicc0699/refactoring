package ejerciciosBase;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número: ");
		n = sc.nextInt();

		int p = 0, imp = 0;

		for (int i = 1; n > i; i++) {
			if (i % 2 == 0) {
				p += i;
			} else {
				imp += i;
			}
		}

		System.out.println("Sumatorio par de " + n + ": " + p);
		System.out.println("Sumatorio impar de " + n + ": " + imp);
		
		int mp = 1, mimp = 1;

		for (int i = 1; n > i; i++) {
			if (i % 2 == 0) {
				mp *= i;
			} else {
				mimp *= i;
			}
		}
		
		System.out.println("Multiplicacion par de " + n + ": " + mp);
		System.out.println("Multiplicacion impar de " + n + ": " + mimp);

		sc.close();

	}

}
