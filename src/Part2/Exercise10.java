package Part2;

import java.util.Scanner;

public class Exercise10 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int año;
	int siglo;
	System.out.print("Introduce un año: ");
	año = sc.nextInt();
	 siglo = (año / 100) + 1;
	 System.out.print("Eso es el siglo: " + siglo);
	 sc.close();
	
}
}