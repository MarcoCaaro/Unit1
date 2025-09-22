package unit1;

import java.util.Scanner;

public class Exercise06 {
public static void main(String[] args) {
	double n1;
	double n2;
	double suma;
	double resta;
	double multiplicacion;
	double division;
	Scanner sc = new Scanner (System.in);
	System.out.print("Introduce tu primer número: " );
	n1 = sc.nextDouble();
	System.out.print("Introduce tu segundo número: " );
	n2 = sc.nextDouble();
	suma = n1 + n2;
	System.out.println("La suma de tus dos número es: " + suma);
	resta = n1 - n2;
	System.out.println("La resta de tus dos número es: " + resta);
	multiplicacion = n1 * n2;
	System.out.println("La multiplicacion de tus dos número es: " + multiplicacion);
	division = n1 / n2;
	System.out.println("La division de tus dos número es: " + division);
	sc.close();
	
}
}
