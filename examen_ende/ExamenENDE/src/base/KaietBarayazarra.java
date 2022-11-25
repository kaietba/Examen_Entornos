package base;

import java.util.Scanner;

public class KaietBarayazarra {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int secreto = (int) (Math.random() * 10);
		int intentos = 0;
		do {
			System.out.println("Adivina un n�mero entero entre 0 y 9 (incluidos): ");
			numero = input.nextInt();
			intentos = intentos + 1;
		} while (numero != secreto);

		System.out.println("�Acertaste tras " + intentos + " intentos!");

	}
}
