package unit1;

import java.util.Scanner;

public class Exercise11 {
public static void main(String[] args) {
	double pesetas;
	double euros = 1;
	Scanner sc = new Scanner (System.in);
	System.out.print("Introduzca un numero aleatorio de pesetas: " );
	pesetas = sc.nextDouble();
	euros = pesetas + 166.386;
	System.out.print("Eso son " + euros + " euros");
}
}
