package Part2;

import java.util.Scanner;

public class Exercise06 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos las variables de tipo Double
	double milimetros;
	double centimetros;
	double metros;
	double total;
	//Imprimimos y pedimos la medida en milimetros
	System.out.print("Introduce una medida en milimetros: ");
	//La recogemos en el scanner
	milimetros = sc.nextDouble();
	//Imprimimos y pedimos la medida en centimetros
	System.out.print("Introduce una medida en centimetros: ");
	//La recogemos en el Scanner
	centimetros = sc.nextDouble();
	//Imprimimos y pedimos la medida en metros
	System.out.print("Introduce una medida en metros: ");
	//La recogemos en el Scanner
	metros = sc.nextDouble();
	//Damos valor a los milimetros
	milimetros = milimetros / 10;
	//Damos valor a los metros
	metros = metros*100;
	//Damos valor al total
	total = centimetros + milimetros + metros;
	//Imprimimos el total
	System.out.print("La suma de todos en centimetros es: " + total); 
	//cerramos el Scanner
	sc.close();
}
}
