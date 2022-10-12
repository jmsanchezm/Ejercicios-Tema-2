package ejerciciostema2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
				//Declaramos variables.
				double numDecimal;//Se guardará el número introducido por el usuario.
				//Creamos el Scanner.
				Scanner read = new Scanner (System.in);
				//Solicitamos al usuario un número con decimales.
				System.out.println("Introduzca un número con decimales: ");
				//Ordenamos al Scanner a que lea lo introducido por el teclado.
				numDecimal = read.nextDouble();
				/*Utilizando if/else, ponemos la condición de que para que el número 
				comprendido en el intervalo (-1,1), responderá con un "el número se acerca a cero. */
				if (numDecimal<1 && -1<numDecimal && numDecimal !=0) {
					System.out.println("El número introducido se acerca a CERO.");
				}else {
					System.out.println("El número introducido NO se acerca a cero.");
				}
				//Finalmente, cerramos el Scanner. 
				read.close();

	}

}
