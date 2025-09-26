package unit1;

import java.util.Scanner;

public class Exercise07 {
public static void main(String[] args) {
	//Nombre a Introducir
	String nombre; 
	//Direccion a introducir
	String direccion;
	//Número a introducir
	String telefono;
	//Abrimos el Scanner
	Scanner sc = new Scanner (System.in);	
	//Pedimos que introduzca el nombre
	System.out.print("Introduce tu nombre: ");
	nombre = sc.nextLine();
	//Pedimos que introduzca la direccion
	System.out.print("Introduce tu direccion: ");
	direccion = sc.nextLine();
	//Pedimos que introduzca el numero de tlfno
	System.out.print("Introduce tu numero de teléfono: ");
	telefono = sc.nextLine();
	System.out.println("Nombre: " + nombre);
	System.out.println("Dirección: " + direccion);
	System.out.println("Teléfono: " + telefono);
	sc.close();
	
	
}
}
