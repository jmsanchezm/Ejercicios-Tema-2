package ejerciciostema2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
				//Declaramos variables.
				int num1;//Se guardará el primer número introducido por el usuario.
				int num2;/*Se guardará el segundo número introducido por el usuario,
				el cuál será igual o diferente al anterior.*/
				//Creamos el Scanner.
				Scanner read= new Scanner(System.in);
				//Solicitamos al usuario un número.
				System.out.println("Introduzca un número: ");
				//Obligamos al Scanner leer lo introducido por el usuario.
				num1=read.nextInt();
				//Solicitamos otro número al usuario, este puede ser el mismo o distinto al anterior.
				System.out.println("Introduzca otro número: ");
				//Obligamos al Scanner leer lo introducido por el usuario.
				num2 =read.nextInt();
				//Utilizamos un if/else, para que se cumpla una condición, si no se cumple nos devolverá una respuesta diferente.
				if (num1==num2) {
					System.out.println("Los números introducidos son iguales.");
				}else { 
				//Le mostramos en pantalla al usuario el resultado.
				System.out.println("Los números introducidos son diferentes.");
				//Cerramos el Scanner.
				read.close();
				}
	}
}

