package ejerciciostema2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//Declaramos variables.
				int numIntr; //Se guardará el número introducido.
				//Creamos el Scanner.
				Scanner read = new Scanner (System.in);
				// Solicitamos al usuario un número comprendido entre 0 y 99.999.
				System.out.print("Introduzca un número de 0 al 99.999:");
				//Ordenamos la Scanner que lea el teclado.
				numIntr= read.nextInt();
				/*Ponemos la condición de que el número está comprendido entre esas
				cifras se muestre que es de una, dos, tres, cuatro o cinco cifras*/
				if (numIntr>= 0 && numIntr <=9) {
					System.out.println("El número introducido es de una cifra.");
				}else if (numIntr>= 10 && numIntr <=99) {
					System.out.println("El número introducido es de dos cifras.");
				}else if (numIntr>= 100 && numIntr <=999) {
					System.out.println("El número introducido es de tres cifras.");
				}else if (numIntr>= 1000 && numIntr <=9999) {
					System.out.println("El número introducido es de cuatro cifras.");
				}else if (numIntr>= 10000 && numIntr <=99999) {
					System.out.println("El número introducido es de cinco cifras.");
				}
				//Finalmente, cerramos el Scanner.
				read.close();

	}

}
