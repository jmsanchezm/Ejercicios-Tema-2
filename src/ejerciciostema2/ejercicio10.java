package ejerciciostema2;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
				//Declaramos variables, donde se guardarán los datos introducidos.
				int num1;
				int num2;
				int num3;
				int result;//Se guardará como resultado de la suma de num1 y num2.
				//Creamos el Scanner
				Scanner read = new Scanner (System.in);
				//Solicitamos al usuario tres números.
				System.out.println("Introduzca un número: ");
				num1=read.nextInt();
				System.out.println("Introduzca un número: ");
				num2=read.nextInt();
				System.out.println("Introduzca un número: ");
				num3=read.nextInt();
				//Sumamos los dos primeros números.
				result = num1 + num2;
				/*Utilizando un if/else, ponemos la condición de que si la suma de num1 y num2 es igual a 
				num3, se muestre que la suma de los dos primeros es igual a num3.*/
				if(result==num3 ) {
					System.out.println("La suma de los dos primeros números anteriormente introducidos es igual a " + num3);
				}else {//Por el contrario, se mostrará el valor real de la suma de dichos números.
					System.out.println("La suma de los dos primeros números anteriormente introducidos es igual a " + result);
				}
				//Finalmente, cerramos el Scanner.
				read.close();
				
	
	}

}
