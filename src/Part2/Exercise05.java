package Part2;

import java.util.Scanner;

public class Exercise05 {
public static void main(String[] args) {
	//Inciamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos las variables
	long segundos;
	long minutos;
	long horas;
	System.out.print("Introduce un numero aleatorio de segundos: ");
	segundos = sc.nextLong();
	minutos = (segundos%60) / 60;
	horas = (minutos%60) / 60;
	System.out.print("Eso son: " + horas + " h " + minutos + " min y " + segundos + " segundos");
	sc.close();
	
}
}
