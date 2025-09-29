package Part2;

import java.util.Scanner;

public class Exercise02 {
public static void main(String[] args) {
	//Iniciamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos la variable del numero entero
	int num;
	//Imprimimos el numero
	System.out.println("Introduzca un número entero: ");
	num = sc.nextInt();
	num = (num%7) == 0 ? 0 : 7 - num % 7;    
	System.out.println("Debes sumarle " + num + " para que sea multiplo de 7.");
	sc.close();
}
}
