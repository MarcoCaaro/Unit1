package unit1;

import java.util.Scanner;

public class Exercise02 {
public static void main(String[] args) {
	int edad;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduzca su edad: ");
	edad = sc.nextInt();
	System.out.println("Su edad es: " + edad + " años");
	edad= edad + 1;
	System.out.println("Eso significa que el año que viene tendrás: " + edad);
	sc.close();
	
}
}
