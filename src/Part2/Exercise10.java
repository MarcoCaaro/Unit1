package Part2;

import java.util.Scanner;

public class Exercise10 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos las variable enteras
	int año;
	int siglo;
	//Imprimimos el año
	System.out.print("Introduce un año: ");
	//Recogemos en el Scanner el dato
	año = sc.nextInt();
	//Damos valor a la variable siglo
	 siglo = (año / 100) + 1;
	 //Imprimimos el resultado
	 System.out.print("Eso es el siglo: " + siglo);
	 //Cerramos el Scanner
	 sc.close();
	
}
}