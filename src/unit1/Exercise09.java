package unit1;

import java.util.Scanner;

public class Exercise09 {
public static void main(String[] args) {
	int edad;
	boolean mayoredad; 
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca su edad: ");
	edad = sc.nextInt();
	mayoredad = edad >= 18;
	System.out.print("Es usted mayor de edad? " + mayoredad);
	
			
}
}
