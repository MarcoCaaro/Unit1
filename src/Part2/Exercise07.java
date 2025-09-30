package Part2;

import java.util.Scanner;

public class Exercise07 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double numEntradaInfantil;
	double precioEntradaInf = 15.5;
	double numEntradaAdulto;
	double precioEntradaAdu = 20;
	double numEntradas;
	double ImporteTotal;
	System.out.print("Introduce el numero de entradas infantiles que vas a comprar: ");
	numEntradaInfantil = sc.nextDouble();
	System.out.print("Introduce el numero de entradas de adulto que vas a comprar: ");
	numEntradaAdulto = sc.nextDouble();
	ImporteTotal = (numEntradaInfantil*precioEntradaInf) + (numEntradaAdulto*precioEntradaAdu);
	ImporteTotal = ImporteTotal>=100 ? ImporteTotal + ImporteTotal/100 : ImporteTotal;
	System.out.print("El total de las entradas es de: " + ImporteTotal);
}
}
