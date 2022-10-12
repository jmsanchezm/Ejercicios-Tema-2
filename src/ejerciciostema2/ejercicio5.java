package ejerciciostema2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		//Declaramos variables.
				int num1; // Se guardará el primer número introducido.
				int num2; //Se guardará el segundo número introducido.
				int num3; //Se guardará el tercer número introducido.
				//Creamos Scanner.
				Scanner read = new Scanner (System.in);
				//Solicitamos al usuario un número.
				System.out.print("Introduzca un número: ");
				//Ordenamos al Scanner leer el teclado.
				num1=read.nextInt();
				//Solicitamos otro número al usuario.
				System.out.print("Introduzca un número: ");
				//Ordenamos al Scanner leer el teclado.
				num2=read.nextInt();
				//Solicitamos al usuario un tercer número.
				System.out.print("Introduzca un número: ");
				//Ordenamos al Scanner leer el teclado.
				num3=read.nextInt();
				//Utilizamos if para hacer el número de combinaciones posibles.
				if ( num1>num2 && num2>num3 ) { 
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num1 + ", "+ num2 +" , " +num3);
				}else if (num2>num1 && num1>num3) {
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num2 + ", "+ num1 +" , " +num3);
				}else if (num3>num1 && num1>num2) {
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num3 + ", "+ num1 +" , " +num2);
				}else if (num2>num3 && num3>num1) {
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num2 + ", "+ num3+" , " +num1);
				}else if (num3>num2&&num2>num1) {
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num3 + ", "+ num2+" , " +num1);
				}else if (num1>num3&&num3>num2) {
					//En el caso de que se cumpla esta condición se le mostrará lo siguiente al usuario
					System.out.println(num1 + ", "+ num3+" , " +num2);
				}
				//Finalmente, cerramos el Scanner.
				read.close();
	}

}
