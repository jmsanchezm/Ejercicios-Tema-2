package ejerciciostema2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
				//Declaramos variables.
				int num; // Se guardará el número introducido por el usuario.
				int resto; // Se guardará la cifra que dé el resultado del módulo.
				//Creamos el Scanner.
				Scanner read=  new Scanner (System.in);
				//Solicitamos al usuario un número.
				System.out.print("Introduzca un número: ");
				//Obligamos al Scanner leer el teclado.
				num = read.nextInt();
				//Calculamos el módulo del número introducido.
				resto = num %2;
				/*Mediante if/else, ponemos la condición de si, el módulo me da 0, me 
				devuelva que el número es par, de lo contrario impar.*/
				if (resto == 0){
					System.out.println("El número introducido es par");
				}else {
					System.out.println("El número introducido es impar");
				}
				//Cerramos el Scanner.
				read.close();



	}

}
