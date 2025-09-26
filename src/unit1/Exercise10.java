package unit1;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		int numero;
		boolean numeroPar;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero ");
		numero = sc.nextInt();
		numeroPar = numero % 2 == 0;
		System.out.print("Su numero es par? " + numeroPar);

		sc.close();
	}
}
