package unit1;

import java.util.Scanner;

public class Exercise08 {
public static void main(String[] args) {
	String nombre;
	int edad;
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca su nombre: ");
	nombre = sc.nextLine();
	System.out.print("Introduzca su edad: ");
	edad = sc.nextInt();
	System.out.print("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	sc.close();
}	
}
