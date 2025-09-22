package unit1;

import java.util.Scanner;

public class Exercise03 {
public static void main(String[] args) {
	int año;
	int añonac;
	int edad;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduzca en que año estamos: ");
	año = sc.nextInt();
	System.out.println("Ahora introduzca su año de nacimiento: ");
	añonac = sc.nextInt();
	edad = año - añonac;
	System.out.println("Su edad es " + edad + " años.");
	sc.close();
	
	
	
	
}	
}
