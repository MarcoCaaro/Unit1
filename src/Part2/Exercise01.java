package Part2;

import java.util.Scanner;

public class Exercise01 {
public static void main(String[] args) {
	//Declaramos la variable del numero a introducir
	double num;
	//Inicializamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Imprimimos el numero a introducir
	System.out.print("Introduce un numero para ser redondeado: ");
	//Lo recogemos el en scanner
	num = sc.nextDouble(); 
	//Sumamos al valor 0.5
	num = (int) (num + 0.5);
	//Imprimimos el resultado
	System.out.print("Tu numero redondeado es: " + num);
	sc.close();
}
}
