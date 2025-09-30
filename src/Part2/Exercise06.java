package Part2;

import java.util.Scanner;

public class Exercise06 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double milimetros;
	double centimetros;
	double metros;
	double total;
	System.out.print("Introduce una medida en milimetros: ");
	milimetros = sc.nextDouble();
	System.out.print("Introduce una medida en centimetros: ");
	centimetros = sc.nextDouble();
	System.out.print("Introduce una medida en metros: ");
	metros = sc.nextDouble();
	milimetros = milimetros / 10;
	metros = metros*100;
	total = centimetros + milimetros + metros;
	System.out.print("La suma de todos en centimetros es: " + total); 
	sc.close();
}
}
