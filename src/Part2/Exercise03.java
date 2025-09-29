package Part2;

import java.util.Scanner;

public class Exercise03 {
public static void main(String[] args) {
	//Iniciamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos la variable de los numeros enteros
	int num;
	int num2;
	//Imprimimos el numero
	System.out.println("Introduzca dos números enteros: ");
	num = sc.nextInt();
	num2 = sc.nextInt();
	num = (num%num2) == 0 ? 0 : num2 - num % num2;    
	System.out.println("Debes sumarle " + num + " al primer numero para que sea multiplo de " + num2);
	sc.close();
}
}
