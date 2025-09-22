package unit1;

import java.util.Scanner;

public class Exercise04 {
public static void main(String[] args) {
	double media1;
	double media2;
    double suma;
	Scanner sc = new Scanner (System.in);
	System.out.println("Escriba su primera nota: ");
	media1 = sc.nextDouble();
	System.out.println("Ahora escriba su segunda nota: ");
	media2 = sc.nextDouble();
	suma = (media1 + media2) / 2;
	System.out.println("Su media aritmética resultante será de: " + suma);
	sc.close();
}
}
