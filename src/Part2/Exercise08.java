package Part2;

import java.util.Scanner;

public class Exercise08 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner (System.in);
	//Declaramos las variables
	double lonCentimetros;
	double lonMetros;
	//Pedimos la longitud en metros    
	System.out.print("Introduce la longitud en metros del lanzamiento: ");
	//Hacemos que el scanner recoja la informacion
	lonMetros = sc.nextDouble();
	//Hacemos la conversion de metros a centimetros
	lonCentimetros = lonMetros * 100;
	//Imprimimos la longitud en centimetros
	System.out.print("La longitud en centimetros será de: " + lonCentimetros);
	//Cerramos el Scanner
	sc.close();
}
}
