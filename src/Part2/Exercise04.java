package Part2;

import java.util.Scanner;

public class Exercise04 {
public static void main(String[] args) {
	//Iniciamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos las variables
	double a;
	double b;
	double c;
	double x;
	double y;
	//Pedimos que imprima los diferentes valores
	System.out.println("Introduzca los valores de a, b ,c y X para calcular un valor de Y (y=ax2+bx+c): ");
	//Recoge los valores en el Scanner
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	x = sc.nextDouble();
	//Damos Valor a Y
	y = a*(x*x)+b*x+c;
	//Imprimimos el valor de Y en funcion de los valores introducidos
	System.out.println("El valor de Y es: " + y);
	//Cerramos el Scanner
	sc.close();
	
}
}
