package Part2;

import java.util.Scanner;

public class Exercise09 {
public static void main(String[] args) {
	// Creamos el scanner
    Scanner sc = new Scanner(System.in);
    
    // Declaramos la variable del numero de problema como entero
    int problema;
    // Declaramos la variable del volumen del problema como entero
    int volumen;
    
    // Pedimos que se introduzca el numero de problema
    System.out.println("Introduce el numero de problema");
    // Escaneamos el numero y lo guardamos en la variable problema
    problema = sc.nextInt();
    
    // Calculamos el numero de volumen quitando los dos primeros digitos a la derecha
    volumen = problema / 100;
    
    // Imprimimos en pantalla el numero de volumen
    System.out.println("El numero de volumen es: " + volumen);
    
    // Cerramos el scanner
    sc.close();
}
}

