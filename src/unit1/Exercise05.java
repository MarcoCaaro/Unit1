package unit1;

import java.util.Scanner;

public class Exercise05 {
public static void main(String[] args) {
	double radio;
	double longitud;
	double area;
	Scanner sc = new Scanner (System.in);
	System.out.print("Para calcular la longitud y el área de una circunferencia introduce su radio: ");
	radio = sc.nextDouble();
	longitud = 2*Math.PI*radio;
	area = Math.PI*(radio*radio);
	System.out.println("La longitud de la circunferencia es de " + longitud + "cm");
	System.out.println("El área de la circunferencia es de " + area + "cm cuadrados");
	sc.close();
}
}
