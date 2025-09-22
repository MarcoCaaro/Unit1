package unit1;

import java.io.Reader;
import java.util.Scanner;

public class Exercise01 {
public static void main(String[] args) {
	int numero;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduzca un número:");
	numero = sc.nextInt();
	System.out.print("Su número es: " + numero);
	sc.close();
	
}
}
