package unit1;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		double pesetas;
		double euros;
		double pesetaseuros;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero aleatorio de pesetas: ");
		euros = sc.nextDouble();
		pesetaseuros = euros / 166;
		System.out.print("Eso son " + pesetaseuros + " euros");
		sc.close();
	}
}
