package ejerciciostema2;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
			//Declaramos la variable donde se guardará el número introducido.
			int nota;
			//Creamos el Scanner
			Scanner read=new Scanner (System.in);
			//Solicitamos al usuario una nota.
			System.out.println("Introduzca la nota del alumno: ");
			//Ordenamos al Scanner leer el teclado.
			nota =read.nextInt();
			/*Utilizando un if/else, ponemos la condición de que si el número se 
			encuentra en determinados intervalos, muestre un resultado u otro.*/
			if (nota>=0 && nota<=4) {
				System.out.println("INSUFICIENTE");
			}else if (nota>=5 && nota<6) {
				System.out.println("SUFICIENTE");
			}else if (nota>=6 && nota<7) {
				System.out.println("BIEN");
			}else if (nota>=7 && nota<9) {
				System.out.println("NOTABLE");
			}else if (nota>=9 && nota<=10) {
				System.out.println("SOBRESALIENTE");
			}
			//Finalmente, cerramos el Scanner.
			read.close();
	}

}
