package ejerciciostema2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
				//Declaramos variables.
				int num1;//Se guardará un número introducido por el usuario.
				int num2;//Se guardará un número introducido por el usuario.
				//Creamos el Scanner.
				Scanner read= new Scanner ( System.in);
				//Solicitamos al usuario un número.
				System.out.print("Introduzca un número: ");
				//Ordenamos al Scanner que lea el teclado
				num1= read.nextInt();
				//Solicitamos al usuario otro número.
				System.out.println("Introduzca otra número: ");
				//Ordenamos al Scanner que lea el teclado
				num2 = read.nextInt();
				//Ponemos la condición de que si num1 es mayor que num2, se ordene de tal manera, si no, de lo contrario.
				if(num1>num2) {
					System.out.println("Se ordenan de la siguiente manera: " + num2 + " , " + num1);
				}else {
					System.out.println("Se ordenan de la siguiente manera: " + num1 + " , " + num2);
				}
				//Finalmente, cerramos el Scanner.
				read.close();

	}

}
